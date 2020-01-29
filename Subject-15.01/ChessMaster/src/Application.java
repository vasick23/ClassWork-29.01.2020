import java.util.Scanner;
import com.chessmaster.manager.GameBoard;


public class Application {
	static boolean gameOver = false;
	static String currentPlayer = "White";
	 static Scanner scanner = new Scanner(System.in);
	 static String input;
       static int selectRow;
       static int selectCol;
       static int moveRow;
       static int moveCol;
	public static void main(String[] args) {	
		Menu();
		GameBoard.init();
	}
	public static void Menu() {
		while(!gameOver){
            try {
                System.out.println(currentPlayer + "'s Turn:");
                System.out.println("M - Move a piece");
                System.out.println("Q - Quit game");
                System.out.println("R - Reset the game");
                GameBoard.render();
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("QUIT")) {
                    gameOver = true;
                    System.out.println("<<<GAME HAS ENDED>>>");
                    continue;
                } else if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("RESTART")) {    
                	GameBoard.render();
                    System.out.println("<<<GAME RESTARTED>>>");
                    continue;
                } else if (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("MOVE")) {	                    
                	System.out.println("Move from: row, col");
                	selectRow = scanner.nextInt();
                	selectCol = scanner.nextInt();
                	if(GameBoard.isPieceSelectable(selectRow,selectCol)) {
                		
                	}
                	System.out.println("You Selected:" + "Where do you want to move it: Row,Col");
                	moveRow = scanner.nextInt();
                	moveCol = scanner.nextInt();
                }
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Couldn't parse input.");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException,Good Luck Debugging");
                e.printStackTrace();
            }	       
        }
	 scanner.close();
	}
}
