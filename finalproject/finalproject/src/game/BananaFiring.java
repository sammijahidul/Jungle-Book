package game;
import java.awt.*;
public class BananaFiring extends Thread { 


	Banana banana;
	Snake snake;
	GameBoard gb;
	
	
	
	public BananaFiring(Banana banana, Snake snake, GameBoard gb) {
		
		this.banana =banana;
		this.snake = snake;
		this.gb = gb;
	}

	public void run(){
		
		while(banana.getX() > -10){
			
			banana.setX(banana.getX() + 1);
			checkCollision();
			
			try{
				Thread.sleep(10);
			}
			catch(Exception e){}
			
			gb.repaint();
			
		}
		
		
		
		
	}

	public void checkCollision(){
		
		Rectangle bananarect = new Rectangle(banana.getX(),banana.getY(),100,100);
		
	
			
			Rectangle snakeRect = new Rectangle(snake.getX(),snake.getY(),90,90);
			
			if(bananarect.intersects(snakeRect) == true){
				//GameSound.bulletHitSound();
				snake.setX(1200);
				//GameBoard.score++;
				
			
			
			
			
		}
		
		
		
	}




}
