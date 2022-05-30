package question2;

public class Student {

private int	roll;
private String	name;
private String	address;
//private int	marks;

private int hindi;
private int english;



public int getHindi() {
	return hindi;
}
public void setHindi(int hindi) {
	this.hindi = hindi;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


public int calculationOfAverage() {
	
 int x =	getEnglish()+getHindi()/2 ;
 return x;
}

}
