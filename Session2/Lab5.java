package session2;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập số nguyên dương bất kỳ: ");
        int num = scanner.nextInt();
        int sum = 0;

        //Tính tống các số nguyên nhỏ hơn
        for (int i = 1; i <= num; i++){
        sum += i;
    }
    System.out.print("Tổng các số nhỏ hơn "+ num +" là:" +sum);

    }
}
