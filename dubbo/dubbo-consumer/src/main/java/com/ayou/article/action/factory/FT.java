package com.ayou.article.action.factory;

import org.springframework.beans.BeansException;
import org.springframework.core.io.Resource;

import com.alibaba.citrus.springext.support.context.XmlBeanFactory;

public class FT extends XmlBeanFactory {

	public FT(Resource resource) throws BeansException {
		super(resource);
	}

}
