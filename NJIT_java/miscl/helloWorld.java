package NJIT_java.miscl;

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        
        // create an instance of our scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();

        // make sure the user gives input
        while(name.equals("")) {
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello, " + name + "! Welcome to class.");
    }
}