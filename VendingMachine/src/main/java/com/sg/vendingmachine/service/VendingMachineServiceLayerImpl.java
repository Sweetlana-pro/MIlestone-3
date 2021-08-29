/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    @Override
    public List<Item> getAllItems() throws NoItemInventoryException, InsufficientFundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    public ChangeReturn buyItem(String name) throws NoItemInventoryException, InsufficientFundsException {

        Item item = dao.readItemByName(name);
        
        if (item.getQuantity() == 0) {
            throw new NoItemInventoryException ("Sorry. The item you have selected is sold out.");
        }

        if (view.cents.compareTo(item.getPrice()) < 0) {

        }

        if (cents.compareTo(item.getPrice()) < 0) {
            throw new InsufficientFundsException("You put in $" + money
                    + "which is an insufficient amount of money.");
        }

        if (cents.compareTo(item.getPrice()) >= 0) {
        (item.setInventory() - 1);
        dao.removeItem(itemId);
        auditDao.writeAuditEntry("Item " + item.getName() + "PURCHASED.");
        return endUserChange;
    }*/


    /*private List<Item> getAvailableItems() throws VendingPersistenceException {
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


