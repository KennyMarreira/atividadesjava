package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valueOfHour;
	private Integer hours;
	
	public HourContract () {
		
	}

	public HourContract(Date date, Double valueOfHour, Integer hours) {
		this.date = date;
		this.valueOfHour = valueOfHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueOfHour() {
		return valueOfHour;
	}

	public void setValueOfHour(Double valueOfHour) {
		this.valueOfHour = valueOfHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valueOfHour * hours;
	}
	
	
}
