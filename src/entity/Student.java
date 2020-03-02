package entity;

public class Student {
	private String name;
	private String address;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
	}
	
	
}
