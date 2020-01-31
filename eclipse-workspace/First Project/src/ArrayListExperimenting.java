import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExperimenting {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jack");
		names.add("James");
		names.add("Tyler");
		names.stream().forEach(name -> System.out.println(name));
		List <String> passed = names.stream().filter(name -> !(name.equals("James"))).map(name -> name + " is trash").collect(Collectors.toList());
		System.out.println(passed.size());
		System.out.println(passed);
		System.out.println("chemistry".substring(6, 9));
		}

}
