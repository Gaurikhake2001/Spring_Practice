package com.spring.springjdbc.jdbcspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = 
        		new ClassPathXmlApplicationContext("com/spring/springjdbc/jdbcspring/jdbc.xml");
        
        JdbcTemplate jt = ct.getBean("jdbctemp", JdbcTemplate.class);
        
        String query = "insert into student(id, name, city) values (?,?,?)";
        
        int r = jt.update(query,102, "Revan", "Khake");
        
        System.out.println("record inserted.."+ r);
    }
}
