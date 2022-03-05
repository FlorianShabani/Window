package balls.main;

import java.awt.Color;
import java.awt.Graphics;

import setup.ManagerA;
import setup.Window;

public class WindowTest extends ManagerA{
	
	public static final int WIDTH = 800, HEIGHT = 600, FPS = 60, TPS = 60;
	
	int boxX = 20;
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.RED);
		g.fillRect(boxX, 100, 100, 100);
	}
	
	public void tick() {
		boxX++;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Window wind = new Window(WIDTH, HEIGHT, FPS, TPS, "Window Title", new WindowTest());
	}
}
