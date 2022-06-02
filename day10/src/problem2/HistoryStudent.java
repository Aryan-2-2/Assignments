package problem2;

public class HistoryStudent extends Student {

    int	historyMarks;
    int	civicsMarks;
    
    
    HistoryStudent(){
    	
    }
    
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}




	@Override
	public void getPercentage() {
		
		double total = historyMarks+civicsMarks;
		
		double percentage = ((total/200)*100);
		
		System.out.println("Percentage :"+percentage);
	
	}
 
    
    
}