public class Time {
	//global variables
	//you cann't access the variable internally
	//what only you can do is access the variable externally
	private String zoneName;
	private int hour;
	private int minute;
	private int second;
	
	Time(String zoneName, int hour, int minute, int second){
		this.zoneName = zoneName;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	long switchToSecond() {
		//local variables
		//you cann't access the variable externally
		//what only you can do is access the variable internally
		long total = this.hour * 3600 + this.minute * 60 + this.second;
		return total;
	}
	
	String getZoneName() {
		return this.zoneName;
	}
}