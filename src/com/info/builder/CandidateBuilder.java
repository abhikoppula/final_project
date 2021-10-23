package com.info.builder;

import com.info.beans.CandidateDetails;
import com.info.beans.Coding;

public class CandidateBuilder {
	
	private String name;
	
	private Integer age;
	
	private Integer experience;
	
	private String skillSet;
	
	private Coding codingScore;
	
	private Integer expectedCTC;
	
	private String jobPosition;

	public CandidateBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public CandidateBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}

	public CandidateBuilder setExperience(Integer experience) {
		this.experience = experience;
		return this;
	}

	public CandidateBuilder setSkillSet(String skillSet) {
		this.skillSet = skillSet;
		return this;
	}

	public CandidateBuilder setCodingScore(Coding codingScore) {
		this.codingScore = codingScore;
		return this;
	}

	public CandidateBuilder setExpectedCTC(Integer expectedCTC) {
		this.expectedCTC = expectedCTC;
		return this;
	}

	public CandidateBuilder setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
		return this;
	}
	
	public CandidateDetails getCandidate() {
		return new CandidateDetails(name, age, experience, skillSet, codingScore, expectedCTC, jobPosition);
	}
	

}
