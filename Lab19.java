package Session3;
import java.util.Scanner;

public class Lab19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số hàng
        System.out.print("Nhập vào số hàng: ");
        int num1 = scanner.nextInt();
       
        for (int a = num1; a >= 1; a--){
            for (int b = a; b < num1; b++){
                System.out.print("  ");
            }
            for (int b = 1; b <= (2 * a - 1); b++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
}
