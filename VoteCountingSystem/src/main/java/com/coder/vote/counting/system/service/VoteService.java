package com.coder.vote.counting.system.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service
public class VoteService {

	Map<String, Integer> localStorage = new HashMap<>();

	public String AddCandidate(String name) {

		localStorage.put(name, 0);

		return "Candidate entered successfully";
	}

	public String castVote(String name) {

		if (localStorage.containsKey(name)) {
			localStorage.put(name, localStorage.get(name) + 1);
			return "Your Vote has been Cast for Candidate: " + name;// +"the no of votes"+temp.get(name);
		}
		return "Not a valid Candidate";

	}

	public String countVote(String name) {

		return "The current Vote count for " + name + "is :   " + localStorage.get(name);

	}

	public List<String> listVote() {

		List<String> list = new ArrayList<>();
		for (Entry<String, Integer> entry : localStorage.entrySet()) {
			list.add(entry.getKey() + ":" + entry.getValue());
		}

		return list;
	}

	public String getWinner() {
		Integer largest = Integer.MIN_VALUE;
		String key = "";
		for (Map.Entry<String, Integer> entry : localStorage.entrySet()) {
			if (entry.getValue() > largest) {
				largest = entry.getValue();
				key = entry.getKey();
			}
		}

		return "The Winner of this Election is : " + key;
	}
}
