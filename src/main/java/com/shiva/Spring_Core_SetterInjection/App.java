package com.shiva.Spring_Core_SetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.beans.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("/spring.xml") );
        Employee emp=(Employee)factory.getBean("emp");
        emp.displayDetails();
    }
}
