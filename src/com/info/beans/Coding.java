package com.info.beans;

public class Coding {
	
	private Integer totalTestCasesPassed;
	
	private Integer codingStandard;
	
	private Integer completionScore;
	
	private Integer oralTechScore;
	
	private Integer HandsOnScore;

	
	
	public Coding(Integer totalTestCasesPassed, Integer codingStandard, Integer completionScore, Integer oralTechScore,
			Integer handsOnScore) {
		super();
		this.totalTestCasesPassed = totalTestCasesPassed;
		this.codingStandard = codingStandard;
		this.completionScore = completionScore;
		this.oralTechScore = oralTechScore;
		HandsOnScore = handsOnScore;
	}

	public Integer getTotalTestCasesPassed() {
		return totalTestCasesPassed;
	}

	public void setTotalTestCasesPassed(Integer totalTestCasesPassed) {
		this.totalTestCasesPassed = totalTestCasesPassed;
	}

	public Integer getCodingStandard() {
		return codingStandard;
	}

	public void setCodingStandard(Integer codingStandard) {
		this.codingStandard = codingStandard;
	}

	public Integer getCompletionScore() {
		return completionScore;
	}

	public void setCompletionScore(Integer completionScore) {
		this.completionScore = completionScore;
	}

	public Integer getOralTechScore() {
		return oralTechScore;
	}

	public void setOralTechScore(Integer oralTechScore) {
		this.oralTechScore = oralTechScore;
	}

	public Integer getHandsOnScore() {
		return HandsOnScore;
	}

	public void setHandsOnScore(Integer handsOnScore) {
		HandsOnScore = handsOnScore;
	}
	
	
	

}
