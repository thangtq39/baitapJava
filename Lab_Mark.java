package session2;

import java.util.Scanner;

public class Lab_Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        //Nhập giá trị Mark
        System.out.print("Nhập giá trị từ 0 -> 100: ");
        int num = scanner.nextInt();

        //Kiểm tra giá trị
        if (num >= 85) {
            System.out.print("Giá trị thuộc nhóm A");
        }
        else if (num >= 70){
            System.out.print("Giá trị thuộc nhóm B");
        }
        else if (num >= 40){
            System.out.print("Giá trị thuộc nhóm C");
        }
        else {
            System.out.print("Giá trị thuộc nhóm D");
        }
    }
}
