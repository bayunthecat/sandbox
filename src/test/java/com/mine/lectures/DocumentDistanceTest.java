package com.mine.lectures;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentDistanceTest {

	DocumentDistance distance = new DocumentDistance();

	@Test
	void test() {
		final var result = distance.distance("Eat shit", "Drink shit");
		assertThat(result).isEqualTo(0.5);
	}

	@Test
	void test_1mb() {
		final var text = load();
		final var result = distance.distance(text, text);
		assertThat(result).isEqualTo(1D);
	}

	private String load() {
		final var context = Thread.currentThread().getContextClassLoader();
		if (context == null) {
			throw new RuntimeException("Unable to load file");
		}
		final var inputStream = context.getResourceAsStream("1mb.txt");
		if (inputStream == null) {
			throw new RuntimeException("Unable to load file");
		}
		return new BufferedReader(
				new InputStreamReader(inputStream, StandardCharsets.UTF_8))
				.lines()
				.collect(Collectors.joining("\n"));
	}
}