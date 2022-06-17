import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

     //   Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.

    Integer integer= Stream.of(1,2,3,4,5,6,20,12).filter(x->x%2==0).map(x->x*x).max(Comparator.comparing(x->x*x)).get();
        System.out.println(integer);
    }
}