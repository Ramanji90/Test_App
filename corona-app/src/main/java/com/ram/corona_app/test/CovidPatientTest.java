package com.ram.corona_app.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ram.corona_app.controller.CovidPatientController;
import com.ram.corona_app.vo.CoronaPatientInVO;
import com.ram.corona_app.vo.CoronaPatientOutVO;

public class CovidPatientTest {

	public static void main(String[] args) 
	{
		CoronaPatientInVO vo = new CoronaPatientInVO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Name");
		vo.setPatientName(sc.nextLine());
		System.out.println("Enter Patient Address");
		vo.setPatientAddr(sc.nextLine());
		System.out.println("Enter Patient MobileNo");
		vo.setMobileNo(sc.next());
		System.out.println("Enter Number of Days Hospitalized");
		vo.setNoOfDaysHospitalized(sc.next());
		System.out.println("Enter Bill Per Day");
		vo.setBillPerDay(sc.next());
		
		sc.close();
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ram/corona_app/bean/config/applicationContext.xml");
        
		CovidPatientController controller = factory.getBean("controller",CovidPatientController.class);
		
		try {
			CoronaPatientOutVO voOut = controller.registerCovidPatient(vo);
			System.out.println("Patient Name :: " +voOut.getPatientName());
			System.out.println("Patient address :: " +voOut.getPatientAddr());
			System.out.println("Patient mobile No :: " +voOut.getMobileNo());
			System.out.println("No of days hospitalized :: " +voOut.getNoOfDaysHospitalized());
			System.out.println("Bill per day :: " +voOut.getBillPerDay());
			System.out.println("Total bill amount :: " +voOut.getTotalBillAmount());
			System.out.println("discount :: " +voOut.getDiscount());
			System.out.println("Net Bill Amount :: " +voOut.getNetBillAmount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
