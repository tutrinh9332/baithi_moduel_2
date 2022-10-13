package Manager;

import Models.Student;
import io.ReaderAndWriterStudent;
import sort.SortByScore;
import validate.ValidateStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    ValidateStudent validateStudent = new ValidateStudent();
    ReaderAndWriterStudent readerAndWriter = new ReaderAndWriterStudent();


    public ManagerStudent() {
        readerAndWriter.reader();
    }

    public void menu() {
        System.out.println("------Menu------");
        System.out.println("1. Show students");
        System.out.println("2. Create students");
        System.out.println("3. Edit students");
        System.out.println("4. Delete students");
        System.out.println("5. Sort students by list");
        System.out.println("6. Read on file");
        System.out.println("7. Writer on file");
        System.out.println("8. Exit Program");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                showStudentList();
                break;
            case 2:
                addStudent(createStudent());
                readerAndWriter.Write(students);
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                sortByDiemTB();
                break;
            case 6:
                students = readerAndWriter.reader();
                System.out.println("đọc thành công");
                break;
            case 7:
                readerAndWriter.Write(students);
                break;
            case 8:
                System.exit(0);
                break;
        }

    }

    public void showStudentList() {
        for (Student sv : students) {
            System.out.println(sv);
        }

    }

    public Student createStudent() {
        int id = validateStudent.validateId(students);
        String name = validateStudent.validateString(" name :");
        int age = validateStudent.validateAge();
        String sexual = validateStudent.validateString(" gender :");
        String address = validateStudent.validateString(" address :");
        double diemTB = validateStudent.validateDiemTB();
        return new Student(id, name, age, sexual, address, diemTB);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void editStudent() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        int index = validateStudent.getIndexId(id,students);
        if (index != -1){
            students.set(index, createStudent());
        } else {
            System.err.println("id không tồn tại");
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        int index = validateStudent.getIndexId(id,students);
        if (index != -1){
            students.remove(index);
        } else {
            System.err.println("id không tồn tại");
        }
    }

    public void sortByDiemTB(){
        students.sort(new SortByScore());
        System.out.println("sắp xếp thành công");
    }
}