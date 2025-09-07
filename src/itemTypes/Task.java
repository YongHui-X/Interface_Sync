package itemTypes;

public class Task implements iSyncable {
	private String desc;
	private int day, month, year;
	private boolean isDone;
	
	public Task() {}
	
	public Task(String desc, int day, int month, int year) {
		this.desc = desc;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDone(boolean status) {
		isDone = status;
	}
	//implements isyncable interface
	public String getCode() {
		return "T";
	}
	//If isDone == true, return 1 
	//If isDone == false, return 0
	public String encode() {
		return String.format("%s|%d|%d|%d|%d", desc, day, month, year, isDone ? 1: 0);
	}
	
	public void decode(String str) {
		String[] parts = str.split("\\|");
		
		desc = parts[0];
		day = Integer.valueOf(parts[1]);
		month = Integer.valueOf(parts[2]);
		year = Integer.valueOf(parts[3]);
		isDone = parts[4].equals("1") ? true: false;
		System.out.println("Task decoded successfully");
	}

}
