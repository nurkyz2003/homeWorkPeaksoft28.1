import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {32,35,42,76,33,87,91,33};
       Optional<Integer> maxElementArray =  Arrays.stream(array).filter(x -> x % 2 == 0).map(x -> x * x).toList().stream().max(Comparator.naturalOrder());
        System.out.println(maxElementArray);
    }
}