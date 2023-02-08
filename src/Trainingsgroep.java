
public class Trainingsgroep {

	//properties
	private int size;
	private String startingDate;
	private String name;
	private boolean allAssigned;
	
	
	//constructors
	public Trainingsgroep() {
		size = 28;
	}
	
	public Trainingsgroep(int size, String startingDate){
		this.size = size;
		this.startingDate = startingDate;
	}
	
	public Trainingsgroep(int size, String startingDate, String name, boolean allAssigned){
		this.size = size;
		this.startingDate = startingDate;
		this.name = name;
		this.allAssigned = allAssigned;
	}
	
	
	//methods
	public void printSize() {
		System.out.println("size = " + size);
	}
	
	public void printStartingDate() {
		System.out.println("Starting date = " + startingDate);
	}
	
	public void printAllInfo() {
		System.out.println("size = " + size);
		System.out.println("Starting date = " + startingDate);
		System.out.println("Name = " + name);
		System.out.println("All assigned = " + allAssigned);
	}
	
	//setters
	public void setSize(int a) {
		size = a;
	}
	
	public void setStartingDate(String a) {
		startingDate = a;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAllAssigned(boolean allAssigned) {
		this.allAssigned = allAssigned;
	}
	
	//getters
	public int getSize() {
		return size; 
	}
	
	public String getStartingDate() {
		return startingDate; 
	}

	public String getName() {
		return name;
	}

	public boolean isAllAssigned() {
		return allAssigned;
	}

	
	

	

	

}
