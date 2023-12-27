package com.mine.exam;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

import java.util.Collections;
import java.util.stream.Collectors;

@QuarkusMain
public class SelfCheck implements QuarkusApplication {

	@Inject
	Instance<Problem> problems;

	@Override
	public int run(String... args) throws Exception {
		final var problemInstances = problems.stream().collect(Collectors.toList());
		Collections.shuffle(problemInstances);
		problemInstances.stream().findFirst()
				.ifPresent(problem -> System.out.println(problem.getClass().getSimpleName()));
		return 0;
	}
}