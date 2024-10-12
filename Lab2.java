package Session3;
import java.util.Scanner;
public class Lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
        System.out.print("Nhập một số tự nhiên: ");
        int num = scanner.nextInt();

        int count = countDivisors(num);
        System.out.print("Tổng ước số tìm được: " +count);
        }
    public static int countDivisors(int n) {
        int count = 0;

            for (int i = 1; i <= n; i++){
                if (n % i == 0) {
                count++;
                }
            }
        return count;
    }
}
