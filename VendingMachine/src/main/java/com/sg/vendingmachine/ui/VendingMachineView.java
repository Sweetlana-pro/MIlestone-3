/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
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
    
    
    /*public void printMenu() {
        io.print("POKEMONS");
        io.print("1. Snorlax - $0.25");
        io.print("2. Picachu - $0.45");
        io.print("3. Eevee   - $0.50");
        io.print("4. Mewtwo  - $0.60");
        io.print("5. Exit");
        
    }*/
    //Getting money
    public BigDecimal getMoney(){
        
        money = io.readDouble("Please PUT IN your money $");
        double cents = money * 100;
        io.print( "Thank you! You put in $" + money + " = " + cents + " cents");
        return new BigDecimal(money);
    }
    
    //Getting selection
    public int getSelection() {
        int menuSelection = io.readInt("Awsome! Now, select your Pokemon.");
        return menuSelection;
    }
       /* boolean keepGoing = true;
        double price = 0.0;
        double cents = money * 100;
        double change = 0;
        
        do  { 
            switch (menuSelection) {
                case 1:
                    price = 25.0;
                    change = cents - price;
                    io.print(" Your change: " + change + " cents.");
                    break;
                case 2:
                    price = 35;
                    change = cents - 35.0;
                    io.print(" Your change: " + change + " cents.");
                break;
                case 3:
                    price = 50.0;
                    change = cents - price;
                    io.print(" Your change: " + change + " cents.");
                    break;
                case 4:
                    price = 60.0;
                    change = cents - price;
                    io.print(" Your change: " + change + " cents.");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
            
        } while (change > 0.0);
            
        io.print("Unsufficiant funds");
        
        return change;
        
    }*/
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
        public void displayAllItemsBanner() {
        io.print("---All POKEMONS---");
    }
     //view one item   
    public void displayDisplayItemBanner() {
        io.print("---Display Pokemon---");
    }
    public String getNameChoice(){
        return io.readString("Please enter your Pokemon's name");
    }
    public void displayItem(Item item) {
        if(item != null) {
            io.print(item.getName());
            //io.print(item.getPrice());
            //io.print(item.getQuantity(Integer.parseInt()));
            io. print ("");
        } else {
            io.print("No such Pokemon");
        }
        io.readString("Please hit enter to continue");
    }
}    
