package com.sb.project6.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.project6.repository.Repository;
import com.sb.project6.service.Services;

@Service
public class Serviceimpl implements Services{
	
	@Autowired
	private Repository repository;
	
	public String getmsg()
	{
		return "all set";
	}

}
