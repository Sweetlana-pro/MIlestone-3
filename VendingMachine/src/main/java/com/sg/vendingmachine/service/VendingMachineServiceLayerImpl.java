/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import java.math.BigDecimal;

/**
 *
 * @author pro
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    /*private VendingMachineDao dao;
    private VendingMachineAuditDao auditDao;
    private VendingMachineDaoFileImpl availableItems;
    private BigDecimal funds;
    int removeItemFromInventory;
    private Change endUserChange;

    public VendingMachineServiceLayerImplDao dao, VendingMachineAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public void addMoney(BigDecimal moneyToAdd) throws VendingPersistenceException {
        funds = funds.add(moneyToAdd);
    }

    @Override
    public Change buyItem(String itemId) throws VendingNoItemInventoryException, VendingInsuffientFundsException, VendingPersistenceException {

        Item item = dao.readItemById(itemId);
        
        if (item.getInventory() == 0) {
            throw new VendingNoItemInventoryException("Sorry. The item you have selected is sold out.");
        }

        if (funds.compareTo(item.getPrice()) < 0) {

        }

        if (funds.compareTo(item.getPrice()) < 0) {
            throw new VendingInsuffientFundsException("You put in" + funds
                    + "which is an insufficient amount of money.");
        }

        if (funds.compareTo(item.getPrice()) >= 0) {
        (item.setInventory() - 1);
        dao.removeItem(itemId);
        auditDao.writeAuditEntry("Item " + item.getName() + "PURCHASED.");
        return endUserChange;
    }


    /* private List<Item> getAvailableItems() throws VendingPersistenceException {
        loadMachine();
        List<Item> availableItems = items.entrySet()
                .stream()
                .filter((i) -> Integer.parseInt(i.getValue().getInventory()) => 0)
                .map(map -> map.getValue())
                .collect(Collectors.toList());
        return availableItems;*/
    }

    /*private Change calculateChange(BigDecimal funds) {

        BigDecimal numQuarter = funds.divide(new BigDecimal("0.25"), 2, RoundingMode.DOWN);
        endUserChange.setQuarters(numQuarter);
        funds = funds.subtract(numQuarter.multiply(new BigDecimal("0.25")));
        BigDecimal numDime = funds.divide(new BigDecimal("0.10"), 2, RoundingMode.DOWN);
        endUserChange.setDimes(numDime);
        funds = funds.subtract(numDime.multiply(new BigDecimal("0.10")));
        BigDecimal numNickel = funds.divide(new BigDecimal("0.05"), 2, RoundingMode.DOWN);
        endUserChange.setNickels(numNickel);
        funds = funds.subtract(numNickel.multiply(new BigDecimal("0.05")));
        BigDecimal numPen = funds.divide(new BigDecimal("0.01"), 2, RoundingMode.DOWN);
        endUserChange.setPennies(numPen);
        funds = funds.subtract(numPen.multiply(new BigDecimal("0.01")));
        return endUserChange;
    } */


