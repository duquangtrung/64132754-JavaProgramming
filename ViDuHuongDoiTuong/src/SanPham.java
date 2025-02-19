public class CT {

	public static void main(String[] args) {
		// tạo ra hai sản phẩm (hardcode)
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "bánh chuối", "đồ an nhanh", "nc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("BiaSG");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("sg.png");
		
		//In ra màn hình 2 sản phẩm
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Ma san pham 2 la " + sp2.getMaSP();
		       thongtinSP2 += "Tên SP2 la " + sp2.getTenSP();
		       
		System.out.print(thongtinSP1);
		System.out.print(thongtinSP2);
		

	}

}