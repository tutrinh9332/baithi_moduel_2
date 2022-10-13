package validate;
import Models.Student;

import java.util.List;
import java.util.Scanner;

public class ValidateStudent {
    Scanner sc = new Scanner(System.in);

    public int validateId(List<Student> students) {
        while (true) {
            try {
                System.out.println(" Nhập  id");
                int id = Integer.parseInt(sc.nextLine());
                if (getIndexId(id,students)!=-1){
                    throw new Exception();
                }
                return id;
            } catch (Exception e) {
                System.err.println("Nhập sai id rồi");
            }
        }
    }

    public int getIndexId(int id, List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String validateString(String name){
        while (true){
            System.out.println("Nhập " + name);
            String str = sc.nextLine();
            if(str.equals("")){
                System.err.println("Không đc để trống");
                continue;
            }else {
                return str;
            }
        }
    }

    public int validateAge(){
        while (true) {
            try {
                System.out.println(" Nhập age ");
                int age = Integer.parseInt(sc.nextLine());
                return age;

            } catch (Exception e) {
                System.err.println("Nhập sai age rồi");
            }
        }
    }

    public int validateDiemTB(){
        while (true) {
            try {
                System.out.println(" Nhập điểm ");
                int diemTB = Integer.parseInt(sc.nextLine());
                return diemTB;

            } catch (Exception e) {
                System.err.println("Nhập sai điểm rồi");
            }
        }
    }
}
