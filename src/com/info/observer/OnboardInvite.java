package com.info.observer;

public class OnboardInvite {

	SelectedCandidate candidate = new SelectedCandidate();

	public void sendOnboardinvite(String empName) {
		// TODO Auto-generated constructor stub
		candidate.notifyOnboardprocess(empName);
	}

}
