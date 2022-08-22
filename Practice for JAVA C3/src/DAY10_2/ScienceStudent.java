package DAY10_2;

public class ScienceStudent extends Student {

	
	int phisicsMarks;
    int	chemistryMarks;
    int	mathsMarks;
    
    
    public ScienceStudent() {
		// TODO Auto-generated constructor stub
	}
    
    
	public ScienceStudent(int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}





	@Override
	public void getPercentage() {
		
		double total = (phisicsMarks+chemistryMarks+mathsMarks);
		
		double percentage = (total/300)*100;
		
		System.out.println("Percentage : "+percentage);
		
	}
    
    
    
}
