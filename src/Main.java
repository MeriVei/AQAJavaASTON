public class Main {
    public static void main(String[] args) {
        try {
            sum(new String[][]{});
        } catch (MyArraySizeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sum(String[][] aq) throws MyArraySizeException {
        if (aq.length !=4){
            throw new MyArraySizeException("Размер массива не равен 4х4");
        }
        for (int i = 0; i < aq.length; i++) {
            if (aq[i].length!=4){
                throw new MyArraySizeException("Размер массива не равен 4х4");
            }
        }
    }
}