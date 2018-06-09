package com.keeley.RerunDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
	@SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IRetryAnalyzer retry = annotation.getRetryAnalyzer();
        if (retry == null) {
        	System.out.println("2324");
            annotation.setRetryAnalyzer(TestNGRetry.class);
        }
    }
}

