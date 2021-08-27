/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @Sweetlana Protsenko
 */
public interface VendingMachineServiceLayer {
    List <Item> getAllItems()throws NoItemInventoryException,
            InsufficiantFundsException;
    
    
    
    
}
