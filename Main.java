package java12123;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStudent quanly =  new ManageStudent();
        quanly.findAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập name");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhập điểm");
        int score = scanner.nextInt();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        quanly.add(id,name,score,age);
        quanly.findAll();
        System.out.println("nhập tên muốn xóa");
        String ten = scanner.nextLine();
        quanly.remove(ten);
        quanly.findAll();
    }
}
