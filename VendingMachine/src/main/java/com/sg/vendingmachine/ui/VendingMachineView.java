/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineView {
    
    private UserIO io;
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    Double money;
    int menuSelection;
    double cents = money * 100;
    public void printMenu() {
        io.print("POKEMONS");
        io.print("1. Snorlax - $0.25");
        io.print("2. Picachu - $0.45");
        io.print("3. Eevee   - $0.50");
        io.print("4. Mewtwo  - $0.60");
        io.print("5. Exit");
        
    }
    //Getting money
    public double getMoney(){
        
        money = io.readDouble("Please PUT IN your money $");
        cents = money * 100;
        io.print( "Thank you! You put in $" + money + " = " + cents + " cents");
        return cents;
    }
    
    //Getting selection
    public double getSelection() {
        int menuSelection = io.readInt("Awsome! Now, select your Pokemon.");
        boolean keepGoing = true;
        double price = 0.0;
        
        double change = cents - price;
        
        while (cents > price) { 
            switch (menuSelection) {
                case 1:
                    price = 0.25;
                    change = cents - 25.0;
                    io.print(" Your change: " + change);
                    break;
                case 2:
                    price = 35;
                    change = cents - 35.0;
                    io.print("Your change: " + change);
                break;
                case 3:
                    price = 50.0;
                    change = cents - price;
                    io.print("Your change: " + change);
                    break;
                case 4:
                    price = 60.0;
                    change = cents - price;
                    io.print("Your change: " + change);
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
        } 
        return change;
        
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("---ERROR---");
        io.print(errorMsg);
    }
    public void displayItemList(List<Item> itemList) {
        for (Item currentItem : itemList) {
            String itemInfo = String.format( "#%s : %s %s",
                currentItem.getName(),
                currentItem.getPrice(),
                currentItem.getQuantity());
            io.print(itemInfo);
        }
        io.readString("Please hit Enter to continue");
    }
}    
