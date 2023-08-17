package practice.problems.udemy;

public class MainClass {
	public static void main(String[] args) {

//		System.out.println(toMilesPerHour(1.5));
//		System.out.println(toMilesPerHour(10.25));
		printConversion(-10.25);
	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour >= 0) {
			return Math.round(kilometersPerHour / 1.609);
		}

		return -1;
	}

	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
			return;
		}
		System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

	}

}
