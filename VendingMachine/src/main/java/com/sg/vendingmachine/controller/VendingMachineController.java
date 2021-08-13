/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsolImpl;

/**
 *jhfck
 * @Sweetlana Protsenko
 */
public class VendingMachineController {
    
    private UserIO io = new UserIOConsolImpl();
    
    public void run() { 
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {    
            io.print("POKEMONS");
            io.print("1. Snorlax - $0.5");
            io.print("2. Picachu - $1.0");
            io.print("3. Eevee   - $2.0");
            io.print("4. Mewtwo  - $1.5");
            io.print("5. Exit");
        
            menuSelection = io.readInt("Please select your Pokemon.", 1, 5);
        
            switch (menuSelection) {
                case 1:
                    io.print("You choose SNORLAX. Please put in 50 cents.");
                    break;
                case 2: 
                    io.print("You choose PICACHU. Please put in $1");
                    break;
                case 3:
                    io.print("You choose EEVEE. Please put in $2");
                    break;
                case 4:
                    io.print("You choose MEWTWO. Please put in 1 dollar 50 cents");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
        }
        io.print("Thank you for using our vending machine!");
         
    }
    
    
}
