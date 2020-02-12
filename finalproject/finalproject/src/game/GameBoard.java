package game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class GameBoard extends JPanel implements KeyListener, MouseListener {
     Mowgli mowgli;
     Grape grape;
     Apple apple;
     Snake snake;
     Banana [] banana = new Banana[50];
     static boolean isRunning = false;
     int bananaCount = 0;

public GameBoard(){
	super();
	super.setFocusable(true);
	super.addKeyListener(this);
	//super.addMouseListener(this);
	mowgli = new   Mowgli(275,350,"images//0.png");
	grape = new Grape(400,230,"images//grape.png");
	apple = new Apple(600,300,"images//apple.png");
	snake = new Snake(720,350,"images//snake.png");
	for(int i = 0; i < banana.length; i++){
		banana[i] = new Banana(-40,-40,"images//banana.png");
	}
	

	
}
public void paint(Graphics g){
	
	ImageIcon background = new ImageIcon("images//background.png");
	g.drawImage(background.getImage(),0,0,null);
	mowgli.draw(g);
	grape.draw(g);
	apple.draw(g);
	snake.draw(g);

	for(int i = 0; i<banana.length; i++){
		
		banana[i].draw(g);
	}
	

	
}

public void startGame(){
	
	while(true){
		
		super.repaint();
	
	
		try{
			
			Thread.sleep(150);
			
		}
		catch(Exception e){}
	
	
	}
	
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	
	if(isRunning == false && e.getKeyCode() == e.VK_RIGHT){
		isRunning = true;

		
	Running km = new Running(this,mowgli);
		km.start();

		
		
		
		
	}
	
	
	if(e.getKeyCode() == KeyEvent.VK_UP)
	{ 	
		mowgli.setY(350);
		Jump j = new Jump(this,mowgli);				
			j.start();

	}
	

		
	
	
	
	super.repaint();
	
}

public void mousePressed(MouseEvent e) {
	banana[bananaCount].setY(mowgli.getY() + 45);
	banana[bananaCount].setX(mowgli.getX());
	
	BananaFiring fire = new BananaFiring(banana[bananaCount],snake,this);
	fire.start();
	
	bananaCount++;
	
	if(bananaCount == 50)
		bananaCount = 0;
	
	
	
	
	super.repaint();
	
	
}

	
	
	





@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}





public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}







}