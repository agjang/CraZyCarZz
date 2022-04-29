public class Car {
	public int Car_ID;
	public String model;
	private String License_plate;
	private Car_Park Location;
	public CarStatus status;
	
	public Car(int ID, String model, String License_plate, Car_Park Location) {
		this.Car_ID = ID;
		this.model = model;
		this.License_plate = License_plate;
		this.Location = Location;
		this.status = CarStatus.NOT_UNDER_HIRE;
	}
	
	/* changing the location that the car is in */
	public void Change_Location(Car_Park parkToMove) {
		if(status == CarStatus.NOT_UNDER_HIRE) {
			this.Location = parkToMove;
			Location.Capacity -= 1;
		}
	}
	
	
	
}
