/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainedexception;
import java.io.IOException;
public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;
    public VirtualPerson(){}
    public void drinkCoffee(CoffeeCup cup) throws Throwable{
        if (cup.getTemperature()<= tooCold) {
           throw new TooColdException().initCause(new Exception("Too Cold"));
        }
        if (cup.getTemperature() >= tooHot){
           throw new TooHotException().initCause(new Exception("Too Hot"));
        }
    }
}
