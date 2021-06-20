package com.interview.stashaway.dev;

public class Main {
    public static void main(String[] args) {

        String input = "abcbaabc";
        int uniqueChar = 0;

        for(int i=0; i<input.length(); i++) {
            int charCount = 0;
            for(int j=0; j<input.length(); j++) {
                if(input.charAt(i)==input.charAt(j)) {
                    charCount++;
                }
            }
            if(charCount!=2)
                uniqueChar++;
        }

        if(input.length()%2 == 0 && uniqueChar == 0) {
            System.out.println("True");
        } else if(input.length()%2 != 0 && uniqueChar <= 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
