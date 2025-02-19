public class SanPham{
	// Dinh nghia cac thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // ten file anh
	// Ham tao
	public SanPham() {
		// khoi tao gia tri ban dau cho cac thuoc tinh neu co o day
	}
	 public SanPham(int maSP, String _tenSP, String _ loaiSP, String _ anhSP) {
		 // khoi tao gia tri ban dau cho cac thuoc tinh neu co o day
		 maSP = _maSP;
		 tenSP = _ tenSP;
		 loaiSP = _loaiSP;
		 anhSP = _ anhSP;
	 }
}