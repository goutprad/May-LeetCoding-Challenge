package com.leetcode.challenge.may.week.one;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < J.length(); i++) {
			set.add(J.charAt(i));
		}
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (set.contains(S.charAt(i))) {
				count++;
			}

		}
		return count;
	}
	
	public int numJewelsInStones_1(String J, String S) {
		int count = 0;
		
		return count;
	}

	public static void main(String[] args) {
		JewelsAndStones leet = new JewelsAndStones();
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(leet.numJewelsInStones(J, S));
	}

}
