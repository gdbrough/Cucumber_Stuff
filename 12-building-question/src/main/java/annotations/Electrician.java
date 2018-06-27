package annotations;

public class Electrician implements TradesPerson {
	private double cost;
	private double number;
	private double days;

	
	public double getDays() {
		return days;
	}
	public void setDays(double days) {
		this.days = days;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost*number*days;
	}

}
