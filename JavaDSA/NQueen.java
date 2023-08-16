import java.util.ArrayList;
import java.util.List;

public class NQueen {

	public static void main(String[] args) {

	}

	List<List<String>> ans;

	public List<List<String>> solveNQueens(int n) {
		ans = new ArrayList<>();
		StringBuilder s = new StringBuilder("");
		List<String> board = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s.append('.');
		}
		for (int i = 0; i < n; i++) {
			board.add(s.toString());
		}
		help(0, n, board);
		return ans;// help(n, new ArrayList<>());
	}

	public void help(int row, int n, List<String> board) {
		if (row == n) {
			ans.add(new ArrayList<>(board));
			return;
		}

		for (int j = 0; j < n; j++) {
			if (isSafe(row, j, board)) {
				String newRowStr = replaceCharAtString(board.get(row), j, 'Q');
				board.set(row, newRowStr);
				help(row + 1, n, board);
				board.set(row, replaceCharAtString(board.get(row), j, '.'));
			}
		}

	}

	public boolean isSafe(int i, int j, List<String> board) {
		int x = i, y = j;

		// Left diagonal
		while (x >= 0 && y >= 0) {
			if (board.get(x).charAt(y) == 'Q')
				return false;
			x--;
			y--;
		}

		// upward
		x = i;
		y = j;
		while (x >= 0) {
			if (board.get(x).charAt(y) == 'Q')
				return false;
			x--;
		}

		// Right Diagonal
		x = i;
		y = j;
		while (x >= 0 && y <= board.size() - 1) {
			if (board.get(x).charAt(y) == 'Q')
				return false;
			x--;
			y++;
		}

		return true;
	}

	public String replaceCharAtString(String s, int pos, char ch) {
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(pos, ch);
		return sb.toString();
	}
}
