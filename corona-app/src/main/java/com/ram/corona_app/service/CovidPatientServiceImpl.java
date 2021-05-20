package com.ram.corona_app.service;

import com.ram.corona_app.bo.CoronaPatientBO;
import com.ram.corona_app.dao.ICoronaPatientDAO;
import com.ram.corona_app.dto.CoronaPatientDTO;
import com.ram.corona_app.vo.CoronaPatientOutVO;

public class CovidPatientServiceImpl implements ICovidPatientService 
{
    private ICoronaPatientDAO dao;
    
    public CovidPatientServiceImpl(ICoronaPatientDAO dao)
    {
		this.dao = dao;
	}
	@Override
	public CoronaPatientOutVO registerCovidPatient(CoronaPatientDTO dto) throws Exception {
		double netBill = 0;
		double discount = 0;
		double totalBillAmount = dto.getNoOfDaysHospitalized()*dto.getBillPerDay();
		if(totalBillAmount >= 100000.0 && totalBillAmount < 200000.0)
		{
			discount=totalBillAmount*0.1 ;
			netBill=totalBillAmount-discount;
		}
		else if(totalBillAmount >= 200000.0)
		{
			discount=totalBillAmount*0.2;
			netBill=totalBillAmount-discount;
		}
		else
		{
			netBill = totalBillAmount;
			discount = 0.00;
		}
		  CoronaPatientBO bo = new CoronaPatientBO();
		  bo.setPatientName(dto.getPatientName());
		  bo.setPatientAddr(dto.getPatientAddr());
		  bo.setMobileNo(dto.getMobileNo());
		  bo.setBillPerDay(dto.getBillPerDay());
		  bo.setNoOfDaysHospitalized(dto.getNoOfDaysHospitalized());
		  bo.setTotalBillAmount(totalBillAmount);
		  bo.setDiscount(discount);
		  bo.setNetBillAmount(netBill);
		  
		 boolean status = dao.insertPatient(bo);
		 CoronaPatientOutVO voOut = new CoronaPatientOutVO();
		 voOut.setPatientName(bo.getPatientName());
		 voOut.setPatientAddr(bo.getPatientAddr());
		 voOut.setMobileNo(bo.getMobileNo());
		 voOut.setBillPerDay(bo.getBillPerDay());
		 voOut.setNoOfDaysHospitalized(bo.getNoOfDaysHospitalized());
		 voOut.setTotalBillAmount(totalBillAmount);
		 voOut.setDiscount(discount);
		 voOut.setNetBillAmount(netBill);
		  
		 return status == true ? voOut : null;
	}

}
