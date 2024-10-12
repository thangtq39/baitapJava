package session2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        //Nhập chuỗi ký tự
        System.out.print("Nhập chuỗi ký tự: ");
        String string = scanner.nextLine();

        // Nhập vào số n>1
        System.out.print("Nhập số lần lặp n>1: ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.print(string);
         } else {
            System.out.print(string);
            for (int i = 1; i < N; i++) {
                System.out.print("-" + string);
           
         } 
        }         
    }
}
        



    
