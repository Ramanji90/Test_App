package com.ram.corona_app.controller;

import com.ram.corona_app.dto.CoronaPatientDTO;
import com.ram.corona_app.service.ICovidPatientService;
import com.ram.corona_app.vo.CoronaPatientInVO;
import com.ram.corona_app.vo.CoronaPatientOutVO;

public class CovidPatientController 
{
	private ICovidPatientService service;
	
	public CovidPatientController(ICovidPatientService service) {
		
		this.service = service;
	}
	
	public CoronaPatientOutVO registerCovidPatient(CoronaPatientInVO vo)throws Exception
	{
		CoronaPatientDTO  dto = new CoronaPatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddr(vo.getPatientAddr());
		dto.setMobileNo(Long.parseLong(vo.getMobileNo()));
		dto.setNoOfDaysHospitalized(Integer.parseInt(vo.getNoOfDaysHospitalized()));
		dto.setBillPerDay(Double.parseDouble(vo.getBillPerDay()));
		
		CoronaPatientOutVO voOut = service.registerCovidPatient(dto);
		return voOut;
	}

}
