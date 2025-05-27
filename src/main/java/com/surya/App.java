package com.surya;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        alien a1 = new alien();
        a1.setId(15);
        a1.setName("Alien5");
        a1.setColor("No color");


        Configuration config = new Configuration();
        config.addAnnotatedClass(com.surya.alien.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                                .addAnnotatedClass(com.surya.alien.class)
                                .configure()
                                .buildSessionFactory();
      //  SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
/* 
        //Pushing the data
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();
        
        //Getting the Data 
        alien a2 = session.find(alien.class, 11);
        System.out.println(a2);
        */

        //Updating the data 
        Transaction transaction = session.beginTransaction();
        session.merge(a1);
        transaction.commit();

    }
}
