package main;
import java.util.ArrayList;

import itemTypes.Contact;
import itemTypes.Event;
import itemTypes.Task;
import itemTypes.iSyncable;
import itemTypes.Note;
public class SyncEngine {
	private ArrayList<String> syncList = new ArrayList<String>();
	
	//Every iSyncable object must have getCode(), encode().
    //Adds a string in the format: "CODE:encodedData".
	public void add(iSyncable item) {
		syncList.add(item.getCode() + ":" + item.encode() );
		//item.getClass() asks Java: “Hey, what is the actual type of this object right now?”
		
	}
	
	//test to see if each item can decode itself
	public void testSync() {
		
		for (String str: syncList) {
			String[] parts = str.split(":");
			
			if (parts[0].equals("C")) {
				//decode to get back a contact object
				Contact contact = new Contact();
				contact.decode(parts[1]);
				
			} else if (parts[0].equals("T")) {
				//decode to get back a task object
				Task task = new Task();
				task.decode(parts[1]);
				
			} else if (parts[0].equals("E")) {
				Event event = new Event();
				event.decode(parts[1]);
			
			} else if (parts[0].equals("N")) {
				Note note = new Note();
				note.decode(parts[1]);

			}
		}
	}
}
