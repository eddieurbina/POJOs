package com.eduardourbina;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringChains {
    /*
    *   Given an array of words representing your dictionary, you test each word to see if it can
    *   be made into another word in the dictionary. This will be done by removing succesive cha-
    *   racters. Each word represents its own first element of its string chain, so start with a
    *   length of 1. Each time you remove a character, increment your string chain by one. In or-
    *   der to remove a character, the resulting word must be in you original dictionary. Your  -
    *   goal is to determine the longest string chain achievable for a given dictionary.
    * */

    public static void main(String[] args) {
        String[] dictionary = {"a", "and", "an", "bear"};

        System.out.println(maxChainLength(dictionary));
    }

    public static int maxChainLength(String[] dictionary) {
        int maxChainLength = 0;
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        HashSet<String> wordsHashSet = new HashSet<>(Arrays.asList(dictionary));
        if (dictionary.length <= 0 || dictionary == null) {
            return 0;
        }
        for(String searchWord : dictionary){
            if(maxChainLength > searchWord.length()){
                continue;
            }
            int currentChainLength = find_string_length(searchWord, wordsHashSet, wordsHashMap) + 1;
            wordsHashMap.put(searchWord, currentChainLength);
            maxChainLength = Math.max(currentChainLength, maxChainLength);
        }

        return maxChainLength;
    }


    public static int find_string_length(String searchWord, HashSet<String> words, HashMap<String, Integer> wordsHashMap){
        int currentStringLength = 0;

        for(int i = 0; i < searchWord.length(); i++){
            String wordOne = searchWord.substring(0,i);
            String wordTwo = searchWord.substring(i+1);
            String nextWord = wordOne + wordTwo;
            if(words.contains(nextWord)) {
                if(wordsHashMap.containsKey(nextWord)) {
                    currentStringLength = Math.max(currentStringLength, wordsHashMap.get(nextWord));
                } else {
                    int searchNext = find_string_length(nextWord, words, wordsHashMap);
                    currentStringLength = Math.max(currentStringLength, searchNext + 1);
                }
            }
        }

        return currentStringLength;
    }
}
