import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class GoTClip implements Playable {
	
	private String character;
	private String fileName;
	
	public GoTClip(String character, String fileName) {
		this.character = character;
		this.fileName = fileName;
				
	}
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override 
	public void play() {
		System.out.println("Playing " + fileName);

		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		frame.add(label);
		frame.pack(); 
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocation(fileName.length()* 10, fileName.length() * 10);
		frame.setVisible(true);
	}



}
