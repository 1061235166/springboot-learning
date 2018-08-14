package com.k.demo.beanfactory;

import com.k.demo.entity.Bean1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Service;

/**
 * created by wyk
 * 2018/8/14
 **/
@Service
public class DemoBeanFactory implements BeanFactory {

	private Bean1 bean1 = new Bean1();

	@Override
	public Object getBean(String s) throws BeansException {
		return bean1;
	}

	@Override
	public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		return null;
	}

	@Override
	public Object getBean(String s, Object... objects) throws BeansException {
		return bean1;
	}

	@Override
	public <T> T getBean(Class<T> aClass) throws BeansException {
		return null;
	}

	@Override
	public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
		return null;
	}

	@Override
	public boolean containsBean(String s) {
		return false;
	}

	@Override
	public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
		return true;
	}

	@Override
	public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
		return false;
	}

	@Override
	public boolean isTypeMatch(String s, ResolvableType resolvableType) throws NoSuchBeanDefinitionException {
		return false;
	}

	@Override
	public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
		return false;
	}

	@Override
	public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
		return Bean1.class;
	}

	@Override
	public String[] getAliases(String s) {
		return new String[0];
	}
}
