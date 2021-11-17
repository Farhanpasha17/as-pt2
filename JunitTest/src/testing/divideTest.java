package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test= new Junit Testing();
		int output=(int) test.divide(5,5);
		assertEquals(1,output);
	}
	public void negativetestCase() {
		
		JunitTesting test=new JunitTesting();
		int output=(int) test.divide(20,-12);
		assertEquals(1, output);
		
	}

}
