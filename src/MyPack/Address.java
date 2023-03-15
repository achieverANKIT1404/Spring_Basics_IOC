package MyPack;

public class Address {

	private int plotNo;
	private String city;
	
	public Address() {
		super();
	}

	public Address(int plotNo, String city) {
		super();
		this.plotNo = plotNo;
		this.city = city;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + "]";
	}
}
