package java05.classBasic.Ex02;

public class Ex01 {
	public static void main(String[] args) {
		Computer com = new Computer();
		
//		com.CPU = "Intel(R) Core(TM) i7-4770";
		com.setCPU("Intel(R) Core(TM) i7-4770");
//		com.RAM = 8;
		com.setRAM(8);
//		com.HDD = 1024;
		com.setHDD(1024);
		
//		System.out.println(com.CPU);
		System.out.println(com.getCPU());
		System.out.println(com.getRAM());
		System.out.println(com.getHDD());

	}
}
