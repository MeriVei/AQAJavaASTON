public class Employee {
    private String name;
    private String jobTitle;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String jobTitle, String email, int phone, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("ФИО: " + name + "\t" +
                "должность: " + jobTitle + "\t" +
                "email: " + email + "\t" +
                "телефон: " + phone + "\t" +
                "зарплата: " + salary + "\t" +
                "возраст: " + age);
    }
}
