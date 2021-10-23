package com.info.observer;

public class SelectedCandidate implements Observer{

	@Override
	public void notifyOnboardprocess(String candidateName) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome "+candidateName+", please complete your onboard process ");
	}

}
