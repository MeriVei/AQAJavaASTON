public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Результат: " + sum(new String[][]{{"1", "2", "l", "5"}, {"1", "1", "1", "1", "t"},
                    {"1", "1", "1", "1"}, {"1", "1", "1", "1"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Результат: " + sum(new String[][]{{"1", "2", "l", "5"}, {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}, {"1", "1", "1", "1"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Результат: " + sum(new String[][]{{"1", "2", "3", "5"}, {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}, {"1", "1", "1", "1"}}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sum(String[][] aq) throws MyArraySizeException, MyArrayDataException {
        if (aq.length != 4) {
            throw new MyArraySizeException("Размер массива не равен 4х4");
        }
        for (int i = 0; i < aq.length; i++) {
            if (aq[i].length != 4) {
                throw new MyArraySizeException("Размер массива не равен 4х4");
            }
        }
        int rezult = 0;
        for (int i = 0; i < aq.length; i++) {
            for (int j = 0; j < aq[i].length; j++) {
                rezult += getNumber(aq[i][j], i, j);
            }
        }
        return rezult;
    }

    public static Integer getNumber(String str, int i, int j) throws MyArrayDataException {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Строка " + (i + 1) + " столбец " + (j + 1)
                    + " - неверные данные: " + str + "   | Ожидалось число.");
        }
    }
}