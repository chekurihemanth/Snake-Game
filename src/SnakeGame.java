import javax.swing.*;
public class SnakeGame extends JFrame {
	private static final long serialVersionUID = 1L;
	Board board;
    SnakeGame(){
        board=new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        //Initialize Snake Game
        SnakeGame snakeGame=new SnakeGame();
    }

}
