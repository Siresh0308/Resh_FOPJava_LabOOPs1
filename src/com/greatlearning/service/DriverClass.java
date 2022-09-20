package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Scanner;
public class DriverClass {

    public static void main(String[] args){

        Employee employee = new Employee("Resh","Singh");
        CredentialService cs = new CredentialService();
        String generatedEmail;
        char[] generatedPassword;

        System.out.println("Please enter the department from the following");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Legal");

        Scanner sc =  new Scanner(System.in);
        int option = sc.nextInt();
        int num = 1;
        switch(num){
            case 1: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
                    employee.getLastName().toLowerCase(),"Technical");
                    generatedPassword = cs.generatedPassword();
                    cs.showCredentials(employee, generatedEmail, generatedPassword);

                    break;

            case 2: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
                    employee.getLastName().toLowerCase(),"Admin");
                generatedPassword = cs.generatedPassword();
                cs.showCredentials(employee, generatedEmail, generatedPassword);

                break;

            case 3: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
                    employee.getLastName().toLowerCase(),"HR");
                generatedPassword = cs.generatedPassword();
                cs.showCredentials(employee, generatedEmail, generatedPassword);

                break;

            case 4: generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
                    employee.getLastName().toLowerCase(),"Legal");
                generatedPassword = cs.generatedPassword();
                cs.showCredentials(employee, generatedEmail, generatedPassword);
                  break;

            default: System.out.println("Wrong choice");


        }




    }
}
