package com.algo.dynamic;

import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingSubsequence {

	Map<Integer, String> LISuptoIndexMap = null;

	public LongestIncreasingSubsequence() {
		LISuptoIndexMap = new HashMap<Integer, String>();
	}

	public String getLIS(String s) {

		LISuptoIndexMap.put(0, String.valueOf(s.charAt(0))); //starting point
		StringBuilder newLIS = new StringBuilder();//new competitor LIS constructed during looping
		boolean isSequence = true; //flag to check if we are continuing a sequence
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			String prevLIS = LISuptoIndexMap.get(i - 1);
			if (isSequence && c > prevLIS.charAt(prevLIS.length() - 1)) {
				prevLIS = prevLIS + String.valueOf(c);
				isSequence = true;
			} else {
				isSequence = false;
				if (newLIS.length() > 0
						&& c > newLIS.charAt(newLIS.length() - 1)) {

					newLIS.append(c);
				} else {
					newLIS.delete(0, newLIS.length());
					newLIS.append(c);
				}

			}
			if (prevLIS.length() < newLIS.length()) {
				prevLIS = newLIS.toString();
				isSequence = true;
			}
			LISuptoIndexMap.put(i, prevLIS);
		}
		return LISuptoIndexMap.get(s.length() - 1);
	}

	public static void main(String[] args) {

		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		String s = "21345619456789";
		System.out.println(lis.getLIS(s));
	}

}
