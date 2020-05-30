/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainedexception;
public class TooHotException extends TemperatureException {
    public TooHotException(){}
    public TooHotException(int temperature) {
       super(temperature);
       System.out.println("The Temperature more than "+temperature+ " Celius");
    }
}
