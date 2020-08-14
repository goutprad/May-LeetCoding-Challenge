package com.leetcode.challenge.may.week.one;

import java.util.HashMap;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			char ch = magazine.charAt(i);
			if (magazineMap.containsKey(ch)) {
				magazineMap.put(ch, magazineMap.get(ch) + 1);
			} else {
				magazineMap.put(ch, 0);
			}
		}
		// System.out.println(magazineMap);
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			if (magazineMap.containsKey(ch)) {

				if (magazineMap.get(ch) == 0) {
					magazineMap.remove(ch);
				} else {
					magazineMap.put(ch, magazineMap.get(ch) - 1);
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		RansomNote leet = new RansomNote();
		String ransomNote = "aa";
		String magazine = "aab";
		System.out.println(leet.canConstruct(ransomNote, magazine));
	}

}
