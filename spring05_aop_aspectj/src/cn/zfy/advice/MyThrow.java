package cn.zfy.advice;

import java.rmi.RemoteException;

import org.springframework.aop.ThrowsAdvice;

public class MyThrow implements ThrowsAdvice{
	public void afterThrowing(ArithmeticException ex) throws Throwable {
        System.out.println("this is exception by schema-base!");
    }
}
