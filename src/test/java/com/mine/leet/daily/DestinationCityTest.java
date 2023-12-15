package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class DestinationCityTest {

	@Inject
	DestinationCity subject;

	@Test
	void test() {
		final var result = subject.destCity(List.of(
				List.of("London", "New York"),
				List.of("New York", "Lima"),
				List.of("Lima", "Sao Paolo")));
		assertThat(result).isEqualTo("Sao Paolo");
	}

	@Test
	void test_1() {
		final var result = subject.destCity(List.of(
				List.of("jMgaf WaWA","iinynVdmBz"),
				List.of(" QCrEFBcAw", "wRPRHznLWS"),
				List.of("iinynVdmBz","OoLjlLFzjz"),
				List.of("OoLjlLFzjz"," QCrEFBcAw"),
				List.of("IhxjNbDeXk","jMgaf WaWA"),
				List.of("jmuAYy vgz","IhxjNbDeXk")
		));
		assertThat(result).isEqualTo("wRPRHznLWS");
	}

}