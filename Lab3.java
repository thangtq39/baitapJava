package Session3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        System.out.println("Ước số chung lớn nhất của " + num1 + " và " + num2 + " là: " + a(num1, num2));
        System.out.println("Bội số chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + b(num1, num2));
    }
    public static int a (int num1, int num2) {
        if (num2 == 0) return num1;
            return a(num2, num1 % num2);
        }

    public static int b (int num1, int num2) {
            return (num1 * num2) / a(num1, num2);
         }
}
