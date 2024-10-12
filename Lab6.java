package Session3;

import java.util.Scanner;

public class Lab6 {
    //Viết chương trình tính tổng các chữ số của một số nguyên bất kỳ
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập số nguyên dương bất kỳ: ");
        int num = scanner.nextInt();
        //Tính tống các chữ số
        int sum = 0;
        while (num > 0) {
            int i = num % 10;
            sum += i;
            num = num / 10;
        }
        System.out.println("Tổng các số tự nhiên là: " +sum);
  
    }
}

