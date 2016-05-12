import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		Activity test = new Activity(5,3,4,2);
		int output = test.getStaffNeeded();
		assertEquals(3,output); 
	}
	
	@Test
	public void projectTypeTest() {
		Project test = new Project("John",1,1);
		String output = test.getProjectType();
		assertEquals("Java",output);
	}
	
	@Test
	public void projectGetNameTest() {
		Project test = new Project("John",1,1);
		String output = test.getName();
		assertEquals("John",output);
	}


}
