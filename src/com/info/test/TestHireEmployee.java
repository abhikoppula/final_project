package com.info.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.info.beans.CandidateDetails;
import com.info.beans.Coding;
import com.info.builder.CandidateBuilder;
import com.info.service.HiringService;

class TestHireEmployee {
	
	HiringService service = new HiringService();
	
	@Test
	void testFirstRound() {
		Coding codingScore = new Coding(5, 6, 8, 0, 0);
		CandidateDetails details = new CandidateBuilder().setCodingScore(codingScore).getCandidate();
		assertEquals(35, service.onlineAssesment(details));
	}
	
	@Test
	void secondRound() {
		Coding codingScore1 = new Coding(0, 0, 0, 20, 20);
		CandidateDetails details1 = new CandidateBuilder().setCodingScore(codingScore1).getCandidate();
		assertEquals(60, service.technicalDiscussion(details1));
	}

}
