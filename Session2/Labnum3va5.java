package session2;

import java.util.Scanner;

public class Labnum3va5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // nhập số nguyên dương
        System.out.print("Nhập số nguyên dương: ");
            int num = scanner.nextInt();

        // Kiểm tra và in kết quả
        if (num % 3 == 0 && num % 5 ==0){
            System.out.println(num + " Đồng thời chia hết cho cả 3 và 5.");
        }
        else {
            System.out.println(num + " Không đồng thời chia hết cho cả 3 và 5.");
        }
    } 
}
