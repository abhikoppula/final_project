package com.info.service;

import com.info.beans.CandidateDetails;
import com.info.beans.CompanyDetails;

public interface HiringProcess {
	
	CompanyDetails applyJob(CandidateDetails candidateDetails);
	
	Integer onlineAssesment(CandidateDetails candidateDetails);
	
	Integer technicalDiscussion(CandidateDetails candidateDetails);
	
	Integer HRDiscussion(CandidateDetails candidateDetails,Integer firstRoundScore,Integer secondRoundScore);
	
	void hireEmployee(String empName);
	
	

}
