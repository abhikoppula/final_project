package com.info.service;

import java.util.ArrayList;
import java.util.List;

import com.info.beans.CandidateDetails;
import com.info.beans.CompanyDetails;

public class HiringService implements HiringProcess{

	@Override
	public CompanyDetails applyJob(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyName("Deloitte");
		companyDetails.setLocation("Bangalore");
		System.out.println("Congratulations"+candidateDetails.getName()+", Job applied successfully for the position "+candidateDetails.getJobPosition()+" in "+companyDetails.getCompanyName());
	    return companyDetails;
	}

	@Override
	public Integer onlineAssesment(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		Integer firstRoundScore =0;
		if(candidateDetails.getCodingScore().getTotalTestCasesPassed()>=5 && 
				candidateDetails.getCodingScore().getCodingStandard()>=6 && 
				candidateDetails.getCodingScore().getCompletionScore()>4) {
			firstRoundScore= 35;
			System.out.println("Congratulations, First round cleared with the score "+firstRoundScore);
		}
		else {
			System.out.println("First round not cleared");
		}
		return firstRoundScore;
	}

	@Override
	public Integer technicalDiscussion(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		Integer secondRoundScore =0;
		if(candidateDetails.getCodingScore().getOralTechScore()>15 && 
				candidateDetails.getCodingScore().getHandsOnScore()>10 ) {
			secondRoundScore =60;
			System.out.println("Congratulations, Second round cleared with the score "+secondRoundScore);

				}
		else {
			System.out.println("second round not cleared");
		}
		return secondRoundScore;
	}

	@Override
	public Integer HRDiscussion(CandidateDetails candidateDetails,Integer firstRoundScore, Integer secondRoundScore) {
		// TODO Auto-generated method stub
		Integer avg = (firstRoundScore+secondRoundScore)/2;
		Integer maxBudget = 500000;
		if(avg>40) {
			if(maxBudget>=candidateDetails.getExpectedCTC()) {
				return candidateDetails.getExpectedCTC();
			}
			else {
				System.out.println("Out of Budget ");
				return 0;
			}
		}
		return 0;
	}

	@Override
	public void hireEmployee(String empName) {
		// TODO Auto-generated method stub
		System.out.println("Congratulations "+empName+" ,you are hired !!! ");
	}
	
	

}
