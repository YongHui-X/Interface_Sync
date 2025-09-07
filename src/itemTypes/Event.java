package itemTypes;

public class Event implements iSyncable {
	private String event, location;
	private int date;
	private int time;
	
	public Event() {}
	
	public Event(String event, String location, int date, int time) {
		this.event = event;
		this.location = location;
		this.date = date;
		this.time = time;
	}
	
	public String getCode() {
		return "E";
	}
	
	public String encode() {
		String str = String.format("%s|%s|%d|%d", event, location, date, time);
		System.out.println("Event encoded successfully");
		return str;
	}
	
	public void decode(String str) {
		String[] parts = str.split("\\|");
		
		event = parts[0];
		location = parts[1];
		date = Integer.valueOf(parts[2]);
		time = Integer.valueOf(parts[3]);
		System.out.println("Event decoded successfully");
	}
}
