//max 
//min
//mean
//median
//quartile 1
//quartile 3
//mode
//standard deviation
import java.util.Arrays;


public class Stats {
	public static void main(String[] args) {
		int[] test = {1, 3, 1, 4, 1, -2, -3};

		System.out.println("Max: " + max(test));
		System.out.println("Min: " + min(test));
		System.out.println("Mean: " + mean(test));
		System.out.println("Median: " + median(test));
		System.out.println("First Quatile: " + quartile1(test));
		System.out.println("Third Quartile : " + quartile3(test));
		System.out.println("Mode: " + mode(test));
		System.out.println("Standard Deviation: " + standardDeviation(test));
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int min(int[] a) {
		int min= a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] <min) {
				min = a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a) {
		double mean=0;
		double sum =0;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}

		mean = sum/a.length;
		return mean;
	}

	public static double doublemean(double[] a) {
		double mean=0;
		double sum =0;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}

		mean = sum/a.length;
		return mean;
	}


	public static double median(int[] a) {
		double median=0;
		Arrays.sort(a);

		if (a.length%2==0) {
			median = (a[a.length/2] + a[a.length/2 - 1]);
			median = median/2;
		} else {

			median = a[a.length/2];
		}
		return median;
	}

	public static double quartile1(int[] a) {
		double quart=0;
		Arrays.sort(a);

		if (a.length%3==0) {
			quart=a[a.length/3-1];
		} else {
			quart = (a[a.length/4] + a[a.length/4 + 1]);
			quart = quart/2;
		}
		return quart;
	}

	public static double quartile3(int[] a) {
		double quart=0;
		Arrays.sort(a);

		if (a.length%3==0) {
			quart=a[a.length*2/3];
		} else {
			quart = (a[a.length*2/3] + a[a.length*2/3 + 1]);
			quart = quart/2;
		}
		return quart;
	}

	
	
	public static int mode(int a[]) { //fix
	    int maxValue=0, maxCount=0;

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[j] == a[i]) {
	            	count++;
	            }
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }
	    
	    return maxValue;
	}

	public static double standardDeviation(int[] a) {
		double med = mean(a);
		double[] difsq = new double[a.length];
		double standev = 0;

		for (int i=0; i<a.length; i++) {
			difsq[i] = (a[i] - med)*(a[i] - med);
		}

		standev = Math.sqrt(doublemean(difsq));
		return standev;                                           
	}
	
	
}
