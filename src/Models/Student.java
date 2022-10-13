package Models;

public class Student {
    private  int Id;
    private  String name;
    private int age;
    private String gender;
    private String address;
    private double diemTB;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String address, double diemTB) {
        Id = id;
        this.name = name;
        this.age = age;

        this.gender = gender;
        this.address = address;
        this.diemTB = diemTB;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexual() {
        return gender;
    }

    public void setSexual(String sexual) {
        this.gender = sexual;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return " Student {" +
                " Id = " + Id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", sexual =' " + gender + '\'' +
                ", address =' " + address + '\'' +
                ", diemTB = " + diemTB +
                '}';
    }
    public String write(){
        return  + getId()+ "," + getName() + "," + getAge() + ","+ getSexual() + "," + getAddress() + "," + getDiemTB();
    }
}
