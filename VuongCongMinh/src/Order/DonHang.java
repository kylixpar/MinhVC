package Order;
import java.util.ArrayList;

public class DonHang {
	public int ID;
	public double tongTien;
	public ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();
	
	public DonHang(int ID){
		this.ID = ID;
		this.tongTien = 0;
	}
	public void themSP(SanPham s) {
		if(s.soLuong > 0) {
			dsSanPham.add(s);
			this.tongTien += s.giaTien;
		}
		else {
			System.out.println(s.ten + "het hang.");
		}
	}
		public void themSP(SanPham s, int giamGia) {
			if (s.hienThiSL() > 0) {
				dsSanPham.add(s);
				this.tongTien += s.giaTien * giamGia/100;
			}
			else
				System.out.println("San pham het hang.");
		}
}
