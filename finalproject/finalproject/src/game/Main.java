package game;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
		
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("the junglebook");
		gameFrame.setSize(850, 640);
		gameFrame.add(gb);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		
		gb.startGame();

	}

}
