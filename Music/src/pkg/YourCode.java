package pkg;

import ryanguru.ColorDisplay;

public class YourCode
{ // 0 -20 20-80 80-90 90-113 113-135 135-165 165-178 178-214 214-245 245-264
	// Main
	// colours "RED", "GREEN", "BLUE", "CYAN", "ORANGE", "GRAY"
	
	//SONG NAME : Computer_Music_All-stars_-_May_the_Chords_Be_with_You
	public static void onBeat(int c)
	{

		System.out.println("At beat : " + c);

		if (c < 20)
		{
			VertLineU(0, c % 20, 10, 10, "CYAN");
			//VertLineU(0, 20, 10, 10, "CYAN");
			
		}

		// sunrise
		else if ((c > 20) && (c < 40))
		{
			HorLineR((c % 3) + 3, 8, 3, 10, "ORANGE");
			ColorDisplay.pause(3000);

			Cloud(8, 2, 100);

			Cloud(7, 18, 100);

			Cloud(2, 4, 100);

			Cloud(2, 14, 100);

			Cloud(9, 8, 100);
			// move at 40?

		}

		else if ((c > 41) && (c < 54))
		{
			Bird(5, 2, c);
			
			HorLineR((c % 3) + 3, 8, 3, 0, "ORANGE");
			
			Cloud(8, 2, 1);
			Cloud(9, 8, 1);
			Cloud(7, 18, 100);
		}

		else if ((c > 55) && (c < 60))

		{

			Background("BLACK", 100);

		}

		else if (c == 65)
		{
			S();
			U();
			M();
			m();
			E();
			R();

		}

		else if (c == 95)
		{
			Background("BLACK", 100);
		}

		// setup for beach front
		else if (c == 105)

		{
			HorLineR(9, 0, 20, 50, "CYAN");

			sealine(50);

			// BEACH
			beachfront(5, 4, 50);

			// FILL THIS UP WITH boatS
		}

		else if (c == 120)
		{
			trees(0, 2);
			ColorDisplay.pause(200);
			trees(0, 7);
			ColorDisplay.pause(200);
			trees(0, 12);
			ColorDisplay.pause(200);
			trees(0, 17);
			ColorDisplay.pause(200);
		}

		else if ((c > 121) && (c < 144))
		{
			MovingWave("CYAN", c, 0);
			MovingWave("CYAN", c, 5);
			MovingWave("CYAN", c, 10);

		}
		// ADD CRAB AT 134

		if ((c > 132) && (c < 160))
		{
			crabs(c);
		}

		if ((c > 145) && (c < 160))
		{
			boat(c);

		}

		// 170 tone down
		// S E A ?
		else if (c == 160)
		{
			Background("BLACK", 100);
		}

		else if (c == 170)
		{
			Sea(300);
			sEa(300);
			seA(300);

		} else if ((c > 170) && (c < 200)) // 200?
		{
			submarine(c);
		}

		else if (c == 200)
		{
			Background("BLUE", 300);
		}

		if ((c > 214) && (c < 253))
		{
			seaweed(0, 0);
			Seaweed(0, 0);

			seaweed(0, 17);
			Seaweed(0, 17);
		}

		if ((c > 225) && (c < 253))
		{
			fishie(c);
		}

		if ((c > 240) && (c < 253))
		{
			Whale(c);
		}

		if (c == 254)
		{
			Background("BLACK", 1);
		}

		if (c > 256)
		{
			THX();
			hearts();
		}
		// THANKS AT 259
		// 264 IS THE END
		// BACKUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUP
		/*
		 * else if(c==200) { Background("CYAN"); }
		 * 
		 * else if((c>220)&&(c<245)) { HorLineR((c % 3) + 3, 8, 3, 10, "ORANGE");
		 * ColorDisplay.pause(3000);
		 * 
		 * Cloud(8, 2, 100);
		 * 
		 * Cloud(7, 17, 100);
		 * 
		 * Cloud(2, 4, 100);
		 * 
		 * Cloud(2, 13, 100);
		 * 
		 * Cloud(9, 8, 100); }
		 * 
		 * else if(c>245) { Bird(5, 2, c); HorLineR((c % 3) + 3, 8, 3, 1, "ORANGE");
		 * Cloud(8, 2, 1); Cloud(9, 8, 1); Cloud(7, 17, 100); }
		 */

	}

