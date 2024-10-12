package session2;

import java.util.Scanner;

public class Lab4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số cần kiểm tra
        System.out.print("Nhập số cần kiểm tra: ");
        int num = scanner.nextInt();

        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num) {

        if (num <= 1){
           // System.out.print(false);
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            //System.out.print(false);
            return false;
            }
        }
        //System.out.print(true); 
        return true; 
    }
}
