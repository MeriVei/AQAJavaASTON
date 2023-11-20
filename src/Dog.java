public class Dog extends Animal{

    private static int numberOfCopiesDogs = 0;

    public Dog(String name) {
        super(name);
        numberOfCopiesDogs++;
    }

    public static int getNumberOfCopiesDogs() {
        return numberOfCopiesDogs;
    }

    @Override
    public void run(int a) {
        super.run(Math.min(a, 500));
        if (a > 500){
            System.out.println("Собака может только пробежать 500 м!");
        }
    }

    @Override
    public void swim(int a) {
        super.swim(Math.min(a,10));
        if (a > 10){
            System.out.println("Собака может только проплыть 10 м!");
        }
    }
}
