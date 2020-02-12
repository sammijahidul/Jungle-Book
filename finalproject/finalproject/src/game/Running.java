package game;

public class Running extends Thread {
	private GameBoard gb;
	private Mowgli mowgli;
	
	public  Running(GameBoard gb, Mowgli mowgli) {
		this.gb = gb;
		this.mowgli = mowgli;
	}
	
public void run(){
		
		for(int i = 0; i < 5; i++){
			
			mowgli.setImagePath("images//run//" + i + ".png");
			
			try{
				
				Thread.sleep(150);
			}
			
			catch(Exception e){}
			
			if(mowgli.getX() < 750)
				mowgli.setX(mowgli.getX() + 10);
			
			
			gb.repaint();
		}
		
		gb.isRunning = false;
		
}
}

