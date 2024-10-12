package Session3;
import java.util.Scanner;

public class Lab20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số hàng
        System.out.print("Nhập vào số hàng: ");
        int num1 = scanner.nextInt();
       
        for (int a = 0; a < num1; a++){
            for (int b = 0; b < num1; b++){
                if (a == 0 || a == num1 - 1 || b % 2 == 0){
                System.out.print("* ");
                } else {
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }        
}
