package java12123;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    private ArrayList<Student> students = new ArrayList<>();


    public void findAll() {
        System.out.println("Danh sách học sinh trong lớp:");
        for (Student hocSinh : students) {
            System.out.println("id: " + hocSinh.getId() + " Tên: " + hocSinh.getName() + ", Tuổi: " + hocSinh.getAge() + " Điểm: 1" + hocSinh.getScore());
        }
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(int idd) {
        int index = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if (idd == this.students.get(i).getId()) {
                index = i;
            }
        }
        this.students.remove(index);
    }


    public Student timBangID(int id){
        int index = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if ( id == this.students.get(i).getId()) {
                index = i;
                return students.get(index);
            }
        }
        return null;
    }

    public void update(int id , Student student){
        int index = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if ( id == this.students.get(i).getId()) {
                index = i;
            }
        }
        students.set(index, student);
    }
        
}

