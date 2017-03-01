import java.util.Arrays;

public class RandomData {
	public static int[] generate1d(int nbVals, int min, int max) {
		int[] res = new int[nbVals];
		for (int i = 0; i != nbVals; i++) {
			res[i] = (int) ((Math.random() * (max - min))) + min;
		}
		return res;
	}
	
	public static long executionTime(int[] array) {
		long startTime = System.currentTimeMillis();
		minimum(array);
		long duration = System.currentTimeMillis() - startTime;
		System.out.print("The execution time is: ");
		System.out.println(duration);
		return duration;
	}
	
	public static int minimum(int[] array) {
		int res = array[0];
		for (int i = 0; i != array.length; i++) {
			if (array[i] < res) {
				res = array[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10000000;
		for (int i = 1; i <=10; i++) {
		int[] array = generate1d(length * i,0,500);
		
		int[] x = new int[10];
		x[i-1] = length;
		
		long duration = executionTime(array);
		long[] y = new long[10];
		y[i-1] = duration;
		}
	}
}


