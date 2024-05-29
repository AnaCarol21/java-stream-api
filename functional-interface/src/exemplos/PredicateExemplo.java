package exemplos;
import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Juvenal", "Roberta", "Ingrid","Ana", "Yan");
        
        nomes.stream().filter(s -> s.length() < 5).forEach(System.out::println);
    }
}
