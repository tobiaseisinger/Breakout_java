package screenStates;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import screen.Screen;
import screen.ScreenManager;

public class TestScreen implements Screen, KeyListener {
	private int tickCount;

	@Override
	public void tick(int[] pixels) {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = i + tickCount | 0xFF000000;
		}
		
		tickCount++;
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			ScreenManager.setScreen(new GameScreen());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
