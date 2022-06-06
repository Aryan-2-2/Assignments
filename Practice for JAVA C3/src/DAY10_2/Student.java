package DAY10_2;

abstract public class Student {

     String	name;
     String	address;
	 String stream;
     
	 
	 
     public String getStream() {
		return stream;
	}



	public void setStream(String stream) {
		this.stream = stream;
	}



	public abstract void getPercentage();
     
}
