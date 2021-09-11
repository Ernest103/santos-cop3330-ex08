package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int pplCount, pizzaCount, sliceCount, left, used;

        System.out.print("How many people? ");
        pplCount = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        pizzaCount = sc.nextInt();

        System.out.print("How many slices per pizza? ");
        sliceCount = sc.nextInt() * pizzaCount;

        left = sliceCount % pplCount;
        used = sliceCount / pplCount;

        System.out.println(pplCount + " people with " + pizzaCount
        + " pizzas (" + sliceCount + " slices)");
        System.out.println("Each person gets " + used + " slices of pizza.");
        System.out.println("There are " + left + " slices of pizza left.");
    }
}
