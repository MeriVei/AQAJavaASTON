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
        cats[2] = new Cat("Кот 3", 10);
        cats[3] = new Cat("Кот 4", 30);
        cats[4] = new Cat("Кот 5", 7);
        Plate plate = new Plate(60);
        boolean isNotSatiety = false;
        do {
            isNotSatiety = false;
            for (Cat c : cats) {
                if (!c.isSatiety()){
                    c.setSatiety(plate.eat(c.getAppetite()));
                }
                System.out.println(c.getName() + " " + (c.isSatiety() ? "сыт" : "голоден"));
                if (!c.isSatiety()) {
                    isNotSatiety = true;
                }
            }
            if (plate.getFood() < 50) {
                plate.addFood(100);
            }
            System.out.println();
        } while (isNotSatiety);

        //Задание 2
        Circle circle = new Circle("Синий", "Черный");
        Rectangle rectangle = new Rectangle("Зеленый", "Серый");
        Triangle triangle = new Triangle("Оранжевый", "Розовый");
        System.out.println("Круг:\nПериметр: " + circle.perimeterCalculate(new int[]{5})
                + "\nПлощадь: " + circle.areaCalculate(new int[]{5})
                + "\nЦвер фона: " + circle.getBackgroundColor()
                + "\nЦвет границ: " + circle.getBorderColor());
        System.out.println("\nТреугольник:\nПериметр: " + triangle.perimeterCalculate(new int[]{2, 3, 4})
                + "\nПлощадь: " + triangle.areaCalculate(new int[]{2, 3, 4})
                + "\nЦвер фона: " + triangle.getBackgroundColor()
                + "\nЦвет границ: " + triangle.getBorderColor());
        System.out.println("\nПрямоугольник:\nПериметр: " + rectangle.perimeterCalculate(new int[]{2, 3, 2, 3})
                + "\nПлощадь: " + rectangle.areaCalculate(new int[]{2, 3})
                + "\nЦвер фона: " + rectangle.getBackgroundColor()
                + "\nЦвет границ: " + rectangle.getBorderColor());
    }
}