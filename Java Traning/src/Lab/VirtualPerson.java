package Lab;

public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;
    public  static void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException {
            int temperature = cup.getTemprature();
            if(temperature <= tooCold){
                throw new TooColdException(temperature);
            }
            else if (temperature >= tooHot){
                throw new TooHotException(temperature);
            }
    }

}
