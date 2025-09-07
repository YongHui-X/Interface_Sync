package main;
import itemTypes.Contact;
import itemTypes.Event;
import itemTypes.Task;
import itemTypes.Note;

public class main {

	public static void main(String[] args) {
		SyncEngine syncEng = new SyncEngine();
		System.out.println("** Adding to SyncEngine... **");
		
		syncEng.add(new Contact("Jeremy", "901111222", "jeremy@door.com"));
		
		syncEng.add(new Task("Do homework", 20, 8 , 2024));
		Task task = new Task("Book Dental", 20, 8, 2024);
		task.setDone(true);
		syncEng.add(task);
		
		syncEng.add(new Event("New year", "Singapore", 2582024, 1230));
		syncEng.add(new Note("My Journal", "Today is a good day."));
		
		
		System.out.println();
		System.out.println("** SyncEngine test... **");
		//sync test
		syncEng.testSync();

	}

}
