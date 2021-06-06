package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise01
{
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = sc.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you!");
    }

}
