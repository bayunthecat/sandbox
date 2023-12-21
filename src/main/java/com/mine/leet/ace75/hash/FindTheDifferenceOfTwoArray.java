package com.mine.leet.ace75.hash;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class FindTheDifferenceOfTwoArray {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> num1Set = set(nums1);
		Set<Integer> num2Set = set(nums2);
		Set<Integer> result1 = new HashSet<>(num1Set);
		Set<Integer> result2 = new HashSet<>(num2Set);
		result1.removeAll(num2Set);
		result2.removeAll(num1Set);
		return List.of(result1.stream().toList(), result2.stream().toList());
	}

	private Set<Integer> set(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int j : arr) {
			set.add(j);
		}
		return set;
	}
}