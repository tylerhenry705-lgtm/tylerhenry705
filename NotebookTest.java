import java.util.ArrayList;

public class NotebookTest {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		ArrayList<String> notes = new ArrayList<String>();
	    notes.add("Buy Candy");
	    notes.add("Eat at Raising Canes");
	    notes.add("Play Roblox");
	    notes.add("Watch Netflix");

	    System.out.println("Notes Set");
	    notebook.setNotes(notes);
	    System.out.println("Notes Get");
		System.out.println(notebook.getNotes());
		
		System.out.println("Adding New Note");
		notebook.addNote("Wait for Zaxbys to open");
		System.out.println(notebook.getNotes());
		
		notebook.addNote("Wait for Zaxbys to open");

		System.out.println("Raising Canes note deleted");
		notebook.deleteNote(1);
		System.out.println(notebook.getNotes());
		
		System.out.println("Note retreived");
		notebook.getNoteNumber("Watch Netflix");
		System.out.println(notebook.getNote(2));
		
		System.out.println("Note Posistion Set");
	    notebook.setNote(3, "Wait for Zaxbys to open");
	    System.out.println("Note Posistion Get");
		System.out.println(notebook.getNote(3));
		
		int var = 2;
		for(int i = 0; i < var; i++){
			System.out.println("Wait for Zaxbys to open note moved up");
			notebook.moveNoteUp("Wait for Zaxbys to open");
		}
		System.out.println(notebook.getNotes());
		
		for(int i = 0; i < var; i++){
			System.out.println("Wait for Zaxbys to open note moved down");
			notebook.moveNoteDown("Wait for Zaxbys to open");
		}
		System.out.println(notebook.getNotes());
		
		for(int i = 0; i < var; i++){
			System.out.println("Wait for Zaxbys to open note moved to the top");
			notebook.moveToTop("Wait for Zaxbys to open");
		}
		System.out.println(notebook.getNotes());
		
		for(int i = 0; i < var; i++){
			System.out.println("Wait for Zaxbys to open note moved to the Bottom");
			notebook.moveToBottom("Wait for Zaxbys to open");
		}
		System.out.println(notebook.getNotes());
	}

}
