package info.inetsolv.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import info.inetsolv.entity.Address;
import info.inetsolv.util.JPAUtil;

public class InsertAddress {
public static void main(String[] args) {
	EntityManager entityManager = JPAUtil.getEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	Address address = new Address();
	address.setCityName("Banglore");
	entityManager.persist(address);
	transaction.begin();
	transaction.commit();
	entityManager.close();
}
}