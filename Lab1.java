package Session3;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();
        System.out.print("Nhập số thứ tư: ");
        int num4 = scanner.nextInt();

        int i = num1;
            if (num2 > i) i = num2;
            if (num3 > i) i = num3;
            if (num4 > i) i = num4;
        System.out.print("Số lớn nhất trong bốn số đã nhập là: " + i);


    }
    
}
