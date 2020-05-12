package com.leetcode.challenge.may.week.two;

public class SingleElementInASortedArray {
	public int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int mid;
		if (high == 0)
			return nums[high];
		else if (nums[high] != nums[high - 1])
			return nums[high];
		else if (nums[low] != nums[low + 1])
			return nums[low];

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
				return nums[mid];
			if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid - 1] == nums[mid]))
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	
	public int singleNonDuplicate_Xor(int[] nums) {
		int res =nums[0];
		for (int i = 1; i < nums.length; i++) {
			res = res ^ nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		SingleElementInASortedArray leet = new SingleElementInASortedArray();
		// int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int nums[] = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println(leet.singleNonDuplicate(nums));
		System.out.println(leet.singleNonDuplicate_Xor(nums));
	}

}
