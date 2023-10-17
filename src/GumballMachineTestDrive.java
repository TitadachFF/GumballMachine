
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine =  new GumballMachine(5);
		
		System.out.println(gumballMachine);
		//System.out.println(gumballMachine.toString());	
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
