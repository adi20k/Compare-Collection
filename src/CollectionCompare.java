import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCompare {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
//        l.add(3);
//        l.add(5);
//        l.add(18);
//        l.add(4);
//        l.add(6);
  
			l.add("a");
			l.add("a");
			l.add("a");
        String minimum = Collections.min(l);
  
        String maximum = Collections.max(l);
  
        if (minimum == maximum) {
            System.out.println("All elements are equal");
        }
        else {
            System.out.println("Min value of our list : "+ minimum);
            System.out.println("Max value of our list : "+ maximum);
        }

	}

}
