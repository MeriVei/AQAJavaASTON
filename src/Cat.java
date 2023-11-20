public class Cat extends Animal {

    private static int numberOfCopiesCats = 0;
    public Cat(String name) {
        super(name);
        numberOfCopiesCats++;
    }

    public static int getNumberOfCopiesCats() {
        return numberOfCopiesCats;
    }

    @Override
    public void run(int a) {
        super.run(Math.min(a, 200));
        if (a > 200){
            System.out.println("Кот может только пробежать 200 м!");
        }
    }

    @Override
    public void swim(int a) {
        if (a > 0){
            System.out.println("Кот не умеет плавать!");
        }
    }
}
