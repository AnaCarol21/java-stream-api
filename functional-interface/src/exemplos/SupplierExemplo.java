package exemplos;
import java.util.List;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        // Supplier<String> saudacao = () -> "Olá, sejam bem vindos!";

        List<String> listaSaudacoes = Stream.generate(()-> "Olá, sejam bem vindos!").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
