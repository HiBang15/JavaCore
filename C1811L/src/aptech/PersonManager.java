package aptech;
import java.util.*;
public class PersonManager {
	int nOP;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Person> psArr = new ArrayList<>();
    public void setPerson(){
        System.out.print("Enter number of person : ");
        try{
            nOP = (int)Integer.parseInt(sc.nextLine());
            if(nOP < 1) throw new NumOfPersonException("Number of Person bigger than 0 !!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        Person p = new Person();
        for(int i = 0; i < nOP; i++){
            p.input();
            psArr.add(new Person(p.getName(),p.getAge()));
        }
    }
    public void getPerson(){
        for (Person p: psArr ) {
            p.display();
        }
    }
    public Person findPerson(int x) throws NumOfPersonException{

            if(0 < x && x < nOP)    return psArr.get(x);
            else throw new NumOfPersonException("Your index doesn't exist!!!!");




    }
}
