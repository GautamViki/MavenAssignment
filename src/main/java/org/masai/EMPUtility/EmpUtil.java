package org.masai.EMPUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpUtil {
    private static EntityManagerFactory emf;

    static{
        emf= Persistence.createEntityManagerFactory("MyUnit1");
    }

    public static EntityManager provideEntityManager(){

        return emf.createEntityManager();
    }
}
