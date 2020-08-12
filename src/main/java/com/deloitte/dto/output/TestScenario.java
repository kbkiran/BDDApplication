package com.deloitte.dto.output;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.deloitte.dto.Row;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestScenario {

	private List<Row> testScenario = new ArrayList<Row>();

	@JsonProperty("rows")
	@XmlElement(name = "row")
	public List<Row> getTestScenario() {
		return testScenario;
	}

	public void setTestScenario(List<Row> testScenario) {
		this.testScenario = testScenario;
	}

}
