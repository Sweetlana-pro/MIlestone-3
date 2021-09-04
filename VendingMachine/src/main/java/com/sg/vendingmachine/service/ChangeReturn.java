/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsolImpl;
import java.math.BigDecimal;
import com.sg.vendingmachine.ui.VendingMachineView;
import java.math.RoundingMode;

/**
 *
 * @Sweetlana Protsenko
 */
public class ChangeReturn {
    /*Item item;
    UserIO io;
    BigDecimal money = new BigDecimal ("0");
    BigDecimal op1 = new BigDecimal ("100");
    BigDecimal price = item.getPrice();
    BigDecimal cents = money.multiply(op1); 

    
    
    public BigDecimal returnCoins () {
        BigDecimal change = cents.subtract(price);
         
        
        BigDecimal quarter = new BigDecimal ("25");
        BigDecimal dime = new BigDecimal ("10");
        BigDecimal nickle = new BigDecimal ("5");
        BigDecimal penny = new BigDecimal ("1");
        BigDecimal numQuarters = change.divide(quarter, RoundingMode.DOWN);
        BigDecimal numDimes =  change.remainder(quarter).divide(dime);
        BigDecimal numNickles = change.remainder(quarter).remainder(dime).divide(nickle);
        BigDecimal numPennies = change.remainder(quarter).remainder(dime).remainder(nickle).divide(penny);
        
        //io.print("Your receiving: " + numQuarters + " quarters " + numDimes " dimes " + numNickles + " nickles " + numPennies + " pennies.");
        
        io.print("Your Change is " + change.toString() + " cents.");
        //io.print("You get:" + numQuarters.toString() + " quarters, " + numDimes.toString() " dimes, " + numNickles.toString() + " nickles, " + numPennies.toString() + " pennies.");
        return change;
    }
    
    
    //String menuSelection = view.getSelection();
    
        
        
    
    /*public String itemSelection () {
        
    String menuSelection = io.readString("Awsome! Now, select your Pokemon."); 
    }
    
    public void approvePurchase () {
        if (cents.compareTo(item.getPrice()) < 0) {
            throw new InsufficientFundsException("You put in $" + money
                    + "which is an insufficient amount of money.");
        }
    }*/
    
    /*public BigDecimal calculateChange () {
    change = cents.subtract(price);
        switch (menuSelection) { 
                case "Snorlax":
                    change = cents.subtract(price("25"));;

                    io.print(" Your change: " + change + " cents.");
                    break;
                case Picachu:
                    price = "35";

                    io.print(" Your change: " + change + " cents.");
                    break;
                case Eevee:
                    price = 50.0;

                    io.print(" Your change: " + change + " cents.");
                    break;
                case Mewtwo:
                    price = 60.0;

                    io.print(" Your change: " + change + " cents.");
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
    }*/
    
    
}
