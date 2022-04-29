import java.util.ArrayList;

public class Car_Park {
	private int ID;
	private String address;
	private String phone;
	public int Capacity;
	public ArrayList<Car> NotHiredCars = new ArrayList<Car>();
	public ArrayList<Car> HiredCars = new ArrayList<Car>();
	
	
	/* the functionality for a park of cars, i.e. where the cars are stored prior to being rented. */
	public Car_Park(int ID, String address, String phone_number, int bottleneck) {
		this.ID = ID;
		this.address = address;
		this.phone = phone_number;
		this.Capacity = bottleneck;
	}
}
