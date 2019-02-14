package Order;

public class SanPham {
	public int ID;
	public String ten;
	public double giaTien;
	public int soLuong;
	
	public SanPham(int ID, String ten, double giaTien, int soLuong) {
		this.ID = ID;
		this.ten = ten;
		this.giaTien = giaTien;
		this.soLuong = soLuong;
	}
	public int hienThiSL() {
		return this.soLuong;
	}
}
