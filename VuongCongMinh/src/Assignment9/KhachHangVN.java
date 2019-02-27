package Assignment9;
import java.time.LocalDate;
public class KhachHangVN extends KhachHang{
	String doiTuongKH;
	public KhachHangVN(int id, String name, LocalDate ex_date, int soLuong, String doiTuongKH) {
		this.id = id;
		this.name = name;
		this.ex_date = ex_date;
		this.soLuong = soLuong;
		this.doiTuongKH = doiTuongKH;
	}
	
	@Override
	public int tinhTien() {
		int thanhTien = 0;
		if (this.soLuong < KhachHang.DM1) {
			thanhTien = this.soLuong * KhachHang.M1;
		} else if (this.soLuong >= KhachHang.DM1 && this.soLuong <= KhachHang.DM2) {
			thanhTien = KhachHang.DM1 * KhachHang.DM1 + (this.soLuong - KhachHang.DM1)* KhachHang.DM2;
		} else if (this.soLuong > KhachHang.DM2 && this.soLuong <= KhachHang.DM3) {
			thanhTien = KhachHang.DM1 * KhachHang.DM1 + (KhachHang.DM2 - KhachHang.DM1) * KhachHang.M2 + (this.soLuong - KhachHang.DM2) * KhachHang.DM3;
		} else {
			thanhTien = KhachHang.DM1 * KhachHang.DM1 + (KhachHang.DM2 - KhachHang.DM1) * KhachHang.DM2 + (KhachHang.DM3 - KhachHang.DM2) * KhachHang.M3 + (this.soLuong - KhachHang.DM3) * KhachHang.M4;
		}
		return thanhTien;
	}
}
