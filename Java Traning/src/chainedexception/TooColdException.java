/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainedexception;
public class TooColdException extends TemperatureException {
    public TooColdException(){}
    public TooColdException(int temperature) {
        super(temperature);
        System.out.println("The tempeature less than "+temperature +" Celius");
    }
}
