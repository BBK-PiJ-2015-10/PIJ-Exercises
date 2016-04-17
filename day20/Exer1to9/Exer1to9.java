import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Optional;
import java.util.function.*;

public class Exer1to9 {

	public static void main (String[] args) {
		
		Exer1to9 script = new Exer1to9();
		script.launch();
	
	}

	
	public void launch (){
		
		List<String> words = Arrays.asList("hi", "hello", "ca'va", "ciao", "hola", "hello world", "hee","ee", "qqq", "q");
		
		Stream<String> mystream = words.stream();
		
		System.out.println("This is the answer to Exer1");
		mystream.forEach( (n)-> System.out.println("  "+n));
		System.out.println();
		
		
		System.out.println("This is the answer to Exer2");
		Stream<String> mystream2 = words.stream();
		mystream2.forEach( (n)-> System.out.println(n));
		System.out.println();
		
		System.out.println("These are the answers to Exer3");
		Stream<String> mystream3 = words.stream().map( (s) -> s + "!");
		mystream3.forEach( (n)-> System.out.println(n));
		System.out.println();
		
		Stream<String> mystream4 = words.stream().map( (s) -> s.replace( "i" ,"eye"));
		mystream4.forEach( (n)-> System.out.println(n));
		System.out.println();
		
		Stream<String> mystream5 = words.stream().map(String:: toUpperCase);
		mystream5.forEach( (n)-> System.out.println(n));
		System.out.println();
		
		
		System.out.println("These are the answers to Exer4");
		
		Stream<String> mystream6 = words.stream().filter( (n) -> n.length() < 4 );
		mystream6.forEach( (n) -> System.out.println(n));
		System.out.println();
		
		Stream<String> mystream7 = words.stream().filter( (n) ->  n.contains("a"));
		mystream7.forEach( (n) -> System.out.println(n));
		System.out.println();
		
		Stream<String> mystream8 = words.stream().filter( (n) -> n.length() %2 == 0 );
		mystream8.forEach( (n) -> System.out.println(n));
		
		System.out.println("These are the answers to Exer5");
		
		Stream<String> mystream9 = words.stream().map(String:: toUpperCase).filter( (n) -> n.length() < 4).filter((n)-> n.contains("E"));	
		System.out.println(mystream9.findFirst().get());
		
		Stream<String> mystream10 = words.stream().map(String:: toUpperCase).filter( (n) -> n.length() < 4).filter((n)-> n.contains("Q"));	
		System.out.println(mystream10.findFirst().get());
		
		System.out.println("These are the answers to Exer6");
		
		Stream<String> mystream11 = words.stream().filter( (n) -> n.length() < 4).filter((n)-> n.contains("e")).map(String:: toUpperCase);	
		System.out.println(mystream11.findFirst().get());
		
		Stream<String> mystream12 = words.stream().filter( (n) -> n.length() < 4).filter((n)-> n.contains("q")).map(String:: toUpperCase);	
		System.out.println(mystream12.findFirst().get());
		
		System.out.println("These are the answers to Exer7");
		
		String reduced = words.stream().reduce(" ",(a, b) -> a.toUpperCase() + "" +b.toUpperCase() );
		System.out.println(reduced);
		System.out.println();
		
		System.out.println("These are the answers to Exer8");
		String reduced2 = words.stream().map(String:: toUpperCase).reduce(" ", (a,b) -> a + "" +b );
		System.out.println(reduced2);
		System.out.println();
		
		System.out.println("These are the answers to Exer9");
		String reduced3 = words.stream().reduce(" ", (a,b) -> a + "," + b );
		System.out.println(reduced3);
		System.out.println();
		
		System.out.println("These are the answers to Exer10");
		
		//Random rand = new Random();
		//generate (Supplier<T> s)
		
		List<Integer> number = new ArrayList<Integer>();
		
		
		//Stream<Integer> mystream13 = number.stream().generate((n)-> new Random());
		
		
		
		System.out.println("The original List " + words);
		
		
	}
	
}