package com.ehsanzhao;

import com.ehsanzhao.beanConfig.BeanConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaoyuan
 * @date 2022/11/21
 */
public class A implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public static void main(String[] args) {
//		A a = this.applicationContext.getBean(A.class);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext anac = new AnnotationConfigApplicationContext(BeanConfig.class);
		A a = ac.getBean(A.class);
		System.out.println(a);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
