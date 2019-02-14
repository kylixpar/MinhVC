package Order;

public class Main {
	public static void main(String[] args) {
		SanPham iPX = new SanPham(1, "iPX", 20000000, 2000);
		SanPham XiaoMi = new SanPham (2, "XiaoMi", 6000000, 500);
		SanPham SamSung = new SanPham (3, "SamSung", 10000000, 0);
		
		DonHang donHang1 = new DonHang(1);
		donHang1.themSP(iPX);
		donHang1.themSP(XiaoMi, 20);
		donHang1.themSP(SamSung);
		System.out.println("Danh sach san pham trong don hang: ");
		for (int i = 0; i< donHang1.dsSanPham.size(); i++) {
			System.out.println(donHang1.dsSanPham.get(i).ten);
		}
		System.out.println("Tong Tien: " + donHang1.tongTien);
	}
}
