package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class KidWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWthCandies(int[] candies, int extraCandies) {
		int max = 0;
		List<Boolean> result = new ArrayList<>(candies.length);
		for (int candy : candies) {
			max = Math.max(max, candy);
		}
		for (int candy : candies) {
			result.add(candy + extraCandies >= max);
		}
		return result;
	}

}
