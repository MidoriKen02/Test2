import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.*;
//aaa
public class Main {
    public static void main(String[] args) {
        //Predicate<T>   boolean test(T t)
        //Testa se un oggetto soddisfa la condizione
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(1));

        //BiPredicate<T, U>   boolean test(T t, U u)
        //Predicate su 2 argomenti
        BiPredicate<Integer, Integer> isNegative = (x, y) -> x < y;
        System.out.println(isNegative.test(1, -1) + " " + isNegative.test(-2, -1));

        //Function<T, R>   R apply(T t)
        //Trasforma un input in output
        Function<String, Integer> length = String::length;
        System.out.println(length.apply("Hello"));

        //BiFunction<T, U, R>   R apply(T t, U u)
        //Function con 2 argomenti
        BiFunction<String, String, String> concat = String::concat;
        System.out.println(concat.apply("Hello", "World"));

        //Consumer<T>   void accept(T t)
        //Consuma un input (no output)
        Consumer<String> printer = System.out::println;
        printer.accept("Hello");

        //Supplier<R>   R get()
        //Fornisce un output (no input)
        Supplier<Double> rng = Math::random;
        System.out.println(rng.get());

        //UnaryOperator<T>   T apply(T t)
        //Operazione su un singolo operando
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(2));

        //BinaryOperator<T>   T apply(T t1, T t2)
        //Operazione su 2 operandi
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        System.out.println(binaryOperator.apply(2, 3));

        //---

        //Optional<T>
        //Container per valori che possono essere null
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional);
        optional.ifPresent(System.out::println);

        //---

        //Runnable
        //Esegue un task in un thread
        Runnable taskRunnable = () -> System.out.println("Hello");

        //Callable<V>
        //Esegue un task in un thread ma resituisce un valore
        Callable<Integer> taskCallable = () -> 4;

        //---

        //Comparator<V>
        //Definisce criteri di ordinamento
        //Comparator.comparing(Person::getName);

        //Iterable<T>
        //Permette l'uso del for-each
        //for(String s : list){}
    }
}
