/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainedexception;
public class TemperatureException extends Exception {
    public TemperatureException(){}
    public TemperatureException(int temperature) {
        //this.temperature = temperature;
    }
}
