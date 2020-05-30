/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2_Lambda;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author ADMIN
 */
public class Management {

    List<Student> stdList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void cau1() {
        while (true) {
            System.out.print("Enter roll number :");
            String rollNo = sc.nextLine();

            System.out.print("Enter class : ");
            String clazz = sc.nextLine();

            System.out.print("Enter math's mark : ");
            float mathM = Float.parseFloat(sc.nextLine());

            System.out.print("Enter physical's mark : ");
            float phyM = Float.parseFloat(sc.nextLine());
            
            System.out.print("Enter chemistry's mark : ");
            float cheM = Float.parseFloat(sc.nextLine());

            System.out.print("Enter literature's mark : ");
            float litM = Float.parseFloat(sc.nextLine());

            System.out.print("Enter english's mark : ");
            float engM = Float.parseFloat(sc.nextLine());
            if (kiemTra(rollNo) == 0) {
                stdList.add(new Student(rollNo, clazz, engM, phyM, cheM, litM, engM));
                break;
            }else{
                System.out.println("Roll number invalid !!!!");
            }
            
        }

    }
    public void cau2(){
        stdList.forEach(s -> System.out.println(s));
    }
    public void cau3(){
        System.out.print("Enter roll number who you want to find : ");
        String rollNum = sc.nextLine();
        if(kiemTra(rollNum)==0) System.out.println("Not Found");
        else{
            System.out.println(kiemTra(rollNum) + " founds");
            stdList.stream().forEach(a -> {
                if(a.getRollNo().equals(rollNum))
                    System.out.println(a);
            });
        }
    }
    
    public Map<String,List<Student>> getMap(){
        Map<String,List<Student>> stdMap = stdList.stream().collect(Collectors.groupingBy(Student::getXeploai));
        return stdMap;
    }
    
    public void cau4(){
        Set<String> setkey = getMap().keySet();
        setkey.forEach(s -> System.out.println(s + " : " + getMap().get(s)));
    }
    
    private long kiemTra(String rollNo) {
        return stdList.stream().filter(a -> a.getRollNo().equals(rollNo)).count();
    }	

}
