import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Tính căn delta
        double canDelta = Math.sqrt(delta);
        
        // Xuất kết quả
        System.out.println("\nKết quả:");
        System.out.printf("Delta: %.2f\n", delta);
        System.out.printf("Căn Delta: %.2f\n", canDelta);
        
        
        scanner.close();
    }
}
