import java.util.function.*;
import java.time.LocalDate;
import java.util.*;


class ImplementPredicate {
		public static void main(String[] args) {
			Predicate<String> p1 = String::isEmpty;
			Predicate<String> p2 = (s) -> s.isEmpty();
			System.out.println(p1.test(""));
			System.out.println(p2.test("Hello"));
			
			BiPredicate<String, String> b1 = String::startsWith;
			BiPredicate<String, String> b2 = (str, prefix) -> str.startsWith(prefix);
			BiPredicate<String, String> b3 = String::equalsIgnoreCase;
			System.out.println(b1.test("chicken", "chick"));
			System.out.println(b2.test("chicken", "chick"));
			System.out.println(b3.test("chicken", "CHICKEN"));

			
		}
}