
public class Car {
	private int Car_ID;
	private String model;
	private String License_plate;
	private Car_Park Location;
	private CarStatus status;
	
	public Car(int ID, String model, String License_plate, Car_Park Location) {
		this.Car_ID = ID;
		this.model = model;
		this.License_plate = License_plate;
		this.Location = Location;
		this.status = CarStatus.NOT_UNDER_HIRE;
	}
}
