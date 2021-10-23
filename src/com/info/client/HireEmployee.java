package com.info.client;

import com.info.beans.CandidateDetails;
import com.info.beans.Coding;
import com.info.beans.CompanyDetails;
import com.info.builder.CandidateBuilder;
import com.info.observer.OnboardInvite;
import com.info.service.CandidateFactory;
import com.info.service.HiringProcess;

public class HireEmployee {
	
	
	public static void main(String[] args) {
		
		//Builder pattern to set the candidate details 
		Coding codingscore = new Coding(5, 8, 7, 16, 20);
		CandidateDetails candidate1 = new CandidateBuilder().setName("Rahul").setAge(25).
				setExpectedCTC(400000).setExperience(4).setJobPosition("Automation Tester").
				setSkillSet("Java ,selenium,UFT").setCodingScore(codingscore).getCandidate();
				
				//Factory pattern to create objects 
		CandidateFactory candidateFactory = new CandidateFactory();
		
	     HiringProcess process= candidateFactory.getInstance("hire");
	     CompanyDetails companyDetails=     process.applyJob(candidate1);
	     System.out.println("********Company Details ***********");
	     System.out.println(companyDetails);
	     Integer firstRoundScore = process.onlineAssesment(candidate1);
	    
	     Integer secondRoundScore = process.technicalDiscussion(candidate1);
	     Integer offeredSalary =  process.HRDiscussion(candidate1, firstRoundScore, secondRoundScore);
	     
	     if(offeredSalary>0) {
	    	 System.out.println("Offered salary "+ offeredSalary+" rupees per annum ");
	    	 process.hireEmployee(candidate1.getName());
	    	 
	    	 //Observer pattern to send the onboarding 
	    	 System.out.println("**********Observer pattern to send the onboarding invite ***************");
	    	 OnboardInvite  invite = new OnboardInvite();
	    	 invite.sendOnboardinvite(candidate1.getName());
	     }
	     else {
	    	 System.out.println("Sorry your candiature is not shortlisted ");
	     }
	     
	    
	     
		
	}

}
