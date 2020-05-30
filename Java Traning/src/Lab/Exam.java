//package S5.Lab;
//
//import java.util.Scanner;
//
//public class Exam {
//    public static void main(String[] args) throws Throwable{
//
//        try{
//            Input.inpuInfor();
//        }catch (StudentException e){
//            System.out.println(e.getCause().getMessage());
//        }
//
//    }
//}
//do {
//            try{
//                 w = sc.nextInt();
//                 break;
//            }catch (InputMismatchException e){
//                sc.next();
//                System.out.println("Please enter the number : ");
//            }
//        }while(true);
//		
//		package PTIT.Lan1;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Bai1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int w,h;
//        System.out.print("Enter width : ");
//        do {
//            try{
//                 w = sc.nextInt();
//                 break;
//            }catch (InputMismatchException e){
//                sc.next();
//                System.out.println("Please enter the number : ");
//            }
//        }while(true);
//
//
//        System.out.print("Enter height : ");
//        do {
//            try{
//                 h = sc.nextInt();
//                break;
//            }catch (InputMismatchException e){
//                sc.next();
//                System.out.println("Please enter the number : ");
//            }
//        }while(true);
//
//        for(int i = 0; i < h; i++){
//            for(int j = 0; j < w; j++){
//                if(j == 0||j == h-1||i == 0||i ==w-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//    }
//}