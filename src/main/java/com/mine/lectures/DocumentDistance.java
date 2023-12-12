package com.mine.lectures;

import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class DocumentDistance {

	public double distance(String doc, String anotherDoc) {
		final var docFrequency = frequencies(doc);
		final var anotherDocFrequency = frequencies(anotherDoc);
		return dotProduct(docFrequency, anotherDocFrequency);
	}

	private Map<String, Long> frequencies(String document) {
		return Arrays.stream(document.split("\\s+")).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
	}

	private double dotProduct(Map<String, Long> doc, Map<String, Long> anotherDoc) {
		double numerator = 0;
		double docDenominator = 0;
		Set<String> usedWords = new HashSet<>();
		for (String word : doc.keySet()) {
			numerator += doc.getOrDefault(word, 0L) * anotherDoc.getOrDefault(word, 0L);
			docDenominator += Math.pow(doc.get(word), 2);
			usedWords.add(word);
		}
		double anotherDocDenominator = 0;
		for (String word : anotherDoc.keySet()) {
			anotherDocDenominator += Math.pow(anotherDoc.get(word), 2);
			if (usedWords.contains(word)) continue;
			numerator += doc.getOrDefault(word, 0L) * anotherDoc.getOrDefault(word, 0L);
		}
		return BigDecimal.valueOf(numerator / (Math.sqrt(anotherDocDenominator) * Math.sqrt(docDenominator)))
				.setScale(6, RoundingMode.HALF_EVEN)
				.doubleValue();
	}
}
