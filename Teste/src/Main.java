import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Start timing
        long inicio = System.currentTimeMillis();

        // ArrayList search
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i =0; i<= 5000000; i++){
            lista.contains(i);
        }
        long arrayListTime = System.currentTimeMillis() - inicio;

        // HashSet search
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i<=5000000; i++){
            hash.contains(i);
        }
        long hashSetTime = System.currentTimeMillis() - inicio - arrayListTime;


        System.out.println("ArrayList  time: " + arrayListTime);
        System.out.println("HashSet time: " + hashSetTime);
    }
}