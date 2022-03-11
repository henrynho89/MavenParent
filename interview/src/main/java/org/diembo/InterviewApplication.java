package org.diembo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
		final int i=1;
		Stream<Integer> stream = Stream.<Integer>builder().add(1).add(2).build();
		stream.forEach(
			System.out::println
		);

	}

}
