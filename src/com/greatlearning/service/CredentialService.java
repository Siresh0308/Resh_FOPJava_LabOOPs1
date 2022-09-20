package com.greatlearning.service;
import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {

    public char[] generatedPassword(){

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*";
        String values = capitalLetters + smallLetters + numbers + specialCharacters;

        //Using random method

        Random random = new Random();
        char[] password = new char[8];

        for(int i = 0; i < 8; i++){
            //using char method to get character value
            //use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(random.nextInt(values.length()));
            }
        return password;
    }
    public String generateEmailAddress(String firstName, String lastName, String department){
        return firstName+lastName+"@"+department+".abc.com";
    }
    public void showCredentials(Employee employee, String email, char[] generatedPassword){
        System.out.println("Dear" +employee.getFirstName()+ "Your generated credentials are as follow");
        System.out.println("Email--->" +email);
        System.out.print("Password---->" + "");
        System.out.print(generatedPassword);
    }

}