	public static void sealine(int delay)
	{
		HorLineL(8, 19, 20, delay, "BLUE");
		HorLineR(7, 0, 20, delay, "BLUE");
		HorLineL(6, 19, 20, delay, "BLUE");
		HorLineR(5, 0, 20, delay, "BLUE");
	}

	public static void beachfront(int length, int rs, int delay)
	{
		VertLineU(0, 0, length, delay, "ORANGE");
		VertLineD(rs, 1, length, delay, "ORANGE");
		VertLineU(0, 2, length, delay, "ORANGE");
		VertLineD(rs, 3, length, delay, "ORANGE");
		VertLineU(0, 4, length, delay, "ORANGE");
		VertLineD(rs, 5, length, delay, "ORANGE");
		VertLineU(0, 6, length, delay, "ORANGE");
		VertLineD(rs, 7, length, delay, "ORANGE");
		VertLineU(0, 8, length, delay, "ORANGE");
		VertLineD(rs, 9, length, delay, "ORANGE");
		VertLineU(0, 10, length, delay, "ORANGE");
		VertLineD(rs, 11, length, delay, "ORANGE");
		VertLineU(0, 12, length, delay, "ORANGE");
		VertLineD(rs, 13, length, delay, "ORANGE");
		VertLineU(0, 14, length, delay, "ORANGE");
		VertLineD(rs, 15, length, delay, "ORANGE");
		VertLineU(0, 16, length, delay, "ORANGE");
		VertLineD(rs, 17, length, delay, "ORANGE");
		VertLineU(0, 18, length, delay, "ORANGE");
		VertLineD(rs, 19, length, delay, "ORANGE");

		/*
		 * original VertLineU(0, 0, 5, 50, "ORANGE"); VertLineD(4, 1, 5, 50, "ORANGE");
		 * VertLineU(0, 2, 5, 50, "ORANGE"); VertLineD(4, 3, 5, 50, "ORANGE");
		 * VertLineU(0, 4, 5, 50, "ORANGE"); VertLineD(4, 5, 5, 50, "ORANGE");
		 * VertLineU(0, 6, 5, 50, "ORANGE"); VertLineD(4, 7, 5, 50, "ORANGE");
		 * VertLineU(0, 8, 5, 50, "ORANGE"); VertLineD(4, 9, 5, 50, "ORANGE");
		 * VertLineU(0, 10,5, 50, "ORANGE"); VertLineD(4, 11, 5, 50, "ORANGE");
		 * VertLineU(0, 12, 5, 50, "ORANGE"); VertLineD(4, 13, 5, 50, "ORANGE");
		 * VertLineU(0, 14, 5, 50, "ORANGE"); VertLineD(4, 15, 5, 50, "ORANGE");
		 * VertLineU(0, 16, 5, 50, "ORANGE"); VertLineD(4, 17, 5, 50, "ORANGE");
		 * VertLineU(0, 18, 5, 50, "ORANGE"); VertLineD(4, 19, 5, 50, "ORANGE");
		 */
	}

