import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("№1");
        int numbersSize = (int) (Math.random() * 20 + 1);
        List<Integer> numbers = new ArrayList<>(numbersSize);
        for (int i = 0; i < numbersSize; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.print("Количество четных чисел: "
                + numbers.stream().filter(n -> n % 2 == 0).count()
                + "\nСами числа: ");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //2
        System.out.println("№2");
        List<String> stringList = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));
        System.out.print("Коллекция: ");
        stringList.forEach(s -> System.out.print(s + " "));
        System.out.println("\nОбъект \"High\" встречается в коллекции "
                + stringList.stream().filter(s -> s.equals("High")).count() + " раз");
        System.out.println("Первый элемент коллекции: "
                + stringList.stream().findFirst().orElse("0"));

        //3
        System.out.println("№3");
        List<String> list = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));
        System.out.print("Коллекция: ");
        list.forEach(l -> System.out.print(l + " "));
        System.out.println();
        String[] masList = list.stream().sorted(new ComparatorString()).toArray(String[]::new);
        System.out.print("Массив: ");
        Arrays.stream(masList).forEach(m -> System.out.print(m + " "));
        System.out.println();

        //4
        System.out.println("№4");
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 20, Gender.MAN)
        );
        System.out.println("Коллекция:");
        students.forEach(student -> System.out.println(student.toString()));
        int sumAges = students.stream().filter(student -> student.getSex() == Gender.MAN)
                .reduce(0, (x, y) -> x + y.getAge(), Integer::sum);
        System.out.println("Средний возраст студентов: "
                + (sumAges / students.stream().filter(student -> student.getSex() == Gender.MAN).count()));
        System.out.println("Повестку получат:");
        students.stream().filter(s -> s.getSex() == Gender.MAN && s.getAge() >= 18 && s.getAge() <= 27)
                .forEach(s -> System.out.println(s.getName()));

        //5
        System.out.println("№5");
        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            logins.add(s);
        }
        System.out.println("Логины начинающиеся на букву \"f\" (строчную):");
        logins.stream().filter(l -> l.startsWith("f")).forEach(System.out::println);
    }

    static class ComparatorString implements Comparator<String> {

        @Override
        public int compare(String s, String t1) {
            return Integer.valueOf(s.substring(1)).compareTo(Integer.valueOf(t1.substring(1)));
        }
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender sex;

        public Student(String name, Integer age, Gender sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age) && sex == student.sex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }
}