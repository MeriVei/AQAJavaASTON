import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] a = {"Hell","Hi","Hi","Hello","By","By","By","Meri","By","Hi","Hello","By","Hi"};
        HashSet<String> hashSet = new HashSet<>();
        for (String data : a){
            hashSet.add(data);
        }

        for (String data : hashSet){
            System.out.println(data);
        }

    }
}