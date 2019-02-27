package Assignment9;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new KhachHangVN(1," Minh.", LocalDate.parse("2019-12-12"), 19, "Ca nhan"));
		arrayList.add(new KhachHangVN(2," Vuong.", LocalDate.parse("2019-02-15"), 4, "Doanh Nghiep"));
		arrayList.add(new KhachHangNN(1," Kylix.", LocalDate.parse("2019-12-01"), 19, "USA"));
		arrayList.add(new KhachHangNN(2," Par.", LocalDate.parse("2017-11-14"), 93, "My"));
		int soLuong_KHVN = 0;
		int soLuong_KHNN = 0;
		float tongTienNN = 0;
		ArrayList<String> hd = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) instanceof KhachHangVN) {
				KhachHangVN x = (KhachHangVN)arrayList.get(i);
				System.out.println(x.id + " Name: " + x.name + " So tien: "+x.tinhTien());
				soLuong_KHVN++;
				if(x.ex_date.getMonth().getValue() == 2 && x.ex_date.getYear() == 2019) {
					hd.add(x.id + " Name: "+x.name+ " So Tien: "+ x.tinhTien());
				}
			} else {
				KhachHangNN y = (KhachHangNN)arrayList.get(i);
				System.out.println(y.id+ " Name: "+y.name + " So Tien: "+ y.tinhTien());
				soLuong_KHNN++;
				tongTienNN += y.tinhTien();
				if (y.ex_date.getMonth().getValue() == 2 && y.ex_date.getYear() == 2019) {
					hd.add(y.id + "Name: " +y.name + " So Tien: "+ y.tinhTien());
				}
			}
		}
		System.out.println("Khach Hang VN: "+soLuong_KHVN+ " KhachHang NN: "+soLuong_KHNN);
		System.out.println("Trung Binh Tien Khach Hang NN: " +tongTienNN/soLuong_KHNN);
		for (String i: hd) {
			System.out.println(i);
		}
	}
}
