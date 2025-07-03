
package primeornot;

public class AccessModifier1{
	private String name;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "AccessModifier1 [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}