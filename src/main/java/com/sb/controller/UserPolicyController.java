package com.sb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.Policy;

import com.sb.policyserviceimpl.PolicyServiceimpl;





@RestController
public class UserPolicyController {
	
	
	@Autowired
	private PolicyServiceimpl policyServiceimpl;
	
	
	@PostMapping("/savepolicy")
	public Policy savepolicy(@RequestBody Policy policy)
	{
		return policyServiceimpl.savePolicy(policy);
	}
	
	
	
	
	
}

