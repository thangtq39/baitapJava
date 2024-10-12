package Session3;

import java.util.Scanner;

public class Lab13 {

    //Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập số nguyên dương bất kỳ: ");
        int num = scanner.nextInt();
        //Tính tống các số nguyên nhỏ hơn num và chia hết cho 7
        int sum = 0;
        for (int i = 1; i <= num; i++){
            if (i % 7 == 0){
            sum += i;
            }
        }
    System.out.println("Tổng các số tự nhiên và chia hết cho 7 là: " +sum);
  
    }
}

