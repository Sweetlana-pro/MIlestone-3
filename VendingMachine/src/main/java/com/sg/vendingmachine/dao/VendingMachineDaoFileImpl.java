/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao {
    
    private Map<String, Item> inventory = new HashMap<>();
    
    public static final String INVENTORY_FILE = "inventory.txt";
    public static final String DELIMITER = "::";
    
    private Item unmarshallItem (String itemAsText){
        String[]itemTokens = itemAsText.split(DELIMITER);
        String name = itemTokens[0];
        Item itemFromFile = new Item(name);
        itemFromFile.setPrice(itemTokens[1]);
        itemFromFile.setQuantity(itemTokens[2]);
        
        return itemFromFile;
    }
    private void loadInventory() throws VendingMachineDaoException {
        Scanner scanner;
        try {
            //Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(INVENTORY_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingMachineDaoException(
                    " -_- Could not load inventory data into memory.", e);
        }
        String currentLine = null;
        Item currentItem;
        while(scanner.hasNextLine()) {
            currentItem = unmarshallItem(currentLine);
            inventory.put(currentItem.getName(), currentItem);
        }
        scanner.close();
    }
    private String marshallItem(Item aItem) {
        String itemAsText = aItem.getName() + DELIMITER;
        itemAsText += aItem.getPrice() + DELIMITER;
        itemAsText += aItem.getQuantity();
        
        return itemAsText;
    }
    public void writeInventory() throws VendingMachineDaoException, FileNotFoundException, IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Inventory.txt"));
        /*out.println("Snorlax" + DELIMITER + "0.25" + DELIMITER + "3");
        out.println("Snorlax" + DELIMITER + "0.25" + DELIMITER + "3");
        
        out.flush();
        out.close();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("INVENTORY_FILE")));
        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);*/
        
        try {
            out = new PrintWriter(new FileWriter(INVENTORY_FILE));
            
        } catch (IOException e) {
            throw new VendingMachineDaoException ("Could not save item data.", e);
             
        }
        String itemAsText;
        List<Item> itemList = this.getAllitems();
        for (Item currentItem : itemList){
            itemAsText = marshallItem(currentItem);
            out.println(itemAsText);
            out.flush();
        }
        out.close();
    }

    @Override
    public Item updateItem(String name, Item item) throws VendingMachineDaoException {
        
        loadInventory();
        Item newItem = inventory.put(name, item);
        try {
            writeInventory();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VendingMachineDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendingMachineDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newItem;
    }

    @Override
    public List<Item> getAllitems() {
        
        
        return new ArrayList<Item>(inventory.values());
    }
    /*public Item getNewItemInfo() throws FileNotFoundException {
         //getting Item Snorlax
        String name = "Snorlax";
        String price = "0.25";
        String quantity = "3";
        
        
        Item currentItem = new Item (name);
        currentItem.setPrice(price);
        currentItem.setQuantity(quantity);
        
        
        out.flush();
        out.close();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("INVENTORY_FILE")));
        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
            
        return currentItem;
    }*/
     
}
