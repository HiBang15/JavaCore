package T2_Ex2;

import java.util.List;

public interface IComputerManagement {
	List<Computer> timKiemTheoTen(String computerName);
	Computer priceMax();
	Computer priceMin();
}
