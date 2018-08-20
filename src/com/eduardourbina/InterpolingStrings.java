package com.eduardourbina;

public class InterpolingStrings {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Goodbye";
        String aChar;
        String bChar;
        int aLength = a.length();
        int bLength = b.length();
        int theGreater = 0;
        String formatter = "%1$-";

        if(aLength > bLength) {
            theGreater = aLength;
            b = String.format(formatter + theGreater + "s", b);
        } else if(bLength > aLength){
            theGreater = bLength;
            a = String.format(formatter + theGreater + "s", a);
        } else if(aLength == bLength){
            theGreater = aLength;
        }

        for(int i = 0; i < theGreater; i++){
            aChar = a.substring(i, i+1);
            System.out.print(aChar.replace(" ", ""));
            bChar = b.substring(i, i+1);
            System.out.print(bChar.replace(" ", ""));
        }
    }
}
