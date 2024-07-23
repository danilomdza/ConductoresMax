package demo_jdbc.models;

public class Circuit {
	
	private int circuitid;
	private String circuitref;
	private String name;
	private String location;
	private String country;
	
	
	public Circuit(int circuitid, String circuitref, String name, String location, String country) {
		super();
		this.circuitid = circuitid;
		this.circuitref = circuitref;
		this.name = name;
		this.location = location;
		this.country = country;
	}
	
	
	public int getCircuitid() {
		return circuitid;
	}
	public void setCircuitid(int circuitid) {
		this.circuitid = circuitid;
	}
	public String getCircuitref() {
		return circuitref;
	}
	public void setCircuitref(String circuitref) {
		this.circuitref = circuitref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}

