package com.harward.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harward.entity.PolicyDetails;
import com.harward.exceptions.EmailNotFoundException;
import com.harward.exceptions.PhoneNumberNotFoundException;
import com.harward.exceptions.PolicyNotFoundException;

@RestController
public class PolicyController {

	@RequestMapping("/policyNumber")
	public PolicyDetails findPolicyByPolicyNumber(@RequestParam(value = "policyNumber") String policyNumber) {

		Map<String, PolicyDetails> policyDetailsMap = new HashMap<String, PolicyDetails>();
		PolicyDetails policyDetails = new PolicyDetails();
		policyDetails.setEmail("divya.akula@gmail.com");
		policyDetails.setPhonenumber("160-890-220");
		policyDetails.setPolicyNumber("S12786");
		policyDetailsMap.put(policyDetails.getPolicyNumber(), policyDetails);
		/*
		 * some business logic to check policy Details from DB or using API
		 */

		if (policyDetailsMap.get(policyNumber) == null)
			throw new PolicyNotFoundException("Policy not found with policy No."+policyNumber);
		return policyDetailsMap.get(policyNumber);
	}

	@RequestMapping("/phoneNumber")
	public PolicyDetails findPolicyByPhoneNumber(@RequestParam(value = "phoneNumber") String phoneNumber) {
		Map<String, PolicyDetails> policyDetailsMap = new HashMap<String, PolicyDetails>();
		/*
		 * some business logic to check policy Details from DB or using API
		 */
		PolicyDetails policyDetails = new PolicyDetails();
		policyDetails.setEmail("divya.akula@gmail.com");
		policyDetails.setPhonenumber("160-890-220");
		policyDetails.setPolicyNumber("S12786");
		policyDetailsMap.put(policyDetails.getPhonenumber(), policyDetails);
		if (policyDetailsMap.get(phoneNumber) == null)
			throw new PhoneNumberNotFoundException("Policy not found with phone no."+phoneNumber);
		return policyDetailsMap.get(phoneNumber);
	}
	
	@RequestMapping("/email")
	public PolicyDetails findPolicyByEmail(@RequestParam(value = "email") String email) {
		Map<String, PolicyDetails> policyDetailsMap = new HashMap<String, PolicyDetails>();
		/*
		 * some business logic to check policy Details from DB or using API
		 */
		PolicyDetails policyDetails = new PolicyDetails();
		policyDetails.setEmail("divya.akula@gmail.com");
		policyDetails.setPhonenumber("160-890-220");
		policyDetails.setPolicyNumber("S12786");
		policyDetailsMap.put(policyDetails.getEmail(), policyDetails);
		if (policyDetailsMap.get(email) == null)
			throw new EmailNotFoundException("Policy not found with email:"+email);
		return policyDetailsMap.get(email);
	}
}
