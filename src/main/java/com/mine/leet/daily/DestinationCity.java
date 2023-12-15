package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class DestinationCity {

	public String destCity(List<List<String>> paths) {
		Map<String, String> destinations = new HashMap<>();
		for (List<String> cities : paths) {
			String outgoing = cities.get(0);
			String dest = cities.get(1);
			destinations.put(outgoing, dest);
		}
		for (String key : destinations.keySet()) {
			String dest = destinations.get(key);
			if (!destinations.containsKey(dest)) {
				return dest;
			}
		}
		return null;
	}
}
