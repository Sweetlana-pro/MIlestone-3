/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm;

import java.math.BigDecimal;

/**
 *
 * @author pro
 */
public class SimpleVM {
    
    UserIO io = new UserIOConsolImpl();
    Double money;
    int userChoice;
    int quantitySnorlax = 3;
    double price;
    
    public void printMenu() {
        io.print("POKEMONS");
        io.print("1. Snorlax - 25");
        io.print("2. Picachu - 35");
        io.print("5. Exit");
        
    }
    //Getting amount of money
    public double getMoney(){
        
        money = io.readDouble("Please PUT IN your money $");
        double cents = money * 100;
        return cents;
    }
    
    //Getting selection
    public int getSelection() {
        userChoice = io.readInt("Awsome! Now, select your Pokemon.");
        return userChoice;
    }
    do {
        switch (userChoice != 5) {
            case 1:
                int price = 25;
                change = cents - 25;
                io.print(" Your change: " + change);
                break;
            case 2:
                price = 35;
                change = cents - 35;
                io.print("Your change: " + change);
                break;
            case 5:
                io.print("Good bye");
                break;
            default:
                io.print("UNKNOWN COMMAND");
        } 
    } while (cents >= price);
    
    io.print("Unsufficiant Funds");
    
    
    
}
    
    
    
    
    
}
    
