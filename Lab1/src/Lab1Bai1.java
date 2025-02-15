import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập họ và tên sinh viên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        
        
        System.out.print("Điểm TB: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next(); 
        }
        double diemTB = scanner.nextDouble();
        scanner.nextLine(); 
        
       
        System.out.println("\nThông tin sinh viên:");
        System.out.print("Họ và tên: " + hoTen + "\n");
        System.out.printf("%s %.2f điểm\n", hoTen, diemTB);
        System.out.println("Kết thúc chương trình.");
        
      
        scanner.close();
    }
}
