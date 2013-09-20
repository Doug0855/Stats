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
		int[] test = {1, 5, 9, 4, -1};

		median(test);
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("The max is " + max);

		return max;
	}

	public static int min(int[] a) {
		int min= a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] <min) {
				min = a[i];
			}
		}

		System.out.println("The min is " + min);

		return min;
	}

	public static int mean(int[] a) {
		int mean=0;
		int sum =0;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}

		mean = sum/a.length;
		System.out.println("The mean is " + mean);
		return mean;
	}

	public static double median(int[] a) {
		double median=0;
		Arrays.sort(a);

		if (a.length%2==0) {
			median = (a[a.length/2] + a[a.length/2 - 1])/2 +.5;
		} else {

			median = a[a.length/2];
		}

		System.out.println("The median is " + median);
		return median;
	}

	public static double quartile1(int[] a) {
		double quart=0;
		Arrays.sort(a);

		if (a.length%2==0) {
			quart = (a[a.length/4] + a[a.length/4 - 1])/2 + .5;
		} else {
			quart = a[a.length/4];
		}

		return quart;
	}
}

























