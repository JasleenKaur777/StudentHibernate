package code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sf=null;
	static SessionFactory getSessionFactory() {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		return cfg.buildSessionFactory();
	}
	static Session  getSession() {
		return sf.openSession();
	}
	static void closeSession() {
		if(sf!=null) {
			sf.close();
			System.out.println("Session is closed");
		}
	}
}
