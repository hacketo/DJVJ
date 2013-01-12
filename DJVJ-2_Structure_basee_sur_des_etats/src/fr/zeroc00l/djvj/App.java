package fr.zeroc00l.djvj;


import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class App extends StateBasedGame{

	public static final int MENU = 0;
	public static final int JEUX = 1;
	
	
	public App(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		
		this.addState(new Menu(MENU));
		this.addState(new Jeux(JEUX));
		
	}
	

	public static void main (String[] args) throws SlickException{
		
		AppGameContainer a = new AppGameContainer(new App("DJVJ"));
		
		Display.setLocation(2120, 50);
		
		a.setDisplayMode(800, 600, false);
		a.start();
		
		
	}



	

	
	
}
