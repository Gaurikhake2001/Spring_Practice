package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> frnds;
	private Map<String, Integer> fees;
	
	

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}

	@Override
	public String toString() {
		return "Person [frnds=" + frnds + ", fees=" + fees + "]";
	}
	
	
	}
