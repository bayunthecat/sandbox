package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class FoodRatingsTest {

	//["korean"],["japanese"],["sushi",16],["japanese"],["ramen",16],["japanese"]
	@Test
	public void test() {
		String[] foods = new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
		String[] cuisine = new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"};
		int[] ratings = new int[]{9, 12, 8, 15, 14, 7};
		FoodRatings foodRatings = new FoodRatings(foods, cuisine, ratings);
		List<String> output = new ArrayList<>();
		output.add(foodRatings.highestRated("korean"));
		output.add(foodRatings.highestRated("japanese"));
		foodRatings.changeRating("sushi", 16);
		output.add(foodRatings.highestRated("japanese"));
		foodRatings.changeRating("ramen", 16);
		output.add(foodRatings.highestRated("japanese"));
		assertThat(output).containsExactly("kimchi", "ramen", "sushi", "ramen");
	}

}