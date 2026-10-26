package Factory;

import org.testng.annotations.Factory;

public class FactoryDemo {
	
	
	@Factory
	public Object[] abc()
	{
		Sample1 obj1 = new Sample1();
		Sample1 obj2 = new Sample1();
		
		Object[] execute = new Object[2];
		
		execute[0] = obj1;
		execute[1] = obj2;
		
		return execute;
	}
}
