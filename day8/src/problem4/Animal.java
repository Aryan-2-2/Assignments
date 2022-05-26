package problem4;

public class Animal {

	
	    public void makeNoise(){
		   System.out.println("Animal making Noise");
		}
	
		public void eat(){
		   System.out.println("Animal is eating");
		}
		
		public void walk(){
		   System.out.println("Animal is walking");
		}
}

class Dog extends Animal{
	
	@Override
	 public void makeNoise(){
	     System.out.println("Barking");
	}
}

class Cat extends Animal{
	
	@Override
	 public void makeNoise(){
	    System.out.println("Meaw");
	}
}

class Tiger extends Animal{
	
	@Override
	 public void makeNoise(){
	   System.out.println("Roaring");
	}
}

class Main{
	
	 public static void main(String[] args) {
		
		 Animal[] animal = new Animal[3];
		 
		 Dog d1 = new Dog();
		 
		 animal[0] = d1;
		 
		for(int i=0 ; i<animal.length; i++) {
			System.out.println(animal[i]);
		}
	}
}
