package practice.problems.udemy;

public class MegaBytesConverter {
	static final int MegaToBytes = 1024;
	public static void main(String[] args) {
		printMegaAndKiloBytes(2500);
	}
	public static  void printMegaAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		int mb = kiloBytes / MegaToBytes;
		int kb = kiloBytes % MegaToBytes;
		
		System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
	}
}
