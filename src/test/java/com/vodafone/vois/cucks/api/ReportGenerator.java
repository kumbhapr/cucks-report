package com.vodafone.vois.cucks.api;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class ReportGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateReport();
	}
	
	static void generateReport() {
		File reportOutputDirectory = new File("/home/cloud-ops/prasad/cucks-api/target/pretty-report");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("/home/cloud-ops/prasad/cucks-api/target/cucumber-report/cucumber.json");
	

		String buildNumber = "1";
		String projectName = "cucks-api";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	
		// do not make scenario failed when step has status SKIPPED
//		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Linux");
		configuration.addClassifications("API", "ReqResp-User");
		configuration.addClassifications("Branch", "release/1.0");



		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
	}

}
