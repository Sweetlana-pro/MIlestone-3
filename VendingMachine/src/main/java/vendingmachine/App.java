/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import com.sg.vendingmachine.controller.VendingMachineController;

/**
 *
 * @Sweetlana Protsenko
 */
public class App {
    public static void main(String[] args) {
        VendingMachineController controller = new VendingMachineController();
        controller.run();
    }
    
}