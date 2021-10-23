package com.info.service;

public class CandidateFactory {
	
	
	public HiringProcess getInstance(String hire) {
		if(hire.equalsIgnoreCase("hire")) {
			return new HiringService();
		}
		return null;
	}

}
