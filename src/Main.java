import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("№1-----------------------------------------------------------");
        System.out.println(isSumRange(8,1));
        System.out.println("№2-----------------------------------------------------------");
        printText("Hello", 1);
        System.out.println("№3-----------------------------------------------------------");
        positive(0);
        System.out.println("№4-----------------------------------------------------------");
        System.out.println(isPositive(-5));
        System.out.println("№5-----------------------------------------------------------");
        System.out.println(isLeapYear(400));

        //№6
        System.out.println("№6-----------------------------------------------------------");
        int[] a = {1,0,1,1,0,1,0,0,1,1,1,0,1,0,0};
        for (int i=0;i<a.length;i++){
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));

        //№7
        System.out.println("№7-----------------------------------------------------------");
        int[] b = new int[100];
        for (int i = 0; i< b.length;i++){
            b[i] = i + 1;
        }
        System.out.println(Arrays.toString(b));


        //№8
        System.out.println("№8-----------------------------------------------------------");
        int[] c = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i< c.length; i++){
            if (c[i]<6){
                c[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(c));

        //№9
        System.out.println("№9-----------------------------------------------------------");
        int n = 5;
        int[][] mas = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i==j){
                    mas[i][j] = 1;
                } else if (i + j == n - 1){
                    mas[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(mas[i]));
        }

        //№10
        System.out.println("№10-----------------------------------------------------------");
        System.out.println(Arrays.toString(getMas(5,3)));

    }

    private static boolean isSumRange(int a, int b) {
        int j = a + b;
        if (j >= 10 && j <= 20){
            return true;
        } else {
            return false;
        }
    }

    private static void printText(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }

    }

    public static void positive(int a){
        if (a>=0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isPositive(int a){
        if (a<0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int a){
        if (a % 400 == 0){
            return true;
        } else if (a % 100 == 0){
            return false;
        } else return a % 4 == 0;
    }

    public static int[] getMas(int len, int initialValue){
        int[] mas = new int[len];
        for (int i=0; i<mas.length;i++){
            mas[i]=initialValue;
        }
        return mas;
    }

}