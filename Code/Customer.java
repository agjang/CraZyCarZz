import java.time.Month;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class Customer {
	public String license_ID;
	public String name;
	public String phone;
	public String address;
	public LocalDate birthday;
	public Car carInUse;
	public int money_due;
	public boolean isNew = false;
	public Customer(String license, String name, String phone, String address, LocalDate birthday) {
		this.license_ID = license;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
	}
	
	
	/* initializing the birthday of a customer that has just registered*/
	public Customer(LocalDate birthday) {
		this.isNew = true;
		this.birthday = birthday;
	}
	
	/* the framework for renting a car after a customer has successfully logged in*/
	public void Hire_Car(Car_Park city) {
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println();
			System.out.println("Choose your car: ");
			int input = keyboard.nextInt();
			for(int i = 0; i < city.NotHiredCars.size(); i++) {
				if(city.NotHiredCars.get(i).Car_ID == input) {
					city.NotHiredCars.get(i).status = CarStatus.UNDER_HIRE;
					if(isNew) {
						isNew = false;
					}
					System.out.println();
					System.out.println("For how many days would you like to rent?");
					input = keyboard.nextInt();
					System.out.println();
					
					System.out.println(city.NotHiredCars.get(i).model + ": Hired for " + input + " days");
					this.carInUse = city.NotHiredCars.get(i);
					city.NotHiredCars.remove(i);
					city.HiredCars.add(carInUse);
					Payment due = new Payment(input * 100);
					this.money_due += (input * 100);
					due.display_payment_information();
					return;
				}
			}
			System.out.println("Invalid input, try again");
		}
		
	}
	
	/* paying for the car that you've just rented*/
	public void pay() {
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter your credit card information: ");
			String input = keyboard.nextLine();
			if(input.length() == 10) {
				this.money_due = 0;
				System.out.println("dues paid!");
				return;
			}else {
				System.out.println("invalid credit card number");
			}
		}
	}
	
	/* registering your login information the first time you enter the system*/
	public void register() {
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter your drivers license: ");
			String input = keyboard.nextLine();
			if(input.charAt(0) != 'S') {
				System.out.println("Invalid drivers license: ");
				continue;
			}
			this.license_ID = input;
			System.out.println();
			System.out.println("Enter your name: ");
			input = keyboard.nextLine();
			this.name = input;
			System.out.println();
			System.out.println("Enter your phone number: ");
			input = keyboard.nextLine();
			if(input.charAt(3) != '-' || input.charAt(7) != '-') {
				System.out.println("Invalid phone number: ");
				continue;
			}
			this.phone = input;
			System.out.println();
			System.out.println("Enter your email address: ");
			input = keyboard.nextLine();
			this.address = input;
			return;
		}
	}
	
}
