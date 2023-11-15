package java12123;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    private ArrayList<Student> students = new ArrayList<>();

    public void findAll() {
        System.out.println("Danh sách học sinh trong lớp:");
        for (Student hocSinh : students) {
            System.out.println("id " + hocSinh.getId() + " Tên: " + hocSinh.getName() + ", Tuổi: " + hocSinh.getAge() + " Điểm: 1" + hocSinh.getScore());
        }
    }

    public void add(int id, String name, int score, int age) {
        Student hocSinhMoi = new Student(id, name, score, age);
        students.add(hocSinhMoi);
    }
    public void remove(String name) {
        for (Student hocSinh : students) {
            if (hocSinh.getName().equals(name)) {
                students.remove(hocSinh);
                System.out.println("Học sinh " + name + " đã được xóa khỏi lớp.");
                return;
            }
        }
    }
}
