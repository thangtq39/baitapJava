package Session3;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập số nguyên dương bất kỳ: ");
        int num = scanner.nextInt();
        //Tính tống các số nguyên nhỏ hơn
        int sum = 0;
        for (int i = 1; i < num; i++){
        sum += i;
    }
    System.out.println("Tổng các số nhỏ hơn "+ num +" là: " +sum);

    System.out.println("Tổng các số chẵn nhỏ hơn "+ num +" là:" +sumOfEvenNumbersLessThanN(num));

    System.out.println("Tổng các số lẻ nhỏ hơn "+ num +" là:" +sumOfOddNumbersLessThanN(num));
    }

    public static int sumOfEvenNumbersLessThanN(int num) {
        int sum = 0;
        for (int i = 2; i < num; i += 2){
            sum += i;
        }
            return sum;
    }
   
    public static int sumOfOddNumbersLessThanN(int num){
        int sum = 0;
        for (int i = 1; i < num; i += 2){
            sum += i;
        }
            return sum;
    }
}
