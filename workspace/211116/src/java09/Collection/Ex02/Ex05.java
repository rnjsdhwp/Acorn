package java09.Collection.Ex02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * ������ �̿��Ͽ� set�� �����͸� �����Ͻÿ�
 * �ݺ�Ƚ���� �迭�� ũ�⸸ŭ �ݺ��Ͻÿ�
 */
public class Ex05 {
	public static void main(String[] args) {
		String [] words={"java", "microsoft",
				"chrome", "eclipse", "linux"
		};
		
		Set<String> hs = new HashSet<String>();
		Random rand = new Random();
		
		int len = words.length;
		
		for(int i=0;i<len;i++) {
			String word = words[rand.nextInt(len)];
			hs.add(word);
			System.out.println(word);
		}
		System.out.println("=========================");
		for(String str : hs)
			System.out.println(str);		
	}
}
