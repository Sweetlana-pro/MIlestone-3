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
    private Object dao;
    private Object dto;
    private Object item;
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    BigDecimal money;
    String menuSelection;
    
    
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
        
        BigDecimal money = io.readBigDecimal("Please PUT IN your money $");
        
        BigDecimal op1 = new BigDecimal ("100");
        BigDecimal price = new BigDecimal ("0");   
        BigDecimal cents = money.multiply(op1); 
        BigDecimal change = new BigDecimal("0");
        
        io.print( "Thank you! You put in $" + money + " = " + cents + " cents");
        return cents;
    }
    
    //Getting selection
    public String getSelection() {
        
        String menuSelection = io.readString("Awsome! Now, select your Pokemon.");
            switch (menuSelection) { 
                case "Snorlax":
                    break;
                case "Picachu":
                    break;
                case "Eevee":
                    break;
                case "Mewtwo":
                    break;
                default:
                    io.print("No such Pokemon. Please try again");
            }
        //checks if inventory is less than 0
        //if(item.getQuantity() <= 0) {
             //if (dto.item.getQuantity () == 0){
            //io.print("Sorry. The item you have selected is sold out.");
        
        return menuSelection;
    }
    
    
    
    
    
    /*public String itemSelection () {
        
    String menuSelection = io.readString("Awsome! Now, select your Pokemon."); 
    }
    
    public void approvePurchase () {
        if (cents.compareTo(item.getPrice()) < 0) {
            throw new InsufficientFundsException("You put in $" + money
                    + "which is an insufficient amount of money.");
        }
    }*/
    
    public BigDecimal calculateChange () {
    Item item;
      
    BigDecimal cents = getMoney();
    BigDecimal change = new BigDecimal("0");
    
        switch (menuSelection) { 
            case "Snorlax":
                
                   

                io.print(" Your change: " + change + " cents.");
                break;
                /*case Picachu:
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
                    break;*/
            default:
                io.print("UNKNOWN COMMAND");
            }
        return change;
        
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
