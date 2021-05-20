package com.ram.junit.service;

public class JobImpl implements IJob {

	public String searchJob() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return "Got Job";
	}

}
