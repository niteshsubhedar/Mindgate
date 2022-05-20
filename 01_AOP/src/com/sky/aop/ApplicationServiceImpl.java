package com.sky.aop;

import org.springframework.stereotype.Service;

import com.sky.aop.service.Auditable;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Override
	public void processApplication() {
		// TODO Auto-generated method stub
		System.out.println("procees Application Form");
	}
	@Auditable(value="check")
	public String processApplicationWithAudit() {
		System.out.println("Proccess ApllicationFrom in service ");
		return "Success";
	}
	@Override
	public void doAccessCheck4() {
		// TODO Auto-generated method stub
		
	}

}
