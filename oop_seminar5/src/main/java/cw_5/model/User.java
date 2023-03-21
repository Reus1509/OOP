package cw_5.model;

public class User {
    private String name;
    private Integer age;
    private Float salary;
    private Boolean haveCredit;
    private Integer balance;


    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public User() {
    }

    public User(String name, Integer age, Float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
