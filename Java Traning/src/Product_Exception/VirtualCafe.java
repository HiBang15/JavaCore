package Product_Exception;

public class VirtualCafe {
	public static void serveCustomer(VirtualPerson cust, CoffeeCup cup){
        try{
            cust.drinkCoffee(cup);
            System.out.println("Coffee tastes just right.");
        }
        catch (TooColdException e){
            System.out.println("Coffee is too cold");
        }
        catch (TooHotException e){
            System.out.println("Coffee is too hot");
        }
        catch(TemperatureException e){
            System.out.println("There's temperature trouble in this coffee");
        }

    }
}
