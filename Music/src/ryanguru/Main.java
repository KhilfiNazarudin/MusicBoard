package ryanguru;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;

import ddf.minim.AudioInput;
import ddf.minim.AudioMetaData;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.BeatDetect;

//"/Users/cflim/Downloads/Minim-2.2.0/examples/Basics/PlayAFile/data/marcus_kellis_theme.mp3"
public class Main {

	Minim minim;
	static AudioPlayer player;
	static AudioInput input;
	AudioMetaData meta;
	BeatDetect beat;
	boolean mic = false;// turn this var true or false for mic listen or sound
						// play

	MyListener ml;


	public static void main(String[] args) {
		Main mainclass = new Main();
		String filename = mainclass.setup();
		filename = filename.split("\\.")[0];
		String[] words = filename.split("\\\\");
		filename = (words[words.length-1]);
		ColorDisplay.openDisplay(words[words.length-1]);
		
	}

	public String setup() {
		Minim minim = new Minim(this);

		if (mic) {
			input = minim.getLineIn(Minim.MONO);
			ml = new MyListener(this, input);
			input.addListener(ml);
			return "From Mic";
		} else {
			String filename = getMP3Filename();
			player = minim.loadFile(filename);
			player.play();
			ml = new MyListener(this, player);
			player.addListener(ml);
			return filename;
		}

	}

	public void stop() {
		player.close();

		minim.stop();
		
		ColorDisplay.closeDisplay();

	}

	public void draw() {// this function is never called
		//System.out.println("NEW DRAW");
	}

	public String sketchPath(String fileName) {
		//System.out.println("sketchPath: " + fileName);
		return fileName;
	}

	public InputStream createInput(String fileName) {
		//System.out.println("createInput:" + fileName);
		InputStream in2;
		try {
			in2 = new FileInputStream(fileName);
			//System.out.println("InputStream: created! " + fileName);
			return in2;
		} catch (Exception ex) {
			System.out.println("Error Catch Triggered: " + ex);
			in2 = null;
		}
		return in2;
	}
	
	private static String getMP3Filename(){
		  Frame f=new Frame();
		  FileDialog fd1=new FileDialog(f,"Select an mp3",FileDialog.LOAD);
		  fd1.setFile("*.mp3");
		  fd1.setFilenameFilter(new FilenameFilter(){
		    @Override public boolean accept(    File dir,    String name){
		      return (name.endsWith(".mp3"));
		    }
		  }
		);
		  fd1.setVisible(true);
		  String mp3Directory=fd1.getDirectory();
		  String mp3File=fd1.getFile();
		  f.dispose();
		  return (mp3Directory != null && mp3File != null) ? mp3Directory + System.getProperty("file.separator") + mp3File : null;
		}
}