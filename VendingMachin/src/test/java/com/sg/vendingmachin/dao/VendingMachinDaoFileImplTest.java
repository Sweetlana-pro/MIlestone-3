/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachin.dao;

import static com.sg.vendingmachin.dao.VendingMachinDaoFileImpl.INVENTORY_FILE;
import com.sg.vendingmachin.dto.Item;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        PrintWriter out;

	    try {
	        out = new PrintWriter(new FileWriter(testFile));
	    } catch (IOException e) {
	        throw new VendingMachinPersistenceException(
	                "Could not save inventory data.", e);
	    }
            out.println("1::Snorlax::0.25::2");
            out.println("2::Picachu::0.45::2");
            out.println("3::Eevee::0.50::1");
            out.println("4::Mewtwo::0.60::2");
            out.flush();
            out.close();
        testDao = new VendingMachinDaoFileImpl(testFile);
    }
    
    @Test
    public void testGetItem()throws Exception {
                
        //Create our method test inputs
        String itemNumber = "1";
        Item item = new Item(itemNumber);
        item.setItemName("Snorlax");
        item.setItemPrice(BigDecimal.valueOf(0.25));
        item.setItemQuantity(2);
                        
        //Get the item from the DAO
        Item retrievedItem = testDao.getItem(itemNumber);
        
        //Check the data is equal
        assertEquals(item.getItemNumber(), retrievedItem.getItemNumber(),
                "Checking item number");
        assertEquals(item.getItemName(), retrievedItem.getItemName(),
                "Checking item name");
        assertEquals(item.getItemPrice(), retrievedItem.getItemPrice(),
                "Checking item price");
        assertEquals(item.getItemQuantity(), retrievedItem.getItemQuantity(),
                "Checking item price");
        
    }
    
    @Test 
    public void testGetAllItems() throws Exception {
        //Create our first item
        Item firstItem = new Item ("1");
        firstItem.setItemName("Snorlax");
        firstItem.setItemPrice(BigDecimal.valueOf(0.25));
        firstItem.setItemQuantity(Integer.parseInt("2"));
       
        
        //Create our second Item
        Item secondItem = new Item("2");
        secondItem.setItemName("Picachu");
        secondItem.setItemPrice(BigDecimal.valueOf(0.45));
        secondItem.setItemQuantity(Integer.parseInt("2"));
        
        //Create our third item
        Item thirdItem = new Item ("3");
        thirdItem.setItemName("Eevee");
        BigDecimal itemPrice = new BigDecimal ("0.50");
        String i = String.valueOf(itemPrice);
        thirdItem.setItemPrice(itemPrice);
        thirdItem.setItemQuantity(Integer.parseInt("1"));
    
        //Create our fourth item
        Item fourthItem = new Item ("4");
        fourthItem.setItemName("Mewtwo");
        BigDecimal fourthItemPrice = new BigDecimal ("0.60");
        String b = String.valueOf(fourthItemPrice);
        fourthItem.setItemPrice(fourthItemPrice);   
        fourthItem.setItemQuantity(Integer.parseInt("2"));
    
        //Add items to the DAO
       /* testDao.addItem(firstItem.getItemNumber(), firstItem);
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
                "The list of Pokemons should include Snorlax.");
        assertTrue(testDao.getAllItems().contains(secondItem),
                "The list of Pokemons should include Picachu.");
        assertTrue(testDao.getAllItems().contains(thirdItem),
                "The list of Pokemons should include Eevee.");
        assertTrue(testDao.getAllItems().contains(fourthItem),
                "This list of Pokemons should include Mewtwo ");
    
    }
    
}
