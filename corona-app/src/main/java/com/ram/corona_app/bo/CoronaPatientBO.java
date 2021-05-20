package com.ram.corona_app.bo;

public class CoronaPatientBO 
{
	   private String patientName;
	   private String patientAddr;
	   private long mobileNo;
	   private int noOfDaysHospitalized;
	   private double billPerDay;
	   private double  totalBillAmount;
	   private double discount;
	   private double netBillAmount;
	   
	   public CoronaPatientBO() {
		
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

	public double getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getNetBillAmount() {
		return netBillAmount;
	}

	public void setNetBillAmount(double netBillAmount) {
		this.netBillAmount = netBillAmount;
	}

	@Override
	public String toString() {
		return "CoronaPatientBO [patientName=" + patientName + ", patientAddr=" + patientAddr + ", mobileNo=" + mobileNo
				+ ", noOfDaysHospitalized=" + noOfDaysHospitalized + ", billPerDay=" + billPerDay + ", totalBillAmount="
				+ totalBillAmount + ", discount=" + discount + ", netBillAmount=" + netBillAmount + "]";
	}
	   
	   
}
