package ryanguru;

import ddf.minim.AudioListener;
import ddf.minim.AudioSource;
import ddf.minim.analysis.BeatDetect;

public class MyListener implements AudioListener {

	Main myMain = null;
	BeatDetect beat;
	AudioSource as;
	long time = 0;
	int sensitivity = 300; // how many time to wait between beats in ms
	int beatCount = 0;


	public MyListener(Main myMain, AudioSource as) {
		super();
		this.myMain = myMain;
		beat = new BeatDetect(as.bufferSize(), as.sampleRate());
		beat.setSensitivity(sensitivity);
		beat.detectMode(beat.SOUND_ENERGY);

		this.as = as;
		time = System.currentTimeMillis();
	}


	@Override
	public void samples(float[] sampL, float[] sampR) {
		beat.detect(sampL);
		if (System.currentTimeMillis() - time > sensitivity) {	 
			if (beat.isOnset()) {
				(new Thread(new Worker(beatCount))).start();
				beatCount++;
				time = System.currentTimeMillis();
			}
		}

	}


	@Override
	public void samples(float[] arg0) {
		// TODO Auto-generated method stub
		
	}
}
