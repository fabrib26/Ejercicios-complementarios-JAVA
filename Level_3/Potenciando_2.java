import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Potenciando_2 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> potenciados = numeros.stream()
                        .map(n -> n * n)
                                .collect(Collectors.toList());

        System.out.println(potenciados);
    }
}
