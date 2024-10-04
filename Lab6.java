package session2;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // nhập số nguyên dương
        System.out.print("Nhập số nguyên dương: ");
            int num = scanner.nextInt();
            int sum = sumOfDivisors(num);
        System.out.print("Tổng các ước số "+ num +" là: " +sum);    
        }

         // Tính tổng các ước số       
    public static int sumOfDivisors(int num) {     
            int sum = 0;
            for (int i = 1; i <= num; i++){
                if (num % i == 0){
                sum += i;
            System.out.println("Ước số của "+ num +" là: " +i );
            }       
        }
        return sum;
        
    }
   
} 

