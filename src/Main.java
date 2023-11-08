public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }

    private static void compareNumbers() {
        int a = 3;
        int b = 5;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    private static void printColor() {
        int value = 156;
        if (value <=0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    private static void checkSumSign() {
        int a = 5;
        int b =7;
        int g = a + b;
        if (g >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");


    }


}
