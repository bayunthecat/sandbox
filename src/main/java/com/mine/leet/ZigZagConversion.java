package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ZigZagConversion {

	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		StringBuilder result = new StringBuilder();
		int z = numRows - 2;
		for (int level = 0; level < numRows; level++) {
			for (int i = level; i < s.length(); i = i + numRows + z) {
				result.append(s.charAt(i));
				int zig = i + numRows + z - level * 2;
				if (level != 0 && level != numRows - 1 && zig < s.length()) {
 					result.append(s.charAt(zig));
				}
			}
		}
		return result.toString();
	}

}
