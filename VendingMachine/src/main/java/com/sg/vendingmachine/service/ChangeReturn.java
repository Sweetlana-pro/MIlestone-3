/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.ui.UserIO;
import java.math.BigDecimal;

/**
 *
 * @author pro
 */
public class ChangeReturn {
    BigDecimal money = new BigDecimal ("0");
    BigDecimal op1 = new BigDecimal ("100");
    BigDecimal price = new BigDecimal ("0");   
    BigDecimal cents = money.multiply(op1); 
    BigDecimal change = new BigDecimal("0");
    private UserIO io;
    
    /*public BigDecimal itemSelection () {
    String itemSelection = io.readString("Awsome! Now, select your Pokemon."); 
    
        switch (itemSelection) { 
            case Snorlax:
                price = 25.0;
                change = cents - price;
                io.print(" Your change: " + change + " cents.");
                break;
            case Picachu:
                price = 35;
                change = cents - 35.0;
                io.print(" Your change: " + change + " cents.");
                break;
            case Eevee:
                price = 50.0;
                change = cents - price;
                io.print(" Your change: " + change + " cents.");
                break;
            case Mewtwo:
                price = 60.0;
                change = cents - price;
                io.print(" Your change: " + change + " cents.");
                break;
            default:
                io.print("UNKNOWN COMMAND");
        }
    }
    private BigDecimal returnCoins () {
        int numberQuarters = change / QUARTER;
        int numberDimes =  change % QUARTER / DIME;
        int numberNickles = change % QUARTER % DIME / NICKLE;
        int numberPennies = change % QUARTER % DIME % NICKLE;
        
        return 
    }*/
    
}
