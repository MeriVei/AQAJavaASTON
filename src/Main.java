public class Main {
    public static void main(String[] args) {

        Employee[] a = new Employee[5];
        a[0] = new Employee("Хомяков Т.Д", "Инженер", "chfhbd898@mail.ru", 698587, 90003, 33);
        a[1] = new Employee("Пирожков Д.С", "Инженер", "hfvgb8@mail.ru", 5385853, 10005, 29);
        a[2] = new Employee("Горохов А.А", "Инженер", "klklkl526@mail.ru", 21561651, 3215, 22);
        a[3] = new Employee("Росков П.Р", "Инженер", "hffv555@mail.ru", 654646845, 15454, 45);
        a[4] = new Employee("Терень Г.Л", "Инженер", "rggt5454@mail.ru", 65598458, 98543, 43);

        for (int i = 0; i < a.length; i++) {
            if (a[i].getAge() > 40) {
                a[i].print();
            }
        }

        Park park = new Park();
        park.attraction = new Park.Attraction[3];
        park.attraction[0] = new Park.Attraction("Горка", "10:00 - 17:00", 30);
        park.attraction[1] = new Park.Attraction("Солнышко", "8:00 - 20:00", 25);
        park.attraction[2] = new Park.Attraction("Скамейка", "8:00 - 15:00", 40);
        for (Park.Attraction at : park.attraction) {
            System.out.println(at.name + "\t" + at.workingHours + "\t" + at.price);
        }
    }
}