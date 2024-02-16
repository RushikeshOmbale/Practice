package com.codingpractice.in;

public class ReverseOfNumber {
    
    public static void main(String[] args) {
        int number = 123;
        int no = number;
        int rev = 0;
        
        while (no != 0) {
            int digit = no % 10;
            rev = rev * 10 + digit;
            no = no / 10;
        }
        
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + rev);
    }
}



