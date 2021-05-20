package com.ram.corona_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ram.corona_app.bo.CoronaPatientBO;

public class CoronaPatientDAOImpl implements ICoronaPatientDAO {

	private static final String CORONA_PATIENT_INSERT_QUERY = "INSERT INTO COVIDPATIENT (PATIENTNAME,PATIENTADDR,MOBILENO,NOOFDAYSHOSPITALIZED,BILLPERDAY,TOTALBILLAMOUNT,DISCOUNT,NETBILLAMOUNT) VALUES(?,?,?,?,?,?,?,?)";
	
	private DataSource ds;
	
	 public CoronaPatientDAOImpl(DataSource ds) 
	 {
		this.ds = ds;
	 }
	@Override
	public boolean insertPatient(CoronaPatientBO bo) throws Exception
	{
		int count = 0;
		try(Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(CORONA_PATIENT_INSERT_QUERY);)
		{
			ps.setString(1, bo.getPatientName());
			ps.setString(2, bo.getPatientAddr());
			ps.setLong(3, bo.getMobileNo());
			ps.setInt(4, bo.getNoOfDaysHospitalized());
			ps.setDouble(5, bo.getBillPerDay());
			ps.setDouble(6, bo.getTotalBillAmount());
			ps.setDouble(7, bo.getDiscount());
			ps.setDouble(8, bo.getNetBillAmount());
			
			count = ps.executeUpdate();
		}
		
		catch(SQLException se)
		{
			throw  se;
		}
		catch(Exception e)
		{
			throw  e;
		}
		return count == 1 ? true : false;
	}

}
