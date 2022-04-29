import java.time.Month;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;


public class Simulator {
	public static Customer login(ArrayList<Customer> peoplerenting) {
		Customer customerToReturn = null;
		System.out.println("Enter your email: ");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		for(int i = 0; i < peoplerenting.size(); i++) {
			if(peoplerenting.get(i).address.equals(input)) {
				System.out.println("Login successful! Hello, " + peoplerenting.get(i).name);
				System.out.println();
				customerToReturn = peoplerenting.get(i);
			}
		}
		return customerToReturn;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Customer> peoplerenting = new ArrayList<Customer>();
		String BusinessInquiriesPhone = "1-800-434-9017";
		Car_Park city = new Car_Park(1, "34 Elm St", BusinessInquiriesPhone, 8);
		Car car_1 = new Car(1, "Ford Focus 2019", "VFT1AK", city);
		Car car_2 = new Car(2, "Chevrolet Impala 2012", "9R5P64", city);
		Car car_3 = new Car(3, "Volkswagen Golf GTI 2016", "93MAQ1", city);
		Car car_4 = new Car(4, "Nissan Altima 2014", "K09MX0", city);
		city.NotHiredCars.add(car_1);
		city.NotHiredCars.add(car_2);
		city.NotHiredCars.add(car_3);
		city.NotHiredCars.add(car_4);
		
		Customer customer_1 = new Customer("S954004776", "John Bestavros", "867-241-5862", "johnbest@bu.edu", LocalDate.of(2001, Month.APRIL, 13));
		Customer customer_2 = new Customer("S644117965", "Allen Jang", "827-686-7407 ", "agjang@bu.edu", LocalDate.of(2000, Month.FEBRUARY, 2));
		Customer customer_3 = new Customer("S154229971", "Vincent Nguyen", "271-228-9282", "vnguyen4@bu.edu", LocalDate.of(2000, Month.JANUARY, 13));
		Customer customer_4 = new Customer("S177628152", "Alex Epifantsev", "419-810-0098", "epifant@bu.edu", LocalDate.of(2001, Month.MAY, 31));
		peoplerenting.add(customer_1);
		peoplerenting.add(customer_2);
		peoplerenting.add(customer_3);
		peoplerenting.add(customer_4);
		while(true) {
			
		System.out.println();
		System.out.println("Welcome to CraZyCarZz! \n1: Login \n2: Register");
		Customer in_system = null;
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		if(input.equals("Login")) {
			System.out.println();
			in_system = login(peoplerenting);
			System.out.println("Available cars: ");
			System.out.println();
			for(int i = 0; i < city.NotHiredCars.size(); i++) {
				System.out.println(city.NotHiredCars.get(i).Car_ID + " " + city.NotHiredCars.get(i).model);
			}
			System.out.println();
			System.out.println("Rental fare is $100 / day");
			System.out.println();
			in_system.Hire_Car(city);
			in_system.pay();
			System.out.println();
			System.out.println("Available cars [updated]: ");
			System.out.println();
			for(int i = 0; i < city.NotHiredCars.size(); i++) {
				System.out.println(city.NotHiredCars.get(i).model);
			}
			System.out.println("Enter exit to logout");
			String input2 = keyboard.nextLine();
			if(input2.equals("exit")) {
				continue;
			}
		}else if(input.equals("Register")) {
			Customer customer_5 = new Customer(LocalDate.of(1968, Month.APRIL, 4));
			customer_5.register();
			peoplerenting.add(customer_5);
			System.out.println();
			System.out.println("Welcome, " + customer_5.name + "!");
			System.out.println();
			System.out.println("Available cars: ");
			System.out.println();
			for(int i = 0; i < city.NotHiredCars.size(); i++) {
				System.out.println(city.NotHiredCars.get(i).Car_ID + " " + city.NotHiredCars.get(i).model);
			}
			System.out.println();
			System.out.println("Rental fare is $100 / day");
			System.out.println();
			break;
		}
		
		}
		
	}
}


