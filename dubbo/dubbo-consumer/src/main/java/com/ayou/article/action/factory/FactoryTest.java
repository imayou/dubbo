package com.ayou.article.action.factory;

import groovy.swing.factory.BeanFactory;

public class FactoryTest extends BeanFactory{

	public <T> FactoryTest(Class<T> beanClass) {
		super(beanClass);
	}

}
