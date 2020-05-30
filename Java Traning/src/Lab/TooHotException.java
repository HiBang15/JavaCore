package Lab;

public class TooHotException extends TemperatureException{
    public TooHotException(int x){
        System.out.println("Too hot : " + x);
    }
}
