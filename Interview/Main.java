package Interview;
import java.util.*;
public class Main {
  public static void main(String[] args) {
	 String s = "Himanshu";
	  s = s.toLowerCase();
	 HashMap<Character, Integer> countchar = new HashMap<>();
	 
	 for(char r : s.toCharArray()) {
		 if(countchar.containsKey(r)) {
			 countchar.put(r, countchar.get(r) + 1);
		 }else {
			 countchar.put(r , 1);
		 }
	 }
	 
	 for(char r : countchar.keySet() ) {
		 System.out.println( r +": " + countchar.get(r) );
	 }
  }
}
