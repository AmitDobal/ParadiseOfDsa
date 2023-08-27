package practice.problems.udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

public class MainClass {
	public static void main(String[] args) {
		Map<Integer, List<String>> orderToProductsMap = new HashMap<>();

		// Simulating the data from your ResultSet
		List<Data> resultSet = new ArrayList<>();
		resultSet.add(new Data(1, "Apple"));
		resultSet.add(new Data(1, "Banana"));
		resultSet.add(new Data(2, "Orange"));
		resultSet.add(new Data(3, "Apple"));
		resultSet.add(new Data(3, "Pear"));

		for (Data data : resultSet) {
			int orderId = data.getOrderId();
			String productName = data.getProductName();

			orderToProductsMap.computeIfAbsent(orderId, k -> new ArrayList<>()).add(productName);
		}
		
		System.out.println(orderToProductsMap);
	}

	static class Data {
		private int orderId;
		private String productName;

		public Data(int orderId, String productName) {
			this.orderId = orderId;
			this.productName = productName;
		}

		public int getOrderId() {
			return orderId;
		}

		public String getProductName() {
			return productName;
		}
	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour >= 0) {
			return Math.round(kilometersPerHour / 1.609);
		}

		return -1;
	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
			return;
		}
		System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

	}

}
