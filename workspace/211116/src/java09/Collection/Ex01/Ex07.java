package java09.Collection.Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		String [] words = {"��","����","���","����","���³�"};
//		���� ������ ArrayList�� �����ϰ� �����Ͽ� ����� ����Ͻÿ�
		
		List<String> lst = new ArrayList<String>();
		Random rand = new Random();
		
//		�迭�� ���̸�ŭ �ݺ�
		int len = words.length;
		for(int i=0; i<len; i++) {
//			�迭���� ������ ���� �����ϱ� ���� 0~len-1���� ����
			int randIdx = rand.nextInt(len);
//			�迭�� ������ ��ġ�� ����
			String word = words[randIdx];
//			List�� ����
			lst.add(word);
		}
		/*
		for(int i=0; i<words.length; i++) {
			lst.add(i, words[rand.nextInt(words.length)]);
		}
		*/
		
		for(int i=0; i<words.length; i++) {
			System.out.print(lst.get(i)+" ");
		}
		System.out.println("\n======= Sorted =======");
		lst.sort(null);
		for(int i=0; i<words.length; i++) {
			System.out.println(lst.get(i)+" ");
		}
	}

}
