package net.zt.funcode.components.lifecycle;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;


@Component
public class TestBFPP implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	   //получение имен  BeanDefinition	 всех бинов, объявленных пользователем
	   String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
	   
	   //перебор массива для получения доступа к каждому имени
       for(String name: beanDefinitionNames){
    	   
    	   //получение BeanDefinition по имени(по другом никак!)
    	   BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
    	   
    	   //Вывод информации о BeanDefinition
    	   System.out.println(beanDefinition.toString());
       }
  }
}
