package com.deloitte.dto.output;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "TestScenarios")

public class TestScenarios {

	private List<TestScenario> testScenarios = new ArrayList<TestScenario>();

	@JsonProperty("TestScenarios")
	@XmlElement(name = "TestScenario")
	public List<TestScenario> getTestScenarios() {
		return testScenarios;
	}

	public void setTestScenarios(List<TestScenario> testScenarios) {
		this.testScenarios = testScenarios;
	}

}
