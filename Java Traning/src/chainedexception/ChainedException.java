package chainedexception;
public class ChainedException {
    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
       CoffeeCup cup = new CoffeeCup();
       cup.setTemperature(95);
        try {
            VirtualPerson cust = new VirtualPerson();
            cust.drinkCoffee(cup);
        }
        catch (TemperatureException e){
           System.out.println(e.getCause().getMessage());
        }
    }
}
