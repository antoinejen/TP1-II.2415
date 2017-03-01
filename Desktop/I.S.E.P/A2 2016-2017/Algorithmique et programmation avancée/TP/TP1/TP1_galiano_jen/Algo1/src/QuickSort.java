
public class QuickSort {
	
	public static int partition(int[] data, int begin, int end, int pivotIdx){
		swap(data, pivotIdx, --end);
		pivotIdx= end;
		int pivot= data[pivotIdx];
			//invariant is that everything before begin is known to be < pivot
			// and everything after end is known to be >= pivot
			while(begin != end){
				if(data[begin] >= pivot){
					swap(data, begin, --end);
				}
				else {
					++begin;
					}
			}
		swap(data, pivotIdx, begin);
		return begin;
		}
	
	public static void swap(int[] data, int i, int j){
		int tmp= data[i];
		data[i]= data[j];
		data[j]= tmp;
		}
	
	public static void sort(int[] data){
		sort(data, 0, data.length);
	}
		
	public static void sort(int[] data, int begin, int end){
		if((end-begin) < 2){ return; }
		int m= partition(data, begin, end, (end+begin)/2);
		sort(data, begin, m);
		sort(data, m+1, end); // +1 for convergence 
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
