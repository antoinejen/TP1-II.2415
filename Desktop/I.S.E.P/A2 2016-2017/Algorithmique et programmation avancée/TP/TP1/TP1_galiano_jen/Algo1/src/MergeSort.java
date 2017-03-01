public class MergeSort {
	public static void mergeSorted(int data[], int begin, int middle, int end){
		int[] tmp= new int[middle-begin];
		System.arraycopy(data, begin, tmp, 0, tmp.length);
		int i=0, j=middle, dest=begin;
		while((i< tmp.length) && (j<end)){
			data[dest++]= (tmp[i] < data[j]) ? tmp[i++] : data[j++] ;
		}
	while(i < tmp.length){
		data[dest++]= tmp[i++];
		}
	}
	
	public static void sort(int[] data){
		sort(data, 0, data.length);
	}
		public static void sort(int[] data, int begin, int end){
		if((end-begin) < 2){return;}
			int middle= (end+begin)/2;
			sort(data, begin, middle);
			sort(data, middle, end);
			mergeSorted(data, begin, middle, end);
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