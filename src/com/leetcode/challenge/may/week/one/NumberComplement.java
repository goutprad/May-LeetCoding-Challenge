package com.leetcode.challenge.may.week.one;

public class NumberComplement {
	public int findComplement(int num) {
		int res=0;
		int i=0;
		while (num != 0) {
			if ((num & 1) == 0) {
				res += 1 <<i;
			}
			i+=1;
			num>>=1;
		}
		return res;
	}

	public static void main(String[] args) {
		NumberComplement leet = new NumberComplement();
		System.out.println(leet.findComplement(5));
	}
}