	public static void boat(int c)
	{
		// base
		int rowb[] =
		{ 6, 5, 5, 5, 5, 5, 6 };
		int colb[] =
		{ 8, 9, 10, 11, 12, 13, 14 };

		// pole
		int rowp[] =
		{ 6 };
		int colp[] =
		{ 11 };

		// sail
		int rows[] =
		{ 7, 8, 7, 8, 7 };
		int cols[] =
		{ 11, 11, 12, 12, 13 };

		int rowS[] =
		{ 9 };
		int colS[] =
		{ 11 };

		// base
		for (int i = 0; i < rowb.length; i++)
		{

			ColorDisplay.setPixelColor(rowb[i], (colb[i] + c % 11) - 7, "BLACK");

			ColorDisplay.pause(0);

		}

		// pole
		for (int i = 0; i < rowp.length; i++)
		{

			ColorDisplay.setPixelColor(rowp[i], (colp[i] + c % 11) - 7, "ORANGE");

			ColorDisplay.pause(0);

		}

		// sail
		for (int i = 0; i < rows.length; i++)
		{

			ColorDisplay.setPixelColor(rows[i], (cols[i] + c % 11) - 7, "GREEN");

			ColorDisplay.pause(0);

		}

		for (int i = 0; i < rowS.length; i++)
		{
			ColorDisplay.setPixelColor(rowS[i], (colS[i] + c % 11) - 7, "GREEN");
		}

		ColorDisplay.pause(300);

		// OFF
		for (int i = 0; i < rowb.length; i++)
		{
			ColorDisplay.setPixelColor(rowb[i], (colb[i] + c % 11) - 7, "BLUE");
		}

		for (int i = 0; i < rowp.length; i++)
		{
			ColorDisplay.setPixelColor(rowp[i], (colp[i] + c % 11) - 7, "BLUE");

		}

		for (int i = 0; i < rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], (cols[i] + c % 11) - 7, "BLUE");
		}

		for (int i = 0; i < rowS.length; i++)
		{
			ColorDisplay.setPixelColor(rowS[i], (colS[i] + c % 11) - 7, "CYAN");
		}

	}

	public static void submarine(int c)
	{
		int rowB[] =
		{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
		int colB[] =
		{ 9, 10, 11, 12, 13, 14, 15, 16, 10, 12, 13, 14, 15, 16, 11, 12, 13, 14, 15, 16 };

		int rowP[] =
		{ 3, 4, 4 };
		int colP[] =
		{ 12, 12, 11 };

		int rowb[] =
		{ 1, 1, 2, 3, 4 };
		int colb[] =
		{ 17, 18, 18, 17, 18 };

		// window
		int rowW[] =
		{ 1 };
		int colW[] =
		{ 11 };

		// body
		for (int i = 0; i < rowB.length; i++)
		{

			ColorDisplay.setPixelColor(rowB[i], colB[i] - (c % 9), "GREEN"); // - (c % 9)
			ColorDisplay.pause(0);

		}

		// window
		for (int i = 0; i < rowW.length; i++)
		{

			ColorDisplay.setPixelColor(rowW[i], colW[i] - (c % 9), "BLACK"); // - (c % 7)
			ColorDisplay.pause(0);

		}

		// ColorDisplay.pause(250);

		// bubble
		for (int i = 0; i < rowb.length; i++)
		{

			ColorDisplay.setPixelColor(rowb[i], colb[i] - (c % 9), "CYAN");
			ColorDisplay.pause(0);

		}
		// ColorDisplay.pause(250);

		// periscope
		for (int i = 0; i < rowP.length; i++)
		{
			ColorDisplay.setPixelColor(rowP[i], colP[i] - (c % 9), "RED");
			ColorDisplay.pause(0);
		}
		ColorDisplay.pause(250);

		// switch off
		for (int i = 0; i < rowB.length; i++)
		{
			ColorDisplay.setPixelColor(rowB[i], colB[i] - (c % 9), "BLACK");
		}

		for (int i = 0; i < rowP.length; i++)
		{
			ColorDisplay.setPixelColor(rowP[i], colP[i] - (c % 9), "BLACK");
		}

		for (int i = 0; i < rowb.length; i++)
		{
			ColorDisplay.setPixelColor(rowb[i], colb[i] - (c % 9), "BLACK");
		}

		/*
		 * for (int i = 0; i < rowW.length; i++) { ColorDisplay.setPixelColor(rowB[i],
		 * colB[i], "BLUE"); }
		 */

	}

	public static void fishie(int c)
	{

		int[] row =
		{ 5, 6, 7, 8, 6, 6, 6, 6, 7, 7, 7, 5, 5, 5, 8, 8, 8, 6, 7 };
		int[] col =
		{ 6, 6, 6, 6, 7, 8, 9, 10, 7, 8, 9, 10, 9, 8, 10, 9, 8, 11, 11 };
		int[] rowb =
		{ 8, 9 };
		int[] colb =
		{ 12, 13 };

		// eyes

		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelColor(7, 6 + c % 11, "BLACK");
			ColorDisplay.setPixelColor(row[i], (col[i] + c % 11) - 4, "ORANGE");

		}

		// BUBBLE
		for (int i = 0; i < rowb.length; i++)
		{
			ColorDisplay.setPixelColor(rowb[i], (colb[i] + c % 11) - 4, "CYAN");
		}
		ColorDisplay.pause(275);
		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelColor(7, 6 + c % 11, "BLUE");
			ColorDisplay.setPixelColor(row[i], (col[i] + c % 11) - 4, "BLUE");
		}
		for (int i = 0; i < rowb.length; i++)
		{
			ColorDisplay.setPixelColor(rowb[i], (colb[i] + c % 11) - 4, "BLUE");
		}

	}

	public static void Whale(int c)
	{
		int[] row =
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 1 };
		int[] col =
		{ 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 7, 8, 9, 10, 11, 10, 13, 16, 7, 9, 10, 11, 12, 8, 9, 10, 11, 12 };

		int rowE[] =
		{ 2 };
		int colE[] =
		{ 9 };
		// ADD EYES
		for (int i = 0; i < row.length; i++)
		{

			ColorDisplay.setPixelColor(row[i], col[i] - (c % 7) + 1, "CYAN");
			ColorDisplay.pause(0);

		}

		for (int i = 0; i < rowE.length; i++)
		{

			ColorDisplay.setPixelColor(rowE[i], colE[i] - (c % 7), "BLACK");
			ColorDisplay.pause(0);

		}

		ColorDisplay.pause(250);
		
		//OFF
		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelColor(row[i], col[i] - (c % 7) + 1, "BLUE");
		}

		for (int i = 0; i < rowE.length; i++)
		{
			ColorDisplay.setPixelColor(rowE[i], colE[i] - (c % 7), "BLUE");
		}
	}

	public static void Seaweed(int row, int col)
	{
		for (int i = row; i < 8; i = i + 2)
		{
			ColorDisplay.setPixelColor(i + 1, col, "GREEN");
			ColorDisplay.pause(10);
		}
		for (int i = row; i < 7; i = i + 2)
		{
			ColorDisplay.setPixelColor(i, col + 1, "GREEN");
			ColorDisplay.pause(10);

		}

		ColorDisplay.pause(10);

		for (int i = row; i < 8; i = i + 2)
		{
			ColorDisplay.setPixelColor(i + 1, col, "BLUE");
			ColorDisplay.pause(10);
		}
		for (int i = row; i < 7; i = i + 2)
		{
			ColorDisplay.setPixelColor(i, col + 1, "BLUE");
			ColorDisplay.pause(10);
		}
		ColorDisplay.pause(10);
	}

	public static void seaweed(int row, int col)
	{
		for (int i = row; i < 10; i = i + 2)
		{
			ColorDisplay.setPixelColor(i, col, "GREEN");
			ColorDisplay.pause(10);
		}
		for (int i = row; i < 7; i = i + 2)
		{
			ColorDisplay.setPixelColor(i + 1, col + 1, "GREEN");
			ColorDisplay.pause(10);
		}

		ColorDisplay.pause(10);

		for (int i = row; i < 10; i = i + 2)
		{
			ColorDisplay.setPixelColor(i, col, "BLUE");
			ColorDisplay.pause(10);
		}
		for (int i = row; i < 7; i = i + 2)
		{
			ColorDisplay.setPixelColor(i + 1, col + 1, "BLUE");
			ColorDisplay.pause(10);
		}
		ColorDisplay.pause(10);
	}

	public static void Mcloud(int c)
	{
		int[] row =
		{ 8, 8, 8, 9 };
		int[] col =
		{ 2, 3, 4, 3 };
		for (int i = 0; i < row.length; i++)
		{

			ColorDisplay.setPixelColor(row[i], col[i] + c % 13, "BLACK");
			ColorDisplay.pause(10);

		}
		ColorDisplay.pause(300);

		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelOFF(row[i], col[i] + c % 13);
		}

	}

	public static void trees(int startR, int startC)
	{
		int rowB[] =
		{ startR, startR + 1, startR + 2, startR + 3 };
		int colB[] =
		{ startC, startC, startC, startC };
		int rowL[] =
		{ startR + 4, startR + 3, startR + 3, startR + 3 };
		int colL[] =
		{ startC, startC - 1, startC + 1, startC + 1 };

		int i = 0;
		while (i < rowB.length)
		{
			ColorDisplay.setPixelColor(rowB[i], colB[i], "BLACK");
			ColorDisplay.setPixelColor(rowL[i], colL[i], "GREEN");
			ColorDisplay.pause(200);
			i = i + 1;

		}
	}

	public static void crabs(int c)
	{ // tolerant 2 16 21 12
		int[] rowT =
		{ 9,9,9,9,9,8,8,8,7,7,7,7,6,6,6,6,6,6,5,5,5,5,5,5,5};
		int[] colT =
		{ 7,8,9,10,11,7,9,11,5,6,12,13,5,6,7,11,12,13,5,6,8,9,10,12,13};

		int[] rowsR =
		{ 6, 6, 6, 7, 7, 7, 7, 7, 8, 8 };
		int[] colsR =
		{ 8, 9, 10, 7, 8, 9, 10, 11, 6, 12 };

		int[] rowsB =
		{ 5, 5, 8, 8, 9, 9, 9, 9, 8, 8 };
		int[] colsB =
		{ 7, 11, 5, 13, 5, 6, 12, 13, 8, 10 };
		
		for (int i = 0; i < rowT.length; i++)
		{
			ColorDisplay.setPixelColor(rowT[i] - 5, (colT[i] + 6) - c % 12, "ORANGE");
		}
		
		for (int i = 0; i < rowsR.length; i++)
		{
			
			ColorDisplay.setPixelColor(rowsR[i] - 5, (colsR[i] + 6) - c % 12, "RED");

			ColorDisplay.pause(5);
		}
		
		//OFF
		for (int i = 0; i < rowsR.length; i++)
		{
			ColorDisplay.setPixelColor(rowsB[i] - 5, (colsB[i] + 6) - c % 12, "BLACK");
			ColorDisplay.pause(5);

		}

		// Tolerant

		ColorDisplay.pause(180);

		for (int i = 0; i < rowsR.length; i++)
		{
			ColorDisplay.setPixelColor(rowsR[i] - 5, (colsR[i] + 6) - c % 12, "ORANGE");
			ColorDisplay.pause(0);
		}
		for (int i = 0; i < rowsR.length; i++)
		{
			ColorDisplay.setPixelColor(rowsB[i] - 5, (colsB[i] + 6) - c % 12, "ORANGE");
			ColorDisplay.pause(0);
		}
	}

	public static void SharkFin(int c)
	{
		int row[] =
		{ 4, 4, 5 };
		int col[] =
		{ 0, 1, 1 };
		for (int i = 0; i < row.length; i++)
		{

			ColorDisplay.setPixelColor(row[i], col[i] + c % 17, "CYAN");
			ColorDisplay.pause(10);

		}
		ColorDisplay.pause(200);

		for (int i = 0; i < row.length; i++)
		{
			ColorDisplay.setPixelColor(row[i], col[i] + c % 17, "BLUE");
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

	public static void MovingWave(String color, int c, int gap)
	{
		int[] rows =
		{ 4, 5, 6, 6, 4 };
		int[] cols =
		{ 16, 15, 14, 13, 15 };

		for (int i = 0; i < rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i] + 1, (cols[i] + c % 4) - gap, color);
			ColorDisplay.pause(10);
		}

		ColorDisplay.pause(175); // 200

		for (int i = 0; i < rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i] + 1, (cols[i] + c % 4) - gap, "BLUE");
		}
	}

	public static void Background(String colour, int pause)
	{
		for (int i = 0; i < 20; i++)

		{
			VertLineU(0, i, 10, 10, colour);
			ColorDisplay.pause(pause); // default os 1--
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

			ColorDisplay.setPixelOFF(rows[i], cols[i]);
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

	public static void Sea(int pause) // Default pause time is 250ms
	{
		int row[] =
		{ 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 9, 9, 9, 9 };
		int col[] =
		{ 1, 2, 3, 4, 4, 4, 3, 2, 1, 1, 1, 2, 3, 4 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i], "BLUE");
				ColorDisplay.pause(pause);

			}
		}

	}

	public static void sEa(int pause) // Default pause time is 250ms

	{
		int row[] =
		{ 9, 9, 9, 9, 8, 7 };
		int col[] =
		{ 10, 9, 8, 7, 7, 7, };
		int rowb[] =
		{ 5, 5, 5, 5, 6, 7, 7, 7, 7 };
		int colb[] =
		{ 10, 9, 8, 7, 7, 7, 8, 9, 10 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i] + 1, "BLUE");
				ColorDisplay.pause(pause);

			}
		}

		for (int i = 0; i < rowb.length; i++)
		{
			{

				ColorDisplay.setPixelColor(rowb[i], colb[i] + 1, "BLUE");
				ColorDisplay.pause(pause);

			}
		}
	}

	public static void seA(int pause) // Default pause time is 250ms
	{
		int row[] =
		{ 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 7, 7 };
		int col[] =
		{ 13, 13, 13, 13, 14, 15, 16, 16, 16, 16, 15, 14 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i] + 2, "BLUE");
				ColorDisplay.pause(pause);

			}
		}
	}

	public static void THX()
	{
		String color = ColorDisplay.randomColor();

		// T
		VertLineU(5, 3, 5, 0, color);
		HorLineR(9, 1, 5, 0, color);
		// H
		VertLineU(5, 8, 5, 0, color);
		VertLineU(5, 11, 5, 0, color);
		HorLineR(7, 8, 4, 0, color);
		// X
		int row[] =
		{ 7, 8, 9, 8, 9, 6, 5, 6, 5 };
		int col[] =
		{ 14, 15, 16, 13, 12, 15, 16, 13, 12 };

		for (int i = 0; i < row.length; i++)
		{
			{

				ColorDisplay.setPixelColor(row[i], col[i] + 2, color);
				ColorDisplay.pause(0);

			}
		}

	}

	public static void hearts()
	{
		int[] rows =
		{ 3, 4, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 4, 3 };
		int[] cols =
		{ 4, 5, 6, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3 };

		String color = ColorDisplay.randomColor();
		for (int i = 0; i < rows.length; i++)
		{

			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(1);
		}

		// ColorDisplay.pause(100);
		/*
		 * for (int i = 0; i < rows.length; i++) { ColorDisplay.setPixelColor(rows[i],
		 * cols[i], "BLACK"); }
		 */
		for (int i = 0; i < rows.length; i++)
		{

			ColorDisplay.setPixelColor(rows[i], cols[i] + 12, color);
			ColorDisplay.pause(3);
		}

	}

}
