
public class Person {

		public String name;
		public int bsn;
		public boolean lovesProgramming;
		
		
		public Person() {
			System.out.println("In constructor");
		}
		
		public Person(String name, int bsn) {
			this.name = name;
			this.bsn = bsn; 
		}
		
		
		public void printName() {
			System.out.println("name = " + name);
		}
		
		public void setName(String a) {
			name = a; 
		}
		
		public String getName() {
			return name;
		}
}
