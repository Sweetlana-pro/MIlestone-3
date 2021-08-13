/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

/**
 *
 * @Sweetlana Protsenko
 */
public class VendingMachineView {
    
    private UserIO io = new UserIOConsolImpl();
    Double money;
    int menuSelection;
    
    public void printMenu() {
        io.print("POKEMONS");
        io.print("1. Snorlax - $0.25");
        io.print("2. Picachu - $0.45");
        io.print("3. Eevee   - $0.50");
        io.print("4. Mewtwo  - $0.60");
        io.print("5. Exit");
        
    }
    //Getting money
    public double getMoney(){
        
        money = io.readDouble("Please PUT IN your money");
        return money;
    }
    
    //Getting selection
    public int getSelection() {
        int menuSelection = io.readInt("Awsome! Now, select your Pokemon.");
        boolean keepGoing = true;
        
        while (keepGoing) { 
            switch (menuSelection) {
                case 1:
                    io.print("You choose SNORLAX.");
                    break;
                case 2: 
                    io.print("You choose PICACHU.");
                    break;
                case 3:
                    io.print("You choose EEVEE.");
                    break;
                case 4:
                    io.print("You choose MEWTWO.");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
        }
        return menuSelection;
    }
    //
    
   
    
}
