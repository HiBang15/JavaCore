//package S5.Lab;
//
//import java.util.Scanner;
//
//public class Input {
//
//
//    public static  void inpuInfor() throws Throwable {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter student ID : ");
//        String idStudent = sc.nextLine();
//        System.out.print("Enter student name : ");
//        String nameStudent = sc.nextLine();
//        System.out.print("Enter the number of subject :");
//        int numSubj = sc.nextInt();
//        int Tcs = 0;
//        Mark[] markArr = new Mark[numSubj];
//        for (int i = 0; i < numSubj; i++){
//            System.out.print("Enter subject name "+i +" : ");
//            sc.nextLine();
//            String nameSubject = sc.nextLine();
//            System.out.print("Enter subject coeficient : ");
//            int cs = sc.nextInt();
//            System.out.print("Enter mark of subject : ");
//            float mark = (float) sc.nextDouble();
//            System.out.print("Enter bonus of mark : ");
//            int bonus = sc.nextInt();
//            Tcs += cs;
//            Subject sbj = new Subject(nameSubject,cs);
//            Students std = new Students(idStudent,nameStudent);
//             markArr[i] = new Mark(std,sbj,mark,bonus);
//        }
//
//        double T =0,T1 = 0;
//        for(int i = 0; i < numSubj; i++){
//            T1 += (markArr[i].getM()*markArr[i].getSj().getW())*(1+(float)markArr[i].getBonus()/100);
//
//        }
//        T = T1/Tcs;
//
//        if( T<= 100){
//            for (int i = 0; i < numSubj; i++){
//                System.out.println("Subject Name : "+markArr[i].getSj().getSjName()
//                        + " | Mark : "+markArr[i].getM() + " | Bonus : "+markArr[i].getBonus());
//            }
//        }
//        if(T > 100) throw new MarkException().initCause(new Exception("Mark score above 100"));
//        if(T < 40)   throw new GradeException().initCause(new Exception("Fail"));
//        if(T >= 40 && T < 60 ) throw new GradeException().initCause(new Exception("Pass"));
//        if(T >= 60 && T < 80) throw new GradeException().initCause(new Exception("Credit"));
//        if(T >=80 && T <= 100) throw new GradeException().initCause(new Exception("Distinction"));
//
//    }
//
//}
