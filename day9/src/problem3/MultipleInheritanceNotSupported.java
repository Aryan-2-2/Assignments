package problem3;

public class MultipleInheritanceNotSupported {

	

	
	// Why is multiple inheritances not supported in Java
//		at the class level?	
		

		/*
		 * Ans: Java does not multiple inheritances to avoid
		 * ambiguity caused by the multiple inheritances.
		 * 
		 * one of the most common problems that occur due to
		 * ambiguity is the Diamond problem.
		 * 
		 * there is a brief explanation of the Diamond problem...
		 * 
		 *                class A
		 *                   |
		 *          _________|__________
		 *         |                    |
		 *       class B             class C
		 *         |                    |
		 *         |______class D______ |
		 *         
		 * 
		 * 
		 * so, in the above diagram as you can see class b 
		 * and c inheriting properties of class a and class d
		 * is inheriting properties of class b and c.
		 * let's say there is a method in class a and class b and c
		 * overriding that method and if you want to call 
		 * that same method from class d so which method class d
		 * will call? overridden method of class b or c ? this
		 * creates ambiguity. so to avoid this type of amibiguity
		 * java doesn't support multi-level inheritance in class
		 * level.
		 * 
		 * */
}
