/*
 *  UCF COP3330 Fall 2021 Exercise 15 Solution
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
public class Main
{
    public static void main( String[] args )
    {
        //gets password from user
        Login computer = new Login();
        //checks if password matches
        computer.PassCheck();
    }
}
