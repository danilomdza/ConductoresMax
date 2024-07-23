package demo_jdbc.models;

public class DriverResult {
	private String driverName;
	private int wins;
	private int totalPoints;
	private int rank;
	
	
	public DriverResult(String driverName, int wins, int totalPoints, int rank) {
		super();
		this.driverName = driverName;
		this.wins = wins;
		this.totalPoints = totalPoints;
		this.rank = rank;
	}
	
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
}
