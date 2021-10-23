package com.info.beans;

public class CandidateDetails {
	
	private String name;
	
	private Integer age;
	
	private Integer experience;
	
	private String skillSet;
	
	private Coding codingScore;
	
	private Integer expectedCTC;
	
	private String jobPosition;
	
	
	

	public CandidateDetails(String name, Integer age, Integer experience, String skillSet, Coding codingScore,
			Integer expectedCTC, String jobPosition) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.skillSet = skillSet;
		this.codingScore = codingScore;
		this.expectedCTC = expectedCTC;
		this.jobPosition = jobPosition;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public Coding getCodingScore() {
		return codingScore;
	}

	public void setCodingScore(Coding codingScore) {
		this.codingScore = codingScore;
	}

	public Integer getExpectedCTC() {
		return expectedCTC;
	}

	public void setExpectedCTC(Integer expectedCTC) {
		this.expectedCTC = expectedCTC;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	
	

}
