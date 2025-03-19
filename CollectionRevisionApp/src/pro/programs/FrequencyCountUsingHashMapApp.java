package pro.programs;

import java.util.*;
import java.util.Map.Entry;

public class FrequencyCountUsingHashMapApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the value in Array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();// 10 20 30 10 20 40
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i]) + 1);
			}
			else {
			  hm.put(a[i], 1);
			}
		}
		System.out.println("Frequency of elements: ");
		Set<Entry<Integer, Integer>> s=hm.entrySet();
		for(Map.Entry<Integer, Integer> m:s) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
