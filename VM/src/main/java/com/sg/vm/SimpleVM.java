/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm;

/**
 *
 * @author pro
 */
public class SimpleVM {
    
    UserIO io = new UserIOConsolImpl();
    Double money;
    int userChoice;
    int quantitySnorlax = 3;
    BigDecimal price = "0";
    
    public void printMenu() {
        io.print("POKEMONS");
        io.print("1. Snorlax - 25");
        io.print("2. Picachu - 40");
        io.print("3. Eevee   - 50");
        io.print("4. Mewtwo  - 35");
        io.print("5. Exit");
        
    }
    //Getting amount of money
    public double getMoney(){
        
        money = io.readDouble("Please PUT IN your money");
        return money;
    }
    
    //Getting selection
    public int getSelection() {
        userChoice = io.readInt("Awsome! Now, select your Pokemon.");
        return userChoice;
    }
    
    //monetary calculation
    if (money == price) {
       io.print ("Success!"); 
    } else if (){
    
    }else
    if
  
    
}
    
   
    
}
