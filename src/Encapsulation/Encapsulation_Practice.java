package Encapsulation;

class Encapsulation_Practice {
	public String name;
	public void setName(String name) {
		this.name=name;
	}
	public void getName(String name) {
		System.out.println("Person Name ="+name);
	}
	public static void main(String[] args) {
		Encapsulation_Practice en=new Encapsulation_Practice();
		en.getName("Navin");

	}

}
