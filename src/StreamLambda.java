import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface StringConvert {
	public String convert(String s);
}

public class StreamLambda {
	public static void main(String[] args) {
		Character[] n = new Character[] { 'M', 'a', 'i', ' ', 'Q', 'a', 'm', 'a', 'j' };
		// print count of a
		System.out.println(Stream.of(n).filter(z -> z == 'a').count());
		// print All a is upperCase
		Stream.of(n).filter(c -> c == 'a').map(c -> Character.toUpperCase(c)).forEach(c -> System.out.print(c));
		System.out.println();
		Stream.of(n).map(c -> Character.toUpperCase(c)).forEach(c -> System.out.print(c));
		System.out.println();
		// 10 , 15,20,25
		// Stream.iterate(1,v->v+1).filter(v->v%5==0).skip(0).limit(5).forEach(c->System.out.println(c));

		System.out.println("*******With Stream *******");
		List<String> nn = Arrays.asList("Mai", "Qamaj");
		nn.stream()
		.flatMap(x -> Stream.of(x.split("")))
		.map(String::toUpperCase)
		.forEach(x -> System.out.println(x));
		System.out.println("*******Without Stream *******");
		for (String s : nn) {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(Character.toUpperCase(s.charAt(i)));
			}
		}

	}

	// Lambda
	/*
	 * public static void main(String[] args) {
	 * 
	 * print("Mai",x->x.toLowerCase()); print("Manria",x->x.toUpperCase());
	 * 
	 * 
	 * } public static void print(String a , StringConvert stringConvert) {
	 * System.out.println(stringConvert.convert(a)); }
	 */
}
