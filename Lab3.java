package session2;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        // Nhập số nguyên thứ nhất
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số nguyên thứ hai
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();
            
        // Tính tổng các số giữa hai số
       int sum = 0;
        for (int i = num1 + 1; i < num2; i++){
            if (i > 0);
            sum += i;     
            }
        System.out.println("Tổng các số là: " +sum);
    }
}
