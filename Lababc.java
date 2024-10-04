package session2;
import java.util.Scanner;
public class Lababc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // nhập số nguyên dương
            System.out.print("Nhập số nguyên dương a: ");
            int num1 = scanner.nextInt();
            System.err.print("Nhập số nguyên dương b: ");
            int num2 = scanner.nextInt();
            System.out.print("Nhập số nguyên dương c: ");
            int num3 = scanner.nextInt();

        // Kiểm tra và in kết quả
        if (num3 == num1 + num2){
            System.out.print(+ num3 + " bằng a+b");
        }
        else {
            System.out.print(+ num3 + " khác a+b.");
        }
    } 
}

