package game;

public class Jump extends Thread {
	
	private GameBoard gameboard;
	private Mowgli man;

	
	public Jump(GameBoard gameboard, Mowgli man) {
		
		this.gameboard = gameboard;
		this.man = man;
	}
	
	@SuppressWarnings("deprecation")
	public void run(){
		int x = 275;
		int y = 350;
		
		
		while(man.getY() >= x){

			man.setY(man.getY() - 5);

			try {
				Thread.sleep(35);
			} 
			catch (Exception a) {
				// TODO Auto-generated catch block
			
			}
	
			
			
			gameboard.repaint();

			}
		while(man.getY() < y){
		
			man.setY(man.getY() + 5);
			try {
				Thread.sleep(35);
			} 
			catch (Exception a) {
				// TODO Auto-generated catch block
			
			}

			
			
			gameboard.repaint();
			
			}
		
		
	}
	
	
	
	
	

}
