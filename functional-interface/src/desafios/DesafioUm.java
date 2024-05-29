package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioUm {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().sorted((num1,num2)-> Integer.compare(num1, num2)).forEach(System.out::println);
    }
}
