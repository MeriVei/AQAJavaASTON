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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("ФИО: "+name+"\t"+
                            "должность: "+jobTitle+"\t"+
                            "email: " +email+"\t"+
                            "телефон: " +phone+"\t"+
                            "зарплата: "+salary+"\t"+
                            "возраст: "+age);
    }
}
