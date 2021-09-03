package exercise01;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 Dustin Battles
 */

/*
 * The way to tackle this one is to ask the person for their name
 * Store their name
 * Print their name using the stored string
 */

import java.awt.desktop.SystemEventListener;

public class solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please print your name.");
        String name = input.next();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
