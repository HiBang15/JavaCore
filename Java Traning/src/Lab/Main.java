package Lab;

public class Main {
    public static void main(String[] args) throws TemperatureException {
        CoffeeCup cup = new CoffeeCup();
        try{
            VirtualPerson cust = new VirtualPerson();
            cust.drinkCoffee(cup);
//            VirtualCafe.serveCustomer(cust,cup);
        }catch (TooColdException e){
//            System.out.println(e);
        }
        catch (TooHotException e){
//            System.out.println(e);
        }
//        VirtualPerson cust = new VirtualPerson();
//        VirtualCafe.serveCustomer(cust,cup);
    }
}
