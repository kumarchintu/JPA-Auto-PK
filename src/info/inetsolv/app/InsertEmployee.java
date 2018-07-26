package info.inetsolv.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import info.inetsolv.entity.Employee;
import info.inetsolv.util.JPAUtil;

public class InsertEmployee {
 public static void main(String[] args) {
	EntityManager entityManager = JPAUtil.getEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	Employee employee = new Employee();
	employee.setEmployeeName("Abhi");
	employee.setEmployeeSalary(50000d);
	entityManager.persist(employee);
	transaction.begin();
	transaction.commit();
	entityManager.close();
}
}