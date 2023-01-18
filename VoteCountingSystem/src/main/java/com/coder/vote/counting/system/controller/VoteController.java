package com.coder.vote.counting.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coder.vote.counting.system.service.VoteService;

@RestController
public class VoteController {

	@Autowired
	VoteService voteService;

	@PostMapping(value = "/entercandidate")
	public String enterCandidate(@RequestParam String name) {
		return voteService.AddCandidate(name);

	}

	@PostMapping(value = "/castvote")
	public String castVote(@RequestParam String name) {

		return voteService.castVote(name);
	}

	@PostMapping(value = "/countvote")
	public String countVote(@RequestParam String name) {
		return voteService.countVote(name);
	}

	@GetMapping(value = "/listvote")
	public List<String> listVote() {

		return voteService.listVote();
	}

	@GetMapping(value = "/getwinner")
	public String getWinner() {

		return voteService.getWinner();
	}

}
