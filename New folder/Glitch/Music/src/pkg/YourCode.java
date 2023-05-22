package pkg;

import ryanguru.ColorDisplay;

public class YourCode
{ // 0 -20 20-80 80-90 90-113 113-135 135-165 165-178 178-214 214-245 245-264
	// Main
	// colours "RED", "GREEN", "BLUE", "CYAN", "ORANGE", "GRAY"
	public static void onBeat(int c)
	{
		
		 
		
		System.out.println("At beat : " + c);
		if (c < 20)
		{

			VertLineU(0, c % 20, 10, 10, "CYAN");
		}

		// sunrise
		else if ((c > 20) && (c < 40))
		{
			HorLineR((c % 3) + 3, 8, 3, 10, "ORANGE");
			ColorDisplay.pause(3000);

			Cloud(8, 2,100);

			Cloud(7, 17,100);

			Cloud(2, 4,100);

			Cloud(2, 13,100);

			Cloud(9, 8,100);
			// move at 40?

		
			
		}

		else if ((c > 41 ) && ( c < 54))
		{
			Bird(5, 2, c);
			HorLineR((c % 3) + 3, 8, 3, 1, "ORANGE");
			Cloud(8, 2,1);
			Cloud(9, 8,1);
		}
		
		else if ((c > 55) && (c < 60))

		{
			
			 Background("BLACK");
			
		}

		else if ((c > 65 && c < 90))
		{
			S();
			U();
			M();
			m();
			E();
			R();
			
		}
		else if (( c > 90) && (c < 100))
		{
			Background("BLACK");
		}

	
	// setup for beach front
	else if ( (c > 100) && (c < 110) )

	{
		// HOR LINE LEFT AND RIGHT TILL COL 5
		// for (int i = 9; i>3 ; i = i - 2)
		// {
		// HorLineR(i, 0, 20, 50, "BLUE");
		// }
		HorLineR(9, 0, 20, 50, "BLUE");
		HorLineL(8, 19, 20, 50, "BLUE");
		HorLineR(7, 0, 20, 50, "BLUE");
		HorLineL(6, 19, 20, 50, "BLUE");
		HorLineR(5, 0, 20, 50, "BLUE");
		// VERT LINE DOWN TO UP TILL COL 4 and down to up?
		VertLineU(0, 0, 5, 50, "ORANGE");
		VertLineD(4, 1, 5, 50, "ORANGE");
		VertLineU(0, 2, 5, 50, "ORANGE");
		VertLineD(4, 3, 5, 50, "ORANGE");
		VertLineU(0, 4, 5, 50, "ORANGE");
		VertLineD(4, 5, 5, 50, "ORANGE");
		VertLineU(0, 6, 5, 50, "ORANGE");
		VertLineD(4, 7, 5, 50, "ORANGE");
		VertLineU(0, 8, 5, 50, "ORANGE");
		VertLineD(4, 9, 5, 50, "ORANGE");
		VertLineU(0, 10, 5, 50, "ORANGE");
		VertLineD(4, 11, 5, 50, "ORANGE");
		VertLineU(0, 12, 5, 50, "ORANGE");
		VertLineD(4, 13, 5, 50, "ORANGE");
		VertLineU(0, 14, 5, 50, "ORANGE");
		VertLineD(4, 15, 5, 50, "ORANGE");
		VertLineU(0, 16, 5, 50, "ORANGE");
		VertLineD(4, 17, 5, 50, "ORANGE");
		VertLineU(0, 18, 5, 50, "ORANGE");
		VertLineD(4, 19, 5, 500, "ORANGE");
		ColorDisplay.pause(1000);
		

	}
	
	else if ((c > 120 ) && (c < 150))
	{
		MovingWave("CYAN", c,0);
		MovingWave("CYAN", c,5);
		MovingWave("CYAN", c, 10);
	}
	else if ( (c > 130) && (c <162) )
	{
	
	}
	}

