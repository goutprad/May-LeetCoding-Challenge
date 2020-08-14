package com.leetcode.challenge.may.week.one;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
	/**
	 * Time - O(N)
	 * space -o(n)
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		Entry<Integer, Integer> majorityEntry = null;
		for (Entry<Integer, Integer> i : map.entrySet()) {
			if(majorityEntry == null || majorityEntry.getValue() < i.getValue()) {
				majorityEntry = i;
			}
		}
		return majorityEntry.getKey();
	}

	public static void main(String[] args) {
		MajorityElement leet = new MajorityElement();
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(leet.majorityElement(nums));
	}

}
