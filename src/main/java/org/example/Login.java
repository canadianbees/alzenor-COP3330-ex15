/*
 *  UCF COP3330 Fall 2021 Login Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Login
{
    String password;

    //get password from user
    public Login()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        this.password = input.next();
    }

    public void PassCheck()
    {
        //if password matches
        if(this.password.matches("abc!123"))
        {
            System.out.print("Welcome!");
            return;
        }

        //if it doesn't
        System.out.print("Invalid password....");

    }
}
