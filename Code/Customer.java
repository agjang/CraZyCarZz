
public class Customer {
	public String license_ID;
	public String name;
	public String phone;
	public String address;
	public int[] birthday = {0, 0, 0};
	public boolean isNew = false;
	public Customer(String license, String name, String phone, String address, int birthmonth, int birth_day, int birthyear) {
		this.license_ID = license;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.birthday[0] = birthmonth;
		this.birthday[1] = birth_day;
		this.birthday[2] = birthyear;
	}
	
	public Customer(String address) {
		this.address = address;
		this.isNew = true;
	}
	
	
}
