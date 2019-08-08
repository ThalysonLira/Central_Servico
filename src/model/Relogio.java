package model;

public class Relogio {
	private int hour;
	private int minute;
	private int second;
	
	public Relogio() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Relogio(int hora, int minuto, int segundo) {
		this.hour = hora;
		this.minute = minuto;
		this.second = segundo;
	}
	
	public String getCurrentTime() {
		return (getHour() + ":" + getMinute() + ":" + getSecond());
	}
	
	private void sumHour() {
		if (getHour() < 23)
			setHour(getHour() + 1);
		else
			setHour(0);
	}
	
	private void sumMinute() {
		if (getMinute() < 59)
			setMinute(getMinute() + 1);
		else {
			setMinute(0);
			sumHour();
		}
	}
	
	public void sumSecond() {
		if (getSecond() < 59)
			setSecond(getSecond() + 1);
		else {
			setSecond(0);
			sumMinute();
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}