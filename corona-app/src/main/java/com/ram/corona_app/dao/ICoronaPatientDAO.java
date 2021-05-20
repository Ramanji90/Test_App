package com.ram.corona_app.dao;

import com.ram.corona_app.bo.CoronaPatientBO;

public interface ICoronaPatientDAO 
{
	public boolean insertPatient(CoronaPatientBO bo) throws Exception;

}
