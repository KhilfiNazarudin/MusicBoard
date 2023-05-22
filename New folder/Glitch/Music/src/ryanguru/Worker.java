package ryanguru;

import pkg.YourCode;

public class Worker implements Runnable
{
	private int beatCount;
	
	public Worker(int beatCount)
	{
		this.beatCount = beatCount;
	}
	
	public void run()
	{
		YourCode.onBeat(beatCount);
	}
}
