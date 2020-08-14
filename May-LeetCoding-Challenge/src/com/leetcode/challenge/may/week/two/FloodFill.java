package com.leetcode.challenge.may.week.two;

import java.util.Arrays;

public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if(newColor == color) {
			return image;
		}
		dfs(image, sr, sc, color, newColor);
		return image;
	}

	public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
		if(sr<0 || sc<0 || sr>=image.length || sc>= image[0].length) {
			return;
		} else if(image[sr][sc] != color){
			return;
		}
		image[sr][sc] = newColor;
		dfs(image, sr+1, sc, color, newColor);
		dfs(image, sr-1, sc, color, newColor);
		dfs(image, sr, sc+1, color, newColor);
		dfs(image, sr, sc-1, color, newColor);
	}

	public static void main(String[] args) {
		FloodFill leet = new FloodFill();
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int[][] filledImage = leet.floodFill(image, 1, 1, 2);
		System.out.println(Arrays.deepToString(filledImage));
	}

}
