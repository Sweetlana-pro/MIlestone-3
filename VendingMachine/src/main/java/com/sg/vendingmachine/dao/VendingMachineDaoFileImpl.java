/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao {
    
    private Map<String, Item> inventory = new HashMap<>();
    
    public static final String INVANTORY_FILE = "inventory.txt";
    public static final String DELIMITER = "::";
    
    private Item unmarshallItem (String itemAsText){
        String[]itemTokens = itemAsText.split(DELIMITER);
        String name = itemTokens[0];
        Item itemFromFile = new Item(name);
        itemFromFile.setPrice(itemTokens[1]);
        itemFromFile.setQuantity(itemTokens[2]);
        
        return itemFromFile;
    }

    @Override
    public Item updateItem(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> retrieveInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
