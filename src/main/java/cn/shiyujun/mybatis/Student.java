package cn.shiyujun.mybatis;

/**
 * @author jsf
 * @description:
 * @date 12/16/2020 9:54 AM
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String sex;

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
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String id, String name, String age, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
        super();
    }
}