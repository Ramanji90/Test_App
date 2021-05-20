package com.ram.corona_app.service;

import com.ram.corona_app.dto.CoronaPatientDTO;
import com.ram.corona_app.vo.CoronaPatientOutVO;

public interface ICovidPatientService 
{
    public CoronaPatientOutVO registerCovidPatient(CoronaPatientDTO dto) throws Exception;
}
