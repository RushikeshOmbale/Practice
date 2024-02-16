package com.codingpractice.in;
import java.util.Base64;

public class UsernameEncryption {
    public static void main(String[] args) {
        String username = "Pass@123~";
        
       
        
        // Encode the username using Base64
        String encodedUsername = Base64.getEncoder().encodeToString(username.getBytes());
        
        
        
        
        

        System.out.println("Encoded Username: " + encodedUsername);
        
        
        
    }
}
