package Product_Exception;

public class TooColdException extends TemperatureException{
    public TooColdException(int x){
        System.out.println("Too cold : " + x);
    }
}
