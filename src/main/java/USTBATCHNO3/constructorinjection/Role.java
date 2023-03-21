package USTBATCHNO3.constructorinjection;

public class Role {
	 public String charactername;
	 public String responsibility;
	public Role(String charactername, String responsibility) {
		super();
		this.charactername = charactername;
		this.responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Role [charactername=" + charactername + ", responsibility=" + responsibility + "]";
	}
	 public void display() {
		 System.out.println("My name is: "+charactername+ "and my responsibility is " + responsibility);
	 }
}
