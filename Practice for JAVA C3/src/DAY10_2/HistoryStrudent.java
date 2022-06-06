package DAY10_2;

public class HistoryStrudent extends Student {

	
    int	historyMarks;
    int	civicsMarks;
    
    
    
    public HistoryStrudent() {
		// TODO Auto-generated constructor stub
	}
    
	public HistoryStrudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}





	@Override
	public void getPercentage() {
		
		double total = (historyMarks+civicsMarks);
		
		double percentage = (total/200)*100;
		
	System.out.println("Percentage : "+percentage);
	}
    
}
