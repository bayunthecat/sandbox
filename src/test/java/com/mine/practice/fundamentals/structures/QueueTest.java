package com.mine.practice.fundamentals.structures;

import com.mine.practice.fundamentals.structures.implementations.QueueImplementation;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class QueueTest {

	Queue<String> subject = new QueueImplementation<>();

	@Test
	void test_1() {
		subject.enqueue("one");
		assertThat(subject.peek()).isEqualTo("one");
		assertThat(subject.deque()).isEqualTo("one");
		assertThat(subject.deque()).isEqualTo(null);
	}

	@Test
	void test_2() {
		subject.enqueue("one");
		subject.enqueue("two");
		assertThat(subject.deque()).isEqualTo("one");
		assertThat(subject.deque()).isEqualTo("two");
		assertThat(subject.deque()).isNull();
	}
}