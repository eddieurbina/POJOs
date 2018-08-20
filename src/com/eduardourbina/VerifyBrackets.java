package com.eduardourbina;

public class VerifyBrackets {

    public static void main(String[] args) {
        //Program which returns true if all the brackets [] () {} in a String have their respective pair.
        String testString = "HolaMundo[]{}()";
        int longString = testString.length();
        String abreLlave = "{";
        String cierraLlave = "}";
        String abreParentesis = "(";
        String cierraParentesis = ")";
        String abreCorchete = "[";
        String cierraCorchete = "]";
        int openLlave = 0;
        int closeLlave= 0;
        int openParentesis = 0;
        int closeParentesis = 0;
        int openCorchete = 0;
        int closeCorchete = 0;

        for(int i = 0; i < longString; i++){
            if(testString.substring(i, i+1).equalsIgnoreCase(abreLlave)){
                openLlave++;
            } else if(testString.substring(i, i+1).equalsIgnoreCase(cierraLlave)){
                closeLlave++;
            } else if(testString.substring(i, i+1).equalsIgnoreCase(abreCorchete)){
                openCorchete++;
            } else if(testString.substring(i, i+1).equalsIgnoreCase(cierraCorchete)){
                closeCorchete++;
            } else if(testString.substring(i,i+1).equalsIgnoreCase(abreParentesis)){
                openParentesis++;
            } else if(testString.substring(i,i+1).equalsIgnoreCase(cierraParentesis)){
                closeParentesis++;
            }
        }

        if(openLlave == closeLlave && openCorchete == closeCorchete && openParentesis == closeParentesis){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
