/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author pro
 */
class VendingMachineDaoException extends Exception {

    VendingMachineDaoException(String ___Could_not_load_inventory_data_into_mem, FileNotFoundException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    VendingMachineDaoException(String could_not_save_item_data, IOException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