	public static void Bird(int rows, int cols, int c) // 5 2
	{

		int row[] =
		{ 8, 8, 7, 6, 7, 8, 8, 5, 5, 5 };
		int col[] =
		{ 1, 2, 3, 4, 5, 6, 7, 3, 4, 5 };
		for (int i = 0; i < row.length; i++)
		{

			ColorDisplay.setPixelColor(row[i], col[i] + c % 13, "BLACK");
			ColorDisplay.pause(10);

		}
		ColorDisplay.pause(200);

		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelColor(row[i], col[i] + c % 13, "CYAN");
		}
	}

	public static void MovingWave(String color, int c,int gap)
	{
		int[] rows =
		{ 5, 6, 7, 7, 5 };
		int[] cols =
		{ 10, 11, 12, 13, 11 };

		for (int i = 0; i < rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], (cols[i] + c % 7) - gap, color);
			ColorDisplay.pause(10);
		}

		ColorDisplay.pause(400);

		for (int i = 0; i < rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], (cols[i] + c % 7) - gap,"BLUE");
		}
	}

	public static void Background(String colour)
	{
		for (int i = 0; i < 20; i++)

		{
			VertLineU(0,i, 10, 10, colour);
			// ColorDisplay.pause(100);
		}
	}

	public static void Cloud(int row, int col, int pause)
	{
		int[] rows =
		{ row, row - 1, row - 1, row - 1 };
		int[] cols =
		{ col, col - 1, col, col + 1 };

		for (int i = 0; i < rows.length; i++)
		{

			ColorDisplay.setPixelOFF(rows[i], cols[i] );
			ColorDisplay.pause(pause);

		}

	}

	public static void VertLineD(int row, int col, int ht, int pause, String color)
	{
		for (int i = row; i > row - ht; i--)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(pause);
		}
	}

	public static void VertLineU(int row, int col, int ht, int pause, String color)
	{
		for (int i = row; i < ht + row; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(pause);
		}

		// Pause
//		ColorDisplay.pause(150);

		// OFF
//		for (int i = 0; i < ht; i++)
//		{
//			ColorDisplay.setPixelOFF(i, col);
//		}
	}

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

	public static void Blink()
	{
		ColorDisplay.setPixelColor(5, 10, "RED");
		ColorDisplay.pause(30);
		ColorDisplay.setPixelOFF(5, 10);

	}

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

	public static void HorLineR(int row, int col, int wth, int pause, String color)
	{
		for (int i = col; i < wth + col; i++)
		{
			ColorDisplay.setPixelColor(row, i, color);
			ColorDisplay.pause(pause);
		}

	}

	public static void HorLineL(int row, int col, int wth, int pause, String color)
	{
		for (int i = col; i > col - wth; i--)
		{
			ColorDisplay.setPixelColor(row, i, color);
			ColorDisplay.pause(pause);
		}

	}

	public static void S()
	{
		int row[] =
		{ 9, 9, 9, 8, 7, 7, 7, 6, 5, 5, 5 };
		int col[] =
		{ 3, 2, 1, 1, 1, 2, 3, 3, 3, 2, 1 };
		for (int i = 0; i < row.length; i++)
		{

			ColorDisplay.setPixelColor(row[i], col[i], "ORANGE");
			ColorDisplay.pause(250);

		}
	}

	public static void U()
	{
		int row[] =
		{ 9, 8, 7, 6, 5, 5, 5, 5, 6, 7, 8, 9 };
		int col[] =
		{ 7, 7, 7, 7, 7, 8, 9, 10, 10, 10, 10, 10 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "ORANGE");
				ColorDisplay.pause(250);

			}
		}

	}

	public static void M()
	{
		int row[] =
		{ 9, 8, 7, 6, 5, 8, 7, 8, 9, 8, 7, 6, 5 };
		int col[] =
		{ 14, 14, 14, 14, 14, 15, 16, 17, 18, 18, 18, 18, 18 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "ORANGE");
				ColorDisplay.pause(250);

			}
		}
	}

	public static void m()
	{
		int row[] =
		{ 4, 3, 2, 1, 0, 3, 2, 3, 4, 3, 2, 1, 0 };
		int col[] =
		{ 1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "RED");
				ColorDisplay.pause(250);

			}
		}
	}

	public static void E()
	{
		int row[] =
		{ 4, 4, 4, 4, 3, 2, 1, 0, 0, 0, 0, 2, 2, 2 };
		int col[] =
		{ 10, 9, 8, 7, 7, 7, 7, 7, 8, 9, 10, 10, 9, 8, 7 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "RED");
				ColorDisplay.pause(250);

			}
		}
	}

	public static void R()
	{
		int row[] =
		{ 0, 1, 2, 3, 4, 4, 4, 4, 3, 2, 2, 2, 1, 0 };
		int col[] =
		{ 14, 14, 14, 14, 14, 15, 16, 17, 17, 17, 16, 15, 16, 17 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "RED");
				ColorDisplay.pause(250);

			}
		}
	}
}
