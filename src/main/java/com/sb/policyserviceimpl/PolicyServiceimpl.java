package com.sb.policyserviceimpl;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sb.model.Policy;
import com.sb.policyrepository.PolicyRepository;
import com.sb.policyservice.PolicyService;


@Service
public class PolicyServiceimpl implements PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		
		return policyRepository.save(policy);
	}

	

	
	
	
}
