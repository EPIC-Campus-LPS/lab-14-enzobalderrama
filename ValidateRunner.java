import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ValidateRunner {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Create a new file name.");
		String filename = scan.nextLine();
		File file = new File(filename);
		Scanner sc = new Scanner(file, "UTF-8");
		int counter = 0;
		String[][] row = new String[10][10];
		while (sc.hasNextLine()) {
			String coll = sc.nextLine();
			String[] columnarr = coll.split(",");
			for (int i = 0; i < columnarr.length; i++) {
				row[counter][i] = columnarr[i];
			}
			counter++;
		}
		if (row[9] != null && row[9][9] != null && Validate.boardValidator(row) == true) {
			System.out.println("This board is valid");
		}
		else {
			System.out.println("This board is invalid");
		}
		if (row[9] != null && row[9][9] != null && Validate.balanced(row) == true) {
			System.out.println("This board is balanced");
		}
		else {
			System.out.println("This board is unbalanced");
		}
	}
}
