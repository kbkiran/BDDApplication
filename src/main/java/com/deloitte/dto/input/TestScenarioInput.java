package com.deloitte.dto.input;

import java.util.ArrayList;
import java.util.List;

import com.deloitte.dto.Row;

public class TestScenarioInput {

	private List<Row> testScenario = new ArrayList<Row>();


	public List<Row> getTestScenario() {
		return testScenario;
	}

	public void setTestScenario(List<Row> testScenario) {
		this.testScenario = testScenario;
	}

}
