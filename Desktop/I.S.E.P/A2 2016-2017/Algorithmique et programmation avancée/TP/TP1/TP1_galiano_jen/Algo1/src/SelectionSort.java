
public class SelectionSort {
	
	public static void swap(int[] data, int i, int j){
		int tmp= data[i];
		data[i]= data[j];
		data[j]= tmp;
		}
	
	public static int minimumIndex(int[] data, int begin, int end){
		int res= begin;
		for(int i=begin+1; i != end; ++i){
			if(data[i] < data[res]){
				res= i;
			}
		}
		return res;
		
	}
	public static void sort(int[] data){
		if(data.length < 2){return;}
		for(int i=0; i != data.length-1; ++i){
			swap(data, i, minimumIndex(data, i, data.length));
			}
	}
	
	public static long executionTime(int[] array) {
		long startTime = System.currentTimeMillis();
		sort(array);
		long duration = System.currentTimeMillis() - startTime;
		System.out.print("The execution time is: ");
		System.out.println(duration);
		return duration;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10000;
		for (int i = 1; i <=10; i++) {
		int[] array = RandomData.generate1d(length * i,0,500);
		
		int[] x = new int[10];
		x[i-1] = length;
		
		long duration = executionTime(array);
		long[] y = new long[10];
		y[i-1] = duration;
		}
	}

}
