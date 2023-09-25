package practice.problems.udemy;

public class BarkingDog {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 1));
	}
	public static boolean shouldWakeUp(boolean barking, int hour) {
		
		if(hour < 0 || hour > 23) return false;
		
		if(barking && (hour < 8 || hour > 22 )) return true;
		
		return false;
	}
	
}
