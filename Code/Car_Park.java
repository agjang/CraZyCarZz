import java.util.ArrayList;

public class Car_Park {
	private int ID;
	private String address;
	private String phone;
	public int Capacity;
	public ArrayList<Car> NotHiredCars = new ArrayList<Car>();
	public ArrayList<Car> HiredCars = new ArrayList<Car>();
	
	public Car_Park(int ID, String address, String phone_number, int bottleneck) {
		this.ID = ID;
		this.address = address;
		this.phone = phone_number;
		this.Capacity = bottleneck;
	}
}
