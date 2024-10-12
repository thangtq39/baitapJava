package Session4;

import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập số nguyên dương bất kỳ: ");
        int num = scanner.nextInt();
        
        for (int i = 2; i < num; i += 2){
            System.out.println("Các số chẵn nhỏ hơn "+ num +" là: " +i);
            }
        for (int j = 1; j < num; j += 2){
            System.out.println("Các số lẻ nhỏ hơn "+ num +" là: " +j);
        }
    
    }
   
}