/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import java.math.BigDecimal;

/**
 *
 * @Sweetlana Protsenko
 */
public enum Coin {
    PENNY(1), NICKlE(5), DIME(10), QUARTER(25);
    
    private int denomination;
    
    private Coin(int denomination) {
        this.denomination = denomination;
        
    }
    public int getdenomination(){
        return denomination;
    }
    
}
