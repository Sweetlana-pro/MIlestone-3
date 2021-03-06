/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoException;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsolImpl;
import com.sg.vendingmachine.ui.VendingMachineView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import com.sg.vendingmachine.service.ChangeReturn;


/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineController {
    
    private UserIO io = new UserIOConsolImpl();
    private VendingMachineView view;
    private VendingMachineDao dao;
    private VendingMachineServiceLayer service;
    public ChangeReturn change;
    
    public VendingMachineController(VendingMachineDao dao, VendingMachineView view, VendingMachineServiceLayer service, ChangeReturn change) {
        this.dao = dao;
        this.view = view;
        this.service = service;
    }
    private void listItems() throws VendingMachineDaoException  {
        view.displayAllItemsBanner();
        List<Item>itemList = dao.getAllItems();
        view.displayItemList(itemList);
    }   
    /*public void printMenu() {
        view.printMenu();
    }*/
    public BigDecimal getMoney() {
        return view.getMoney();
         
    }
    private String getSelection() {
        // Get selection from user (view)
        
        return view.getSelection();
    } 
    public BigDecimal calculateChange () {
        return view.calculateChange();
    }
    /*public BigDecimal returnCoins() {
        return change.returnCoins();
    }*/

    public void run() throws VendingMachineDaoException { 
        boolean keepGoing = true;
        int menuSelection = 0;
        BigDecimal money = new BigDecimal ("0");
        BigDecimal op1 = new BigDecimal ("100");
       
        BigDecimal cents;       
        cents = money.multiply(op1);
               
        while (keepGoing) { 
            //printMenu();
            /*io.print("POKEMONS");
            io.print("1. Snorlax - $0.5");
            io.print("2. Picachu - $1.0");
            io.print("3. Eevee   - $2.0");
            io.print("4. Mewtwo  - $1.5");
            io.print("5. Exit");*/
        
            //menuSelection = io.readInt("Please select your Pokemon.", 1, 5);
            listItems();
            getMoney();
            
            getSelection();
            //calculateChange ();
            returnCoins ();
            
            /*menuSelection = io.readInt("Awsome! Now, select your Pokemon.", 1, 5);
            
            double price = 0.0;
            
            double cents = 2.0;
            double change = cents - price;
           //while (cents >= price) { 
            switch (menuSelection) {
            
                case 1:
                    price = 25.0;
                    
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
                /*switch (menuSelection) {
                case 1:
                    io.print("You choose SNORLAX.");
                    break;
                case 2: 
                    io.print("You choose PICACHU.");
                    break;
                case 3:
                    io.print("You choose EEVEE. ");
                    break;
                case 4:
                    io.print("You choose MEWTWO. ");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");*/
        }
    }
       
        //io.print("Thank you for using our vending machine!");

     
        // Get Money  (view) // Use the view to get the money
        //BigDecimal change = view.getMoney();
        // Buy the item (service) This is business logic
        //    service.buyItem()
        // Handle exception (advanced)
    

    /*private void multiply(BigDecimal money, RoundingMode roundingMode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void viewItem() {
        view.displayDisplayItemBanner();
        String name = view.getNameChoice();
        Item item = dao.getItem(name);
        view.displayItem(item);
    }*/

    
   

}
