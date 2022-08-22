package problem2;



public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	 
	 
       void	searchOutdatedModel(String companyName,String... arr){
    	   
    	  boolean flag  =false;
    	   
    	for(int i =0 ; i<outdatedModels.length;i++) {
    		
    	for(int j=0 ; j<arr.length; j++) {
    		if(outdatedModels[i].equals(arr[j])) {
    			System.out.println(outdatedModels[i]+"_outdated");
    			
    		flag =	true;
    			break;
    		}
   flag = false;
    	}
		

    	if(flag == false) {
 	System.out.println("no model available"); 
break;
    	}
    	}
}
}
class Main{
	
	public static void main(String[] args) {
		
	
	    
	    Mobile mobile = new Mobile();
	    
	    mobile.searchOutdatedModel("Samsung","note4","note5","note10");
	}
}


