public interface MathCalculation {

    public default double perimeterCalculate(int[] a){
        if (a.length < 4){
            return -1;
        }
        return a[0] * a[1] * a[2] * a[3];
    }

    public default double areaCalculate(int[] a){
        if (a.length < 2){
            return -1;
        }
        return a[0] * a[1];
    }
}
