import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeinfeldClip implements Playable {
	
	private String speaker;
	private int year;
	private String fileName;
	
	public SeinfeldClip(String speaker, int year, String fileName) {
		this.speaker = speaker;
		this.year = year;
		this.fileName = fileName;
		
	}
	
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void play() {
		System.out.println("Playing " + fileName);
		AudioInputStream audioStream;

		try {
		   Clip clip = AudioSystem.getClip();
		   clip.open(AudioSystem.getAudioInputStream(new File(fileName)));
		   clip.start();
		   Thread.sleep(clip.getMicrosecondLength() / 1000);
		   clip.close();
		}
		catch (Exception e) {
		   e.printStackTrace(); 
		}
	}

}
