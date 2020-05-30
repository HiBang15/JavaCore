package T2_Ex2;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class ComputerManagement implements IComputerManagement {
	private int soluong;
	
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	List<Computer> listC = new ArrayList();
	public void inputCpt() {
		Computer c = new Computer(); 
		Scanner src = new Scanner(System.in);
		System.out.println("Nhap so luong may tinh: ");
		soluong = src.nextInt();
		src.nextLine();
		for(int i=0;  i<soluong; i++) {
			c.input();
//			listC.add(new Computer(c.getName(), c.getModel(), c.getOs(), c.getPrice()));
			
		}
	}
	public void displayCpt() {
		System.out.println("+-------------Danh sach may tinh--------------+");
		for(Computer c : listC) {
			System.out.println(c.toString());
		}
	}
	@Override
	public List<Computer> timKiemTheoTen(String computerName) {
		
		List<Computer> str = listC.stream().filter(p->p.equals(computerName)).collect(Collectors.toList());
		return str;
	}

	@Override
	public Computer priceMax() {
		
		Collections.sort(listC, new Comparator<Computer>(){
			@Override
			public int compare(Computer c1, Computer c2) {
				return Float.compare(c1.getPrice(), c2.getPrice());
			}
		});
			
		return listC.get(0) ;
	}

	@Override
	public Computer priceMin() {
		
		Collections.sort(listC, new Comparator<Computer>(){
			@Override
			public int compare(Computer c1, Computer c2) {
				return Float.compare(c2.getPrice(), c1.getPrice());
			}
		});
			
		return listC.get(0) ;
	}

}
