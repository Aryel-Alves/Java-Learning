import java.util.Collections;
import java.util.ArrayList;

public class NamesList {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Sergin");
		list.add("Paulo");
		list.add("Guilherme");
		
		//imprimir, ordenar e imprimir novamente
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("");
		System.out.printf("Primeiro: %s \n", list.get(0));
		System.out.printf("Tamanho: %d \n", list.size());
		
		System.out.println("Remove Paulo: ");
		list.remove("Paulo");
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
