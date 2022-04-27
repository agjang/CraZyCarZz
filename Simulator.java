import java.util.*;

public class Simulator {
	public static void main(String[] args) {
		ArrayList<Car> CarSelection = new ArrayList<Car>();
		String BusinessInquiriesPhone = "1-800-434-9017";
		Car_Park city = new Car_Park(1, "34 Elm St", BusinessInquiriesPhone, 8);
		Car car_1 = new Car(1, "Ford Focus 2019", "VFT1AK", city);
		Car car_2 = new Car(2, "Chevrolet Impala 2012", "9R5P64", city);
		Car car_3 = new Car(3, "Volkswagen Golf GTI 2016", "93MAQ1", city);
		Car car_4 = new Car(4, "Nissan Altima 2014", "K09MX0", city);
		CarSelection.add(car_1);
		CarSelection.add(car_2);
		CarSelection.add(car_3);
		CarSelection.add(car_4);
		
		Customer customer_1 = new Customer("S954004776", "John Bestavros", "867-241-5862", "46 Walden Lane", 4, 13, 2001);
		
		
	}
}
