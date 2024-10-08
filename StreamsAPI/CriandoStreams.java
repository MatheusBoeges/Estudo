package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		// Poderia ser um Object para ler tanto String ou Int.
		
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println =System.out::println;
		
		// Criando uma stream no metodo static.
		
		Stream<String> langs = Stream.of("Java, ", "Lua, ", "JS\n");
		langs.forEach(print);
		
		// Criando uma stream utilizando array.
		
		String[] maisLangs = {"Python, ", "Lisp, ", "Perl, ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		// Criando uma stream utilizando collection.
		
		List<String> outrasLangs = Arrays.asList("C, ", "PHP, ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Streams infinitas
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0,  n -> n + 1).forEach(println);
		
	}

}
