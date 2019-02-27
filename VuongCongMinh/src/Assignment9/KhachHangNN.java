package Assignment9;
import java.time.LocalDate;
public class KhachHangNN extends KhachHang{
	public String quocTich;
	
	public KhachHangNN(int id, String name, LocalDate ex_date, int soLuong, String quocTich) {
		this.id = id;
		this.name = name;
		this.ex_date = ex_date;
		this.soLuong = soLuong;
		this.quocTich = quocTich;
	}
	
	public int tinhTien() {
		return this.soLuong * KhachHang.M4;
	}
}
