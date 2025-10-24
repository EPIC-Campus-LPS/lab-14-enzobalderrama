import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Heatmap {
	private double[][] data;
	
	public Heatmap(int rows, int cols, String filename) throws IOException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			sc.nextLine();
			String roww = sc.nextLine();
			String[] rowarr = (roww.split(","));
			for (int i = 0; i < rowarr.length; i++) {
				double[] rowone[i] = (double)(Integer.parseInt(rowarr[i]));
			}
		}
	}
	
	public void printHeatmap() {
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.println(data[i][j]);
			}
		}
	}
	
	public double sumHeatmap() {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				total += (data[i][j]);
			}
		}
		return total;
	}
	
	public double avgHeatmap() {
		double total = 0;
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				total += (data[i][j]);
				count++;
			}
		}
		return total/count;
	}
	
	public double sumColumn(int col) {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i][col];
		}
		return total;
	}
	
	public double sumRow(int row) {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[row][i];
		}
		return total;
	}
	
	public int areCold() {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if (data[i][j] < 10) {
					count++;
				}
			}
		}
		return count;
	}
}