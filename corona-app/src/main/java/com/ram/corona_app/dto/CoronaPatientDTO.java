package com.ram.corona_app.dto;

import java.io.Serializable;

public class CoronaPatientDTO implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String patientName;
   private String patientAddr;
   private long mobileNo;
   private int noOfDaysHospitalized;
   private double billPerDay;
   
   public CoronaPatientDTO() {
	
}
   


public String getPatientName() {
	return patientName;
}



public void setPatientName(String patientName) {
	this.patientName = patientName;
}



public String getPatientAddr() {
	return patientAddr;
}



public void setPatientAddr(String patientAddr) {
	this.patientAddr = patientAddr;
}



public long getMobileNo() {
	return mobileNo;
}



public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}



public int getNoOfDaysHospitalized() {
	return noOfDaysHospitalized;
}



public void setNoOfDaysHospitalized(int noOfDaysHospitalized) {
	this.noOfDaysHospitalized = noOfDaysHospitalized;
}



public double getBillPerDay() {
	return billPerDay;
}



public void setBillPerDay(double billPerDay) {
	this.billPerDay = billPerDay;
}



@Override
public String toString() {
	return "CoronaPatient [patientName=" + patientName + ", patientAddr=" + patientAddr + ", mobileNo=" + mobileNo
			+ ", noOfDaysHospitalized=" + noOfDaysHospitalized + ", billPerDay=" + billPerDay + "]";
}
  

   
}
