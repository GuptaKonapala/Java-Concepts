package AbstractionConcept;

public class Test extends AbstractImplement implements Interfacecar {
	
	public static void main(String[] args) {
		Test a = new Test();
		a.nonabstractmethod();
		a.method();
		a.start();
		a.stop();
		a.refuel();
		
	}

		
	@Override
	public void method() {
		System.out.println("TODO Auto-generated method stub");
		
	}

	@Override
	public void start() {
		System.out.println("TODO Auto-generated method stub2");		
	}

	@Override
	public int stop() {
		System.out.println("TODO Auto-generated method stub3");		
		return 0;
	}

	@Override
	public String refuel() {
		System.out.println("TODO Auto-generated method stub4");		
		return null;
	}

	
	
	
}
