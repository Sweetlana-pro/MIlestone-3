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
public class VendingMachineDaoException extends Exception {

    VendingMachineDaoException(String message) {
        super(message);
    }

    VendingMachineDaoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
