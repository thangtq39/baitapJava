package session2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tính tổng các số chia hết cho 5 từ 0 => 100
            int Sum = 0;

        for (int Num = 0; Num <= 100; Num++){
            if (Num % 5 != 0) {
              continue;
            }
            System.out.println("Num = " + Num);
            Sum +=Num;
            System.out.println("sum = " + Sum);
        }
        System.out.println("Các số chia hết cho 5: " +Sum);;
    }
}
