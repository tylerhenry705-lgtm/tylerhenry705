import java.util.List;
import java.util.ArrayList;
public class MediaPlayer {

	public static void main(String[] args) {
		//TODO 
		//Create 2 Seinfeld Clips
		SeinfeldClip s1 = new SeinfeldClip("Jerry", 1999, "Seinfeld-Jerry.wav");
		SeinfeldClip s2 = new SeinfeldClip("Kramer", 1999, "Seinfeld-Kramer.wav");
		//Create 2 GoT Clips
		GoTClip g1 = new GoTClip("Joffery","GameOfThrones-Joffrey.gif");
		GoTClip g2 = new GoTClip("Jon","GameOfThrones-Jon.gif");
		//Add all 4 clips to the same collection (an ArrayList is fine!)
		ArrayList<Playable> clips = new ArrayList<>(); 
		clips.add(s1);
		clips.add(s2);
		clips.add(g1);
		clips.add(g2);
		//Write a for-each loop to play all of the clips
		for(Playable p : clips) {
			p.play();
		}
	}
}
