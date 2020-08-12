package com.deloitte.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.dto.input.TestScenarioInput;
import com.deloitte.dto.input.TestScenariosInput;
import com.deloitte.dto.output.TestScenario;
import com.deloitte.dto.output.TestScenarios;

@CrossOrigin()
@RequestMapping("/")
@RestController
public class ConversionController {
	@RequestMapping(value = "convertData/xml", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
	public TestScenarios convertDataToXML(@RequestBody TestScenariosInput testScenariosInput) {
		return copyData(testScenariosInput);
	}

	@RequestMapping(value = "convertData/json", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public TestScenarios convertDataToJason(@RequestBody TestScenariosInput testScenariosInput) {
		return copyData(testScenariosInput);
	}

	private TestScenarios copyData(TestScenariosInput testScenariosInput) {
		TestScenarios testScenarios = new TestScenarios();
		List<TestScenario> testScenarioList = new ArrayList<TestScenario>();

		List<TestScenarioInput> testScenarioInputList = testScenariosInput.getTestScenarios();
		for (TestScenarioInput testScenarioInput : testScenarioInputList) {
			TestScenario testScenario = new TestScenario();
			testScenario.setTestScenario(testScenarioInput.getTestScenario());
			testScenarioList.add(testScenario);
		}

		testScenarios.setTestScenarios(testScenarioList);
		return testScenarios;
	}
}
