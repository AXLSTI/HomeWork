package com.hillel.lesson3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        int random = (int) (Math.random()  * 80);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter min limit: 20 ");
            String next = scanner.next();
            System.out.println("Enter max limit: 80 ");

            int nextInt = scanner.nextInt();

        System.out.println(("The random value is " + random + " between range: 20 and 80"));

    }
    }