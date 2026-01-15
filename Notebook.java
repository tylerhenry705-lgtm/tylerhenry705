import java.util.ArrayList;

public class Notebook {
			private ArrayList<String> notes;
			
			/* 1 - Notebook class needs a constructor
			 * 2 - add java doc to Notebook
			 * 
			 */
			
			//Constructor
			public Notebook() {
				notes = new ArrayList<String>();
			} 
            //Getter
			//@return    notes 
			public ArrayList<String> getNotes() {
				return notes;
			}
            //Setter
			//@paramater  ArrayList<String> notes
			public void setNotes(ArrayList<String> notes) {
				this.notes = notes;
			}
			
			//Returns the number on notes
			//@Return     this.notes.size
			public int numberOfNotes(){
				return  this.notes.size();
			}
			//Adds a note
			//@Paramater   String note
			public void addNote(String note){
				int index = this.notes.indexOf(note);
				if(index == -1) 
					this.notes.add(note);
			}
			//Deletes notes
			//@Paramater   int pos
			public void deleteNote(int pos){
				this.notes.remove(pos);
			}
			
			//Gets the note
			//@Paramater   String note
			public int getNoteNumber(String note){
				int index = this.notes.indexOf(note);
				return index;
			}
			//Gets the position of the notes
			//@Paramater   int pos
			//@Return    this.notes.get(pos)
			public String getNote(int pos){
				return this.notes.get(pos);
			}
			//Sets the position of the notes
			//@Paramater int pos, String newNote
			public void setNote(int pos, String newNote){
				this.notes.set(pos, newNote);
			}
			//Moves note to the left
			//@Paramater    String note
			public void moveNoteUp(String note){
				int index = this.notes.indexOf(note); 
				if(index == 0) return; 
				String curr = this.notes.get(index-1);
				this.notes.set(index-1, note);
				this.notes.set(index, curr);
			}
			//Moves note to the right
			//@Paramater   String Note
			public void moveNoteDown(String note){
				int index = this.notes.indexOf(note);
				int numberOfNotes = this.numberOfNotes();
				//try to rewrite without the return
				if(index == numberOfNotes) return;
				String curr = this.notes.get(index+1);
				this.notes.set(index+1, note);
				this.notes.set(index, curr);
			}
			//Moves note all the way to the left
			//@Paramater        String text
			public void moveToTop(String text){
				int itemPos = this.notes.indexOf(text);
			    this.notes.remove(itemPos);
			    this.notes.add(0, text);
			}
			//Moves note all the way to the right
			//@Paramater        String text
			public void moveToBottom(String text){
				int itemPos = this.notes.indexOf(text);
			    this.notes.remove(itemPos);
			    this.notes.add(3, text);
			}
}
