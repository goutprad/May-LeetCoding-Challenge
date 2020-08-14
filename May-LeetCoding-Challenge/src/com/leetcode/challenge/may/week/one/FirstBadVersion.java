package com.leetcode.challenge.may.week.one;

public class FirstBadVersion {
	/*
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version);
	 * 
	 * for test I have implemented for a static number
	 */
	public boolean isBadVersion(int version) {
		if (version <= 3) //test
			return false;
		return true;
	}

	public int firstBadVersion(int n) {
		int i = 1;
		int j = n;
		int result = n;
		while (i < j) {
			int mid = i + (j - i) / 2; // (i+j)/2
			if (isBadVersion(mid)) {
				j = mid;
				result = mid;
			} else {
				i = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FirstBadVersion leet = new FirstBadVersion();
		System.out.println(leet.firstBadVersion(6)); // 4
	}
}
