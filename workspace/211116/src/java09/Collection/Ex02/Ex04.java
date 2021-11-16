package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * size , clear Áö¿ø
 */
public class Ex04 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

		hs.add("test");
		hs.add("Çï·Î¿ì");
		
		Iterator<String> itrt = hs.iterator();
		while(itrt.hasNext())
			System.out.println(itrt.next());
		
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs.size());
	}
}
