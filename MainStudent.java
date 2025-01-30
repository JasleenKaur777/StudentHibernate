package code;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainStudent {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction tr= session.beginTransaction();
	Student stu=new Student(1,"rahul","rahul123@gmail.com");
	session.save(stu);
	tr.commit();
	Student student=session.get(Student.class, 1);
	System.out.println(student);
}
}
