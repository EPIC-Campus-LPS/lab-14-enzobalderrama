
public class Validate {
	public static boolean boardValidator(String[][] board) {
		if (board[9] == null && board[9][9] == null) {
			return false;
		}
		int[][] rlocations = new int[10][10];
		int rcount = 0;
		int[][] clocations = new int[10][10];
		int ccount = 0;
		int[][] blocations = new int[10][10];
		int bcount = 0;
		int[][] slocations = new int[10][10];
		int scount = 0;
		int[][] dlocations = new int[10][10];
		int dcount = 0; 
		for (int i = 0; i < board.length; i++) {
			for (int j= 0; j < board[0].length; j++) {
				if (board[i][j].equals("R")) {
					rlocations[i][j] = 1;
					rcount++;
					if (!(board[(i+1)%10][j].equals("R") || board[Math.abs((i*10-1)%10)][j].equals("R") || board[i][(j+1)%10].equals("R") || board[i][Math.abs((j*10-1)%10)].equals("R"))) {
						return false;
					}
				}
				if (board[i][j].equals("C")) {
					clocations[i][j] = 1;
					ccount++;
					if (!(board[(i+1)%10][j].equals("C") || board[Math.abs((i*10-1)%10)][j].equals("C") || board[i][(j+1)%10].equals("C") || board[i][Math.abs((j*10-1)%10)].equals("C"))) {
						return false;
					}
				}
				if (board[i][j].equals("B")) {
					blocations[i][j] = 1;
					bcount++;
					if (!(board[(i+1)%10][j].equals("B") || board[Math.abs((i*10-1)%10)][j].equals("B") || board[i][(j+1)%10].equals("B") || board[i][Math.abs((j*10-1)%10)].equals("B"))) {
						return false;
					}
				}
				if (board[i][j].equals("S")) {
					slocations[i][j] = 1;
					scount++;
					if (!(board[(i+1)%10][j].equals("S") || board[Math.abs((i*10-1)%10)][j].equals("S") || board[i][(j+1)%10].equals("S") || board[i][Math.abs((j*10-1)%10)].equals("S"))) {
						return false;
					}
				}
				if (board[i][j].equals("D")) {
					dlocations[i][j] = 1;
					dcount++;
					if (!(board[(i+1)%10][j].equals("D") || board[Math.abs((i*10-1)%10)][j].equals("D") || board[i][(j+1)%10].equals("D") || board[i][Math.abs((j*10-1)%10)].equals("D"))) {
						return false;
					}
				}
			}
		}
		if (rcount != 3 || scount != 3 || bcount != 4 || dcount != 2 || ccount != 5) {
			return false;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (rlocations[i][j] == 1) {
					
				}
			}
		}
		return true;
	}
	
	public static boolean balanced(String[][] board) {
		int bcheck = 0;int rcheck = 0;int scheck = 0;int dcheck = 0;int ccheck = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j].equals("B")) {
					bcheck = 1;
				}
				if (board[i][j].equals("R")) {
					rcheck = 1;
				}
				if (board[i][j].equals("S")) {
					scheck = 1;
				}
				if (board[i][j].equals("D")) {
					dcheck = 1;
				}
				if (board[i][j].equals("C")) {
					ccheck = 1;
				}
			}
			if (bcheck+rcheck+scheck+dcheck+ccheck > 2) {
				return false;
			}
			bcheck = 0;scheck =0;rcheck=0;dcheck=0;ccheck=0;
		}
		return false;
	}
}
