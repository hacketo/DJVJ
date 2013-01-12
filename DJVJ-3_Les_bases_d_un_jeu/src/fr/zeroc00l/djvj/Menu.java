package fr.zeroc00l.djvj;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu  extends BasicGameState{

	private int id;
	
	private Image img;
	
	private Input input;
	
	private int x,y;
	
	public Menu(int id){
		this.id =id;
	}
	
	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub
		
		img = new Image("res/img/point.png");
		
		input = container.getInput(); 
	}


	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
		
		
		int w = input.getMouseX();
		int h = input.getMouseY();
		
		int w2 = img.getWidth();
		int h2 = img.getHeight();
		
		
		x = w - w2/2;
		y = h - h2/2;
		
		
	}
	

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		
		img.draw(x,y);
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
