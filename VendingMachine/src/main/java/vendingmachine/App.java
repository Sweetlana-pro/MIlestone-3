/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import com.sg.vendingmachine.controller.VendingMachineController;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsolImpl;
import com.sg.vendingmachine.ui.VendingMachineView;

/**
 *
 * @Sweetlana Protsenko
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsolImpl();
        VendingMachineView myView = new VendingMachineView(myIo);
        VendingMachineDao myDao = new VendingMachineDaoFileImpl();
        VendingMachineController controller = new VendingMachineController(myDao, myView);
        controller.run();
    }
    
}
