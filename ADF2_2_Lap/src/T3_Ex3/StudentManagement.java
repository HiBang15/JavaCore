package T3_Ex3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class StudentManagement {
	

	protected int soluong;
	
	Student std = new Student();
	List<Student> listS = new ArrayList<>();
	
	StudentManagement(){
		super();
	}

	void inputS() {
		Scanner src = new Scanner(System.in);
		System.out.println("So luong sinh vien trong danh sach: ");
		soluong = src.nextInt();

		System.out.println("Nhap thong tin cac sinh vien trong danh sach");
		for(int i=0; i<soluong; i++) {
			std.input();
			listS.add(new Student(std.getRollNo(), std.getClazz(), std.getDiemToan(), std.getDiemLy(), std.getDiemHoa(), std.getDiemAnh(), std.getDiemVan()));
		}
	}
	void display() {
		System.out.println("+--------------------Danh sach----------------------+");
		for(Student s : listS) {

			s.display();
		}
	}
	long kiemTra(String rollNo) {
		return listS.stream().filter(a->a.getRollNo().equalsIgnoreCase(rollNo)).count();
	}
	void timKiem() {
		Scanner src = new Scanner(System.in);
		String roll;
		System.out.println("Nhap ma so sinh vien ban muon tim: ");
		roll = src.nextLine();
		if(kiemTra(roll) == 0) {
			System.out.println("Not Found!");
		}else {
			System.out.println(roll + "found");
			listS.stream().forEach(a -> {
				if(a.getRollNo().equalsIgnoreCase(roll)) {
					System.out.println(a);
				}
			});
		}
	}
	
	public Map<String, List<Student>>getMap(){
		Map<String, List<Student>> stdMap = listS.stream().collect(Collectors.groupingBy(Student::getXeploai));
		return stdMap;
	}
	
	public void xeploai(){
        Set<String> setkey = getMap().keySet();
        setkey.forEach(s -> System.out.println(s + " : " + getMap().get(s)));
    }

}
