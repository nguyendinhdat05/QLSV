package java12123;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManageStudent quanly = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        int choice = 1 ;
        while ( choice != 0) {
            System.out.println("" +
                    "\n 0.thoat"+
                    "\n 1.xem danh sach"+
                    "\n 2.them moi" +
                    "\n 3.xoa" +
                    "\n 4.tim kiem theo id");
            choice = scanner.nextInt();
            if ( choice == 0){
                break;
            }
            if ( choice == 1 ){
                quanly.findAll();
            }
            if ( choice == 2) {
                System.out.println("nhập vào id");
                int newid = scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập vào tên");
                String newname = scanner.nextLine();
                System.out.println("nhập vào điểm");
                int newscore = scanner.nextInt();
                System.out.println("nhập vào tuổi");
                int newage = scanner.nextInt();
                Student student = new Student(newid, newname, newscore, newage);
                quanly.add(student);
            }
            if ( choice == 3) {
                System.out.println("nhập vào id");
                int idd = scanner.nextInt();
                quanly.remove(idd);
            }
            if ( choice == 4) {
                System.out.println("nhaapj vao id");
                int id = scanner.nextInt();
//                    quanly.timBangID(id);
                System.out.println(quanly.timBangID(id));

            }
        }
    }
}
