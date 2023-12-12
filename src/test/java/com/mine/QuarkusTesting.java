package com.mine;

import com.mine.lectures.Radix;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class QuarkusTesting {

    @Inject
    Radix radix;

    @Test
    void test() {
        assertThat(radix).isNotNull();
    }
}
