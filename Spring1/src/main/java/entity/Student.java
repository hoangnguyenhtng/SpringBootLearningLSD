package entity;

public class Student {
    String fullName;
    String age;
    String gender;
    String birthday;
    String address;
    String className;


    public Student(String fullName, String age, String gender, String birthday, String address, String className) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.className = className;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
