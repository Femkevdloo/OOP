
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Het werkt!");
		
		Person p;
		p = new Person();
		
		Person p2 = new Person(); 
		p2.name = "Femke";
		p2.bsn = 38561;
		p2.lovesProgramming = true;
		p2.printName();
		
		p2.setName("Henk");
		p2.printName();
		
		String p2Name = p2.getName();
		
		Person p3 = new Person("Piet", 25462);
		System.out.println(p3.name + p3.bsn);
		
		System.out.println();
		
		
		
		Trainingsgroep t1 = new Trainingsgroep();
		//t1.size = 13;
		//t1.startingDate = "06-02-2023"; 
		t1.printSize();
		t1.printStartingDate();
		t1.setSize(10);
		t1.printSize(); 
		t1.setStartingDate("01-02-2023");
		t1.printStartingDate();
		
		int t1Size = t1.getSize();
		String t1StartingDate = t1.getStartingDate(); 
		
		System.out.println(t1Size);
		System.out.println(t1StartingDate);
		
		Trainingsgroep t2 = new Trainingsgroep(20, "03-02-2023", "FebGroep", false);
		t2.printAllInfo(); 
	
	}
}
