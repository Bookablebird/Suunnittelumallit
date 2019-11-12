import java.util.Scanner;


public class ConnectFour extends Game {

    private char[][] board;
    private char currentPlayerMark;

    public ConnectFour() {
        board = new char[6][9];
        currentPlayerMark = '0';
        initializeBoard();
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    @Override
    public void initializeGame() {
        Scanner s = new Scanner(System.in);
        ConnectFour game = new ConnectFour();
        game.initializeBoard();
        System.out.println("Connect four");
        do
        {
            System.out.println("Board layout:");
            game.printBoard();
            int col;
            do
            {
                System.out.println("Player " + game.getCurrentPlayerMark() + ", enter column number(1-9) with space on top, to place your mark!");
                col = s.nextInt()-1;
            }
            while (!game.placeMark(col));
            game.changePlayer();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            game.printBoard();
            game.printWinner();
            game.changePlayer();
        }
    }

    public void initializeBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = '-';
            }
        }
    }
    public void printBoard() {
        System.out.println("-------------------------------------");

        for (int i = 0; i < 6; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------------------------------");
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    public boolean checkRowsForWin() {
        for (int i = 0, j = 0; i < 6; i++) {
    		if (checkRowCol(board[i][j], board[i][j+1], board[i][j+2], board[i][j+3]) == true) {
                return true;
            }
    		else if(i == 5 && j<5){
        		i = 0;
        		j++;
        	}

            }
        return false;
    }

    public boolean checkColumnsForWin() {
        for (int i = 0, j = 0; j < 9; j++) {
        	if (checkRowCol(board[i][j], board[i+1][j], board[i+2][j], board[i+3][j]) == true) {
                return true;
            }
        	else if(j == 8 && i<2){
        		j = 0;
        		i++;
        	}
            }
        return false;
    }

    public boolean checkDiagonalsForWin() {
        for (int i = 0, j = 0; i < 3; i++) {
    		if (checkRowCol(board[i][j], board[i+1][j+1], board[i+2][j+2], board[i+3][j+3]) == true) {
                return true;
            }
    		else if(i == 2 && j<5){
        		i = 0;
        		j++;
        	}

            }
        return false;
    }

    public boolean checkRowCol(char c1, char c2, char c3, char c4) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3) && (c3 == c4));
    }


    public void changePlayer() {
        if (currentPlayerMark == '0') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = '0';
        }
    }

    public boolean placeMark(int col) {
            if ((col >= 0) && (col < 9) && (board[0][col] == '-')) {
            	int row = 5;
                    if (board[row][col] == '-') {
                        board[row][col] = currentPlayerMark;
                        return true;
                    }
                    else{
                    	while(board[row][col] != '-'){
                    	row --;
                    	if (board[row][col] == '-') {
                            board[row][col] = currentPlayerMark;
                            return true;
                        }
                    }
            	}
            }
        return false;
    }


    @Override
    public void printWinner() {
        System.out.println(Character.toUpperCase(getCurrentPlayerMark()) + " Wins!");
    }

	@Override
	void makePlay(int player) {
		// I don't want to use this feature

	}

	@Override
	boolean endOfGame() {
		if(checkForWin()==true){
		return true;
		}
		else{
			return false;
		}
	}
}