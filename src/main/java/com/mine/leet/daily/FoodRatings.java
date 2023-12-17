package com.mine.leet.daily;

import java.util.*;

public class FoodRatings {

	private final Map<String, Food> foods = new HashMap<>();

	private final Map<String, TreeSet<Food>> sortedRatingsByCuisine = new HashMap<>();

	private final Comparator<Food> comparator = (food, anotherFood) -> {
		if (food.rating == anotherFood.rating) {
			return food.name.compareTo(anotherFood.name);
		}
		return anotherFood.rating - food.rating;
	};

	public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
		for (int i = 0; i < foods.length; i++) {
			final var food = new Food(foods[i], cuisines[i], ratings[i]);
			this.foods.put(food.name, food);
			this.sortedRatingsByCuisine.compute(cuisines[i], (key, tree) -> {
				if (tree == null) {
					tree = new TreeSet<>(comparator);
				}
				tree.add(food);
				return tree;
			});
		}
	}

	public void changeRating(String food, int newRating) {
		final var foodEntry = foods.get(food);
		if (foodEntry != null) {
			final var sorted = sortedRatingsByCuisine.get(foodEntry.cuisine);
			sorted.remove(foodEntry);
			foodEntry.rating = newRating;
			sorted.add(foodEntry);
		}
	}

	public String highestRated(String cuisine) {
		final var food = sortedRatingsByCuisine.getOrDefault(cuisine, new TreeSet<>(comparator)).stream().findAny().orElse(null);
		return food != null ? food.name : null;
	}

	private static class Food {

		private final String cuisine;

		private final String name;

		private int rating;

		public Food(String name, String cuisine, int rating) {
			this.name = name;
			this.rating = rating;
			this.cuisine = cuisine;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Food food = (Food) o;
			return Objects.equals(cuisine, food.cuisine) && Objects.equals(name, food.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(cuisine, name);
		}
	}
}