package aptech;

import java.util.*;

public class Main2 {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PersonManager pm = new PersonManager();
        do {
            System.out.println("======MENU======");
            System.out.println("1.Input person.");
            System.out.println("2.Find person.");
            System.out.println("3.Exit");
            System.out.println("=================");
            System.out.print("Enter your choice : ");
            int choice = (int)Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 : pm.setPerson(); break;
                case 2 :{
                    System.out.print("Enter index : ");
                    int index =(int) Integer.parseInt(sc.nextLine());
                    try {
                        pm.findPerson(index).display();
                    }catch (NumOfPersonException e ){
                        System.out.println(e.getMessage());
                    }

                } break;
                case 3: System.exit(0);  break;
            }
        }while (true);
    }
}
