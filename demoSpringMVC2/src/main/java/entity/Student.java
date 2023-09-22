package entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Student {
    @NotEmpty(message = "Chưa nhập mã sinh viên")
    public String id;
    @NotEmpty(message = "Chưa nhập tên sinh viên")
    public String name;
    @NotNull(message = "Chưa chọn giới tính")
    public Boolean gender;
    @NotNull(message = "Chưa chon ngày sinh")
    public Date birthday;
    @NotEmpty(message = "Chưa điền địa chỉ")
    public String address;
    @NotEmpty(message = "Chưa chọn class")
    public String className;

    public Student() {
    }

    public Student(String id, String name, Boolean gender, Date birthday, String address, String className) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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
