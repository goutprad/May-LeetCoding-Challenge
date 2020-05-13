package com.leetcode.challenge.may.week.two;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		long high =  100000;
		long low = 1;
		long mid;
		long sq;
		while (low <= high) {
			mid = low + (high - low) / 2;
			sq = mid * mid;
			if (sq == num)
				return true;
			else if (sq > num)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return false;
	}

	/**
	 * Not Accepted
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPerfectSquare_2(int num) {
		int n = 1;
		for (int i = 1; i * i <= num; ++i) {
			n = i;
		}
		return n * n == num;
	}

	public static void main(String[] args) {
		ValidPerfectSquare leet = new ValidPerfectSquare();
		System.out.println(leet.isPerfectSquare(25));
	}

}
