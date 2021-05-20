package com.ram.corona_app.vo;

public class CoronaPatientInVO 
{
   private String patientName;
   private String patientAddr;
   private String mobileNo;
   private String noOfDaysHospitalized;
   private String billPerDay;
   
   public CoronaPatientInVO() {
	
}
   
public String getPatientName() 
{
	return patientName;
}

public void setPatientName(String patientName)
{
	this.patientName = patientName;
}

public String getPatientAddr()
{
	return patientAddr;
}

public void setPatientAddr(String patientAddr) 
{
	this.patientAddr = patientAddr;
}

public String getMobileNo() 
{
	return mobileNo;
}

public void setMobileNo(String mobileNo)
{
	this.mobileNo = mobileNo;
}

public String getNoOfDaysHospitalized() 
{
	return noOfDaysHospitalized;
}

public void setNoOfDaysHospitalized(String noOfDaysHospitalized) 
{
	this.noOfDaysHospitalized = noOfDaysHospitalized;
}

public String getBillPerDay() 
{
	return billPerDay;
}

public void setBillPerDay(String billPerDay) 
{
	this.billPerDay = billPerDay;
}

@Override
public String toString() {
	return "CoronaPatient [patientName=" + patientName + ", patientAddr=" + patientAddr + ", mobileNo=" + mobileNo
			+ ", noOfDaysHospitalized=" + noOfDaysHospitalized + ", billPerDay=" + billPerDay + "]";
}
  

   
}
