public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(600);
        dog.run(200);
        dog.swim(50);
        dog.swim(3);
        Cat cat = new Cat("Мурзик", 20);
        cat.run(500);
        cat.run(100);
        cat.swim(5);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Кот 1", 20);
        cats[1] = new Cat("Кот 2", 5);
        cats[2] = new Cat("Кот 3", 30);
        cats[3] = new Cat("Кот 4", 10);
        cats[4] = new Cat("Кот 5", 7);
        Plate plate = new Plate(70);

        for (Cat c:cats) {
            c.setSatiety(plate.eat(c.getAppetite()));
            System.out.println(c.getName()+" "+(c.isSatiety() ? "сыт" : "голоден"));
        }
    }
}