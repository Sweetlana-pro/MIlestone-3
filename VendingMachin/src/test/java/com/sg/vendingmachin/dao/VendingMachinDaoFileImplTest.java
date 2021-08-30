/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachin.dao;

import com.sg.vendingmachin.dto.Item;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachinDaoFileImplTest {
    
    VendingMachinDao testDao;
    
    public VendingMachinDaoFileImplTest() {
    }
    
    
    
    @BeforeEach
    public void setUp () throws Exception {
        String testFile = "testinventory.txt";
        
        //Use the FileWriter to quickly blank the file
        new FileWriter(testFile);
        testDao = new VendingMachinDaoFileImpl(testFile);
    }
    
    @Test 
    public void testGetAllItems() throws Exception {
        //Create our first item
        Item firstItem = new Item ("1");
        firstItem.setItemName("Snorlax");
        BigDecimal firstItemPrice = new BigDecimal ("0.25");
        String a = String.valueOf(firstItemPrice);
        firstItem.setItemPrice(firstItemPrice);
        firstItem.setItemQuantity(Integer.parseInt("2"));
        
        //Create our second Item
        Item secondItem = new Item("2");
        secondItem.setItemName("Picachu");
        BigDecimal secondItemPrice = new BigDecimal ("0.45");
        String s = String.valueOf(secondItemPrice);
        secondItem.setItemPrice(secondItemPrice);
        secondItem.setItemQuantity(Integer.parseInt("2"));
        
        //Create our third item
        Item thirdItem = new Item ("3");
        thirdItem.setItemName("Eevee");
        BigDecimal itemPrice = new BigDecimal ("0.50");
        String i = String.valueOf(itemPrice);
        thirdItem.setItemPrice(itemPrice);
        thirdItem.setItemQuantity(Integer.parseInt("1"));
    
        //Create our fourth item
        Item fourthItem = new Item ("1");
        fourthItem.setItemName("Mewtwo");
        BigDecimal fourthItemPrice = new BigDecimal ("0.60");
        String f = String.valueOf(fourthItemPrice);
        fourthItem.setItemPrice(itemPrice);
        fourthItem.setItemQuantity(Integer.parseInt("2"));
    
        //Add items to the DAO
        /*testDao.addItem(firstItem.getItemNumber(), firstItem);
        testDao.addItem(secondItem.getItemNumber(), secondItem);
        testDao.addItem(thirdItem.getItemNumber(), thirdItem);
        testDao.addItem(fourthItem.getItemNumber(), fourthItem);*/
        
        //retrieve the list of items within the DAO
        List<Item> allItems = testDao.getAllItems();
        
        //First check the general contents of the list
        assertNotNull(allItems, "The list of items must not be null");
        assertEquals(4, allItems.size(), "List of pokemons should have 4 items.");
        
        //Then the specifics
        assertTrue(testDao.getAllItems().contains(firstItem),
                "The list of items should include Snorlax.");
        assertTrue(testDao.getAllItems().contains(secondItem),
                "The list of students should include Picachu.");
        assertTrue(testDao.getAllItems().contains(thirdItem),
                "The list of Pokemons should include Eevee.");
        assertTrue(testDao.getAllItems().contains(fourthItem),
                "This list of pokemons should include Mewtwo.");
    
    }
    
}
