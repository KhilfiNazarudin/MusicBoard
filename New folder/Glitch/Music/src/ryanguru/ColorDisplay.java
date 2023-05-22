package ryanguru;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ColorDisplay {
	private static JFrame window;
	private static Pixel[][] screen;
	private static RowLabel[] rowLabels;
	private static ColLabel[] colLabels;
	private static int STD_PIXEL_SIZE = 50;
	private static int PIXEL_SIZE;
	private static int H_MAX_PIX = 20;
	private static int V_MAX_PIX = 10;
	private static int STD_ROW_LABEL_WIDTH = 70, STD_COL_LABEL_HEIGHT = 70;
	private static int ROW_LABEL_WIDTH, COL_LABEL_HEIGHT;

	private static String[] color = { "RED", "CYAN", "GREEN", "ORANGE", "BLUE" };

	public static void openDisplay(String title) {

		int pixelPerInch=java.awt.Toolkit.getDefaultToolkit().getScreenResolution(); 
		int scalingFactor = 1; //pixelPerInch / 150;
		PIXEL_SIZE = STD_PIXEL_SIZE * scalingFactor;
		ROW_LABEL_WIDTH = STD_ROW_LABEL_WIDTH * scalingFactor;
		COL_LABEL_HEIGHT = STD_COL_LABEL_HEIGHT * scalingFactor;
		
		window = new JFrame();
		window.setLayout(null);
		window.setSize(ROW_LABEL_WIDTH + 15*scalingFactor + H_MAX_PIX * PIXEL_SIZE,
				COL_LABEL_HEIGHT + 35*scalingFactor + V_MAX_PIX * PIXEL_SIZE);
		window.setTitle(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);

		screen = new Pixel[V_MAX_PIX][H_MAX_PIX];

		for (int c = 0; c < H_MAX_PIX; c++)
			for (int r = 0; r < V_MAX_PIX; r++) {
				screen[r][c] = new Pixel(r, c,
						ROW_LABEL_WIDTH + c * PIXEL_SIZE, (V_MAX_PIX - 1)
								* PIXEL_SIZE - r * PIXEL_SIZE, PIXEL_SIZE,
						PIXEL_SIZE, PIXEL_SIZE, scalingFactor);
				window.add(screen[r][c]);
			}

		rowLabels = new RowLabel[V_MAX_PIX];
		for (int r = 0; r < V_MAX_PIX; r++) {
			rowLabels[r] = new RowLabel(r, 0, (V_MAX_PIX - 1) * PIXEL_SIZE - r
					* PIXEL_SIZE, ROW_LABEL_WIDTH, PIXEL_SIZE, scalingFactor);
			window.add(rowLabels[r]);
		}

		colLabels = new ColLabel[H_MAX_PIX];
		for (int c = 0; c < H_MAX_PIX; c++) {
			colLabels[c] = new ColLabel(c, ROW_LABEL_WIDTH + c * PIXEL_SIZE,
					V_MAX_PIX * PIXEL_SIZE, PIXEL_SIZE, COL_LABEL_HEIGHT, scalingFactor);
			window.add(colLabels[c]);
		}

		window.setVisible(true);
		window.setAlwaysOnTop(true);
		window.setAlwaysOnTop(false);
	}

	public static void closeDisplay() {
		window.dispose();
	}

	public static void setPixelON(int r, int c) {
		setPixelColor(r, c, "ORANGE");
	}

	public static void setPixelOFF(int r, int c) {
		setPixelColor(r, c, "GRAY");
	}

	public static void setPixelColor(int r, int c, String color) {

		screen[r][c].setColor(pickColor(color));
		window.repaint();
	}

	private static Color pickColor(String color) {
		Color result;
		if (color.equals("RED"))
			result = Color.red;
		else if (color.equals("GREEN"))
			result = Color.green;
		else if (color.equals("BLUE"))
			result = Color.blue;
		else if (color.equals("CYAN"))
			result = Color.cyan;
		else if (color.equals("ORANGE"))
			result = Color.orange;
		else if (color.equals("GRAY"))
			result = Color.gray;
		else
			result = Color.black;

		return result;
	}

	public static void setScreenOFF() {
		for (int c = 0; c < H_MAX_PIX; c++)
			for (int r = 0; r < V_MAX_PIX; r++) {
				setPixelOFF(r, c);
			}
		window.repaint();
	}

	public static void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String randomColor() {
		int colorIdx = (int) (Math.round((Math.random() * (color.length - 1))));
		return color[colorIdx];
	}

	public static int randomRow() {
		return (int) (Math.random() * (V_MAX_PIX - 1));
	}

	public static int randomCol() {
		return (int) (Math.random() * (H_MAX_PIX - 1));
	}

}

