package java02.Control.Ex06While;

public class Ex01 {

	public static void main(String[] args) {
		int i=0;
		
		while(i<3) {
			System.out.println("i="+i);
			i++;
		}
		i=0;
		for(;i<3;) {
			System.out.println("i="+i);
			i++;
		}
		i=0;
		while(true) {
			if(i>=3)	break;
			System.out.println("i="+i);
			i++;
		}
	}

}
