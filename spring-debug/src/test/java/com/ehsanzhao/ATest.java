package com.ehsanzhao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaoyuan
 * @date 2022/11/21
 */
public class ATest {

	@Test
	public static void main(String[] args) {
		A a = new A();
		a.run();
	}
}