class Pixel extends JComponent {
	private Color c;
	private int x, y, w, h;
	private int PIXEL_SIZE;
	private int row, col;
	private int scalingFactor;
	
	public Pixel(int r, int c, int x, int y, int w, int h, int size, int scalingFactor) {
		super();
		this.row = r;
		this.col = c;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.setBounds(x, y, w, h);
		PIXEL_SIZE = size;
		this.c = Color.gray;
		this.scalingFactor = scalingFactor;
	}

	public void setColor(Color w) {
		c = w;
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillRect(0, 0, w, h);
		g.setColor(Color.white);

		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, g.getFont().getSize()*scalingFactor));
		FontMetrics context = g.getFontMetrics();
		String text = row + "," + col;
		int textwidth = context.stringWidth(text);
		int textheight = context.getHeight();
		g.drawString(text, w / 2 - textwidth / 2, h / 2 + textheight / 2);
		// g.drawString(row+","+col, 2, PIXEL_SIZE-5);

		g.setColor(Color.black);
		g.drawRect(0, 0, w, h);

	}

}

class RowLabel extends JComponent {
	private Color c;
	private int x, y, w, h;
	private int row;
	private int scalingFactor;

	public RowLabel(int r, int x, int y, int w, int h, int scalingFactor) {
		super();
		this.row = r;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.setBounds(x, y, w, h);
		this.c = new Color(0, 0, 180); // RGB
		
		this.scalingFactor = scalingFactor;
	}

	public void setColor(Color w) {
		c = w;
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillRect(0, 0, w, h);
		g.setColor(Color.white);

		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, g.getFont().getSize()*scalingFactor));
		FontMetrics context = g.getFontMetrics();
		String text = "R:" + row;
		int textwidth = context.stringWidth(text);
		int textheight = context.getHeight();
		g.drawString(text, w / 2 - textwidth / 2, h / 2 + textheight / 2);

		g.setColor(Color.black);
		((Graphics2D) g).setStroke(new BasicStroke(3));
		g.drawRect(0, 0, w, h);

	}

}

class ColLabel extends JComponent {
	private Color c;
	private int x, y, w, h;
	private int col;
	private int scalingFactor; 
	
	public ColLabel(int c, int x, int y, int w, int h, int scalingFactor) {
		super();
		this.col = c;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.setBounds(x, y, w, h);
		this.c = new Color(128, 0, 128); // RGB
		
		this.scalingFactor = scalingFactor;
	}

	public void setColor(Color w) {
		c = w;
	}

	public void drawRotate(Graphics2D g2d, double x, double y, int angle,
			String text) {
		g2d.translate((float) x, (float) y);
		g2d.rotate(Math.toRadians(angle));
		g2d.drawString(text, 0, 0);
		g2d.rotate(-Math.toRadians(angle));
		g2d.translate(-(float) x, -(float) y);
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillRect(0, 0, w, h);
		g.setColor(Color.white);

		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, g.getFont().getSize()*scalingFactor));
		FontMetrics context = g.getFontMetrics();
		String text = "C:" + col;
		int textwidth = context.stringWidth(text);
		int textheight = context.getHeight();
		g.drawString(text, w / 2 - textwidth / 2, h / 2 + textheight / 2);

		g.setColor(Color.black);
		((Graphics2D) g).setStroke(new BasicStroke(3));
		g.drawRect(0, 0, w, h);

	}

}