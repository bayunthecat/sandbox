package com.mine;

import com.mine.exam.SelfCheck;
import io.quarkus.runtime.Quarkus;

public class Main {

	public static void main(String[] args) {
		Quarkus.run(SelfCheck.class);
	}
}
