package com.cg.studenttest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import com.cg.student.Studenteg;

public class StudentTest {
	TestInfo testInfo;
	TestReporter testReporter;
	Studenteg s=new Studenteg(04,"Raji",89);
	
@BeforeEach
void init(TestInfo testInfo, TestReporter testReporter) {
	this.testInfo=testInfo;
	this.testReporter=testReporter;
	System.out.println("This is beforeEach");
}

	@Test
	void testRollno() {
		assertEquals(s.getRollno(),04);
		
	}
	@RepeatedTest(2)
	@Tag("stud")
	void testName() {
		System.out.println(testInfo.getTags());
		testReporter.publishEntry("this is to salary"+testInfo.getTags());
		assertEquals(s.getName(),"Raji");
		
	}
	@Test
	void testMarks() {
		assertEquals(s.getMark(),89);
		
	}
	@AfterEach
	public void afterEg()
	{
		System.out.println("This is afterEach");
	}


}
