package Session3;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số hàng
        System.out.print("Nhập vào số hàng: ");
        int num1 = scanner.nextInt();

        //Nhập vào số cột
        System.out.print("Nhập vào số cột: ");
        int num2 = scanner.nextInt();

        for (int a = 1; a <= num1; a++){
            for (int b = 1; b <= num2; b++){
                if (a >= 2 && a <= num1 - 1){
                    if (b == 1 || b == num2) System.out.print("* ");
               else System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
