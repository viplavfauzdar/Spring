package test;
/**
 * 
 */
import db.*;
/**
 * @author VXF4071
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Test");
		Customer c = new Customer();
		c.setName("Viplav");		
		CustomerHome ch = new CustomerHome();
		ch.persist(c);
	}

}
