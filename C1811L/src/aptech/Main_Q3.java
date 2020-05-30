package aptech;
import java.util.*;
public class Main_Q3 {
	public static void highestSalary(List<Manage> mngL){
        double max = 0;
        int index = 0;
        for(int i = 0; i < mngL.size(); i++){
            if(mngL.get(i).getSalary() > max){
                max = mngL.get(i).getSalary();
                index = i;
            }
        }
        mngL.get(index).display();
    }
    public static void main(String[] args) {
        Manage mng = new Manage();
        Scanner sc = new Scanner(System.in);
        List<Manage> mngL = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            mng.input();
            Manage m = new Manage(mng.getName(), mng.getAge(), mng.getSalary());
            mngL.add(m);
        }
        for (Manage m : mngL) {
            m.setSalary(m.calculateTax());
        }
        highestSalary(mngL);

    }
}
