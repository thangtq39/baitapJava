package Session4;

import java.util.Scanner;

public class Lab19 {

    //liệt kê các số thuận nghịch

    public static boolean ThuanNghich(int n){
        int num1 = 0, num2 = n;
        while (n > 0) {
            num1 = num1 * 10 + n % 10;
            n /= 10;
        }
        return num1 == num2;
    }
    //tổng chữ số chia hết cho 10

    public static int sum(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /=10;
        }
        return sum;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100000; i <= 999999; i++){
            if ( ThuanNghich(i) && sum(i) % 10 == 0 ){
                System.out.println(i);
            }
           
        }                         
        System.out.print("Các số thuận nghịch có tổng chia hết cho 10: " );
    }
}

