import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài và chiều rộng hình chữ nhật
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);
        
        // Xuất kết quả
        System.out.println("\nKết quả:");
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
        
        
        scanner.close();
    }
}
