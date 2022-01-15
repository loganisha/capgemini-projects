package w;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("hi");
		Session s = Helper.getSession();
		System.out.println(s);
		SalariedEmployee se = new SalariedEmployee(100, "nisha", 20000);
		HourlyEmployee he = new HourlyEmployee(200, "nishanth", 300, 5);
		Transaction tr = s.beginTransaction();
		s.save(se);
		s.save(he);
		tr.commit();
		s.close();
		System.out.println("saved....");

	}
}
