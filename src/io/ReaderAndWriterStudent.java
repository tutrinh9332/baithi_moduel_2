package io;

import Models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterStudent {
    public void Write(List<Student> students) {
        File file = new File("student.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : students) {
                bufferedWriter.write(s.write());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> reader() {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("student.csv");
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                int Id = Integer.parseInt(arr[0]);
                String name = arr[1];
                int age = Integer.parseInt(arr[2]);
                String sexual = arr[3];
                String address = arr[4];
                double diemTB = Double.parseDouble(arr[5]);

                students.add(new Student(Id, name, age, sexual, address, diemTB));
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

}

