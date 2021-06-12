import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class minhaClasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
//declare as variaveis corretamente e continue a sua solução

		ArrayList<Integer>  list = new ArrayList<Integer>();
		
		int  entrada  =sc.nextInt();
		while (entrada  --> 0)
			list.add(sc.nextInt());
		
		SortedMap<Integer, Integer> counter = new TreeMap<>();
		list.forEach(id -> counter.compute(id, ( key  , value ) -> ( value == null ? 1 :  value + 1)));
		
	
		counter.entrySet().forEach(entry->{
			System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
		});
		
		sc.close();
	}
}
