package pkg;

import ryanguru.ColorDisplay;

public class YourCode
{ // 0 -20 20-80 80-90 90-113 113-135 135-165 165-178 178-214 214-245 245-264
	// Main
	//colours "RED", "GREEN", "BLUE", "CYAN", "ORANGE", "GRAY"
	public static void onBeat(int c)
	{
		System.out.println("At beat : " + c);

		;

		if  (c < 20)
		{
			VertLine(0, c % 20, 10, "CYAN");
			// Sunrise
			
		}
		else if ( (c > 20) && (c < 45) )
		{	
			HorLine((c%3) +3, 8, 3, "ORANGE");
			while (c >25)
			{	//MAKE CLOUDS MOVE!from 40 t0 60
				HorLine(8, 1 , 1, "GRAY");
				HorLine( (c%1) +7, 0 , 3 , "GRAY");
				ColorDisplay.pause(1000);
				HorLine(7, 18 , 1, "GRAY");
				HorLine( (c%1) +6, 17 , 3 , "GRAY");
				ColorDisplay.pause(1000);
				HorLine(2, 4 , 1, "GRAY");
				HorLine( (c%1) +1, 3 , 3 , "GRAY");
				ColorDisplay.pause(1000);
				HorLine(2, 13 , 1, "GRAY");
				HorLine( (c%1) +1, 12 , 3 , "GRAY");
				ColorDisplay.pause(1000);
				HorLine(9, 8 , 1, "GRAY");
				HorLine( (c%1) +8, 7 , 3 , "GRAY");
				ColorDisplay.pause(1000);
				}
		}
		
	
		
	}

	// Vertical Line
	public static void VertLine(int row, int col, int ht, String color)
	{
		for (int i = row; i < ht + row; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
		}

		// Pause
//		ColorDisplay.pause(150);

		// OFF
//		for (int i = 0; i < ht; i++)
//		{
//			ColorDisplay.setPixelOFF(i, col);
//		}
	}

	// Vertical Shooting Line
	public static void ShootingVertLine(int row, int col, int ht, int pause, String color)
	{
		for (int i = row; i < ht + row; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(100);
		}

		// pause
		ColorDisplay.pause(pause);

		// OFF
		for (int i = row; i < ht + row; i++)
		{
			ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(100);
		}
	}

	// Blink
	public static void Blink()
	{
		ColorDisplay.setPixelColor(5, 10, "RED");
		ColorDisplay.pause(30);
		ColorDisplay.setPixelOFF(5, 10);

	}

	// Horizontal Shooting Line
	public static void ShootingHorLineR(int row, int col, int wth, int pause, String color)
	{
		for (int i = col; i < wth + col; i++)
		{
			ColorDisplay.setPixelColor(row, i, color);
			ColorDisplay.pause(100);
		}

		// pause
		ColorDisplay.pause(1000);

		// OFF
		for (int i = 0; i < wth + col; i++)
		{
			ColorDisplay.setPixelOFF(row, i);
			ColorDisplay.pause(100);
		}
	}
		public static void ShootingHorLineL(int row, int col, int wth, String color)
		{
			for (int i = col; i > wth + col; i--)
			{
				ColorDisplay.setPixelColor(row, i, color);
				ColorDisplay.pause(100);
			}

			// pause
			

			// OFF
			for (int i = 0; i < wth + col; i++)
			{
				ColorDisplay.setPixelOFF(row, i);
				ColorDisplay.pause(100);
			}
	}

	// Horizontal Line
	public static void HorLine(int row, int col, int wth, String color)
	{
		for (int i = col; i < wth + col; i++)
		{
			ColorDisplay.setPixelColor(row, i, color);
		}
		// Pause
		ColorDisplay.pause(150);

		
	}

}
