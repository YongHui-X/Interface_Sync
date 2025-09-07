package itemTypes;

public class Note implements iSyncable {
	private String title;
	private String content;
	
	public Note() {}
	
	public Note(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getCode() {
		return "N";
	}
	
	public String encode() {
		return String.format("%s|%s", title, content);
	}
	
	public void decode(String mystr) {
		String[] parts = mystr.split("\\|");
		
		title = parts[0];
		content = parts[1];
		System.out.println("Note decoded successfully");
	}
}
