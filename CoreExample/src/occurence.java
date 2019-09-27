import java.util.HashMap;

public class occurence {
	public static void main(String[] args) {
		String name = "laxmisruthi";
		HashMap<Character, Integer> count = new HashMap<>();
		for (Character c : name.toCharArray()) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);

			}
		}
		System.out.println(count);
	}

}
