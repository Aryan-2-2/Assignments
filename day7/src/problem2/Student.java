package problem2;

public class Student {

	String studId;
	String studName;
	double  examFee;
	
	void diplayDetails() {
		
	}
	
	double payFee(double p,double x) {
		
		return p + x;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
}

class DayScholar extends Student{
	
	double transportFee;

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}
	
}

class Hosteller extends Student{
	double hostelFee;
	
	

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	
	
}

class Main{
	public static void main(String[] args) {
		
		DayScholar d1 = new DayScholar();
		
		Hosteller h1 = new Hosteller();
		
		d1.setStudId("01");
		d1.setStudName("Gaurav");
		d1.setExamFee(1000);
		d1.setTransportFee(500);
		
		System.out.println("student id: " +d1.getStudId());
		System.out.println("student name: " +d1.getStudName());
		System.out.println("exam fee: " +d1.getExamFee());
		System.out.println("Total fee: "+d1.payFee(d1.getExamFee(),d1.getTransportFee()));
		
		System.out.println("========================");
		
		
		h1.setStudName("Suresh");
		h1.setStudId("01");
		h1.setExamFee(1000);
		h1.setHostelFee(2000);
		
		System.out.println("student id: " +h1.getStudId());
		System.out.println("student name: " +h1.getStudName());
		System.out.println("exam fee: " +h1.getExamFee());
		System.out.println("Total fee: "+h1.payFee(h1.getExamFee(),h1.getHostelFee()));
	}
}