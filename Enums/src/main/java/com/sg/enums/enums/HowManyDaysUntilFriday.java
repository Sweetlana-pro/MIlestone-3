/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.enums;

import java.util.Scanner;

/**
 *
 * @Sweetlana Protsenko
 */
public class HowManyDaysUntilFriday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayOfWeek = sc.nextInt();
        do {
            
            System.out.println("Please enter your day of the week");
            System.out.println("1 Saturday");
            System.out.println("2 Sunday");
            System.out.println("3 Monday");
            System.out.println("4 Tuesday");
            System.out.println("5 Wednesday");
            System.out.println("6 Thursday");
            System.out.println("7 Friday");
            System.out.println("8 Exit");

        } while (dayOfWeek > 1 || dayOfWeek < 8); 
          
        int untilFriday = 7 - dayOfWeek;

        System.out.println(untilFriday + " days until Friday");

    }
    
}
