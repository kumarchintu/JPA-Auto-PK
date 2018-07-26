package info.inetsolv.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static EntityManagerFactory createEntityManagerFactory(){
		return Persistence.createEntityManagerFactory("AutoPKDemo");
	}
	
	public static EntityManager getEntityManager(){
		return createEntityManagerFactory().createEntityManager();
	}
}