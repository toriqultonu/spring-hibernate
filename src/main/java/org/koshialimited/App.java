package org.koshialimited;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        System.out.println(factory);
    }
}
