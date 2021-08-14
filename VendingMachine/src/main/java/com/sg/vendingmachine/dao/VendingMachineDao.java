/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @Sweetlana Protsenko
 */
public interface VendingMachineDao {
    Item updateItem(String name, Item item)throws VendingMachineDaoException;
    List<Item> getAllitems()throws VendingMachineDaoException;
    
}
