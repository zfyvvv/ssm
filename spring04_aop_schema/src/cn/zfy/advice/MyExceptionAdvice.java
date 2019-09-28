package cn.zfy.advice;

public class MyExceptionAdvice {
	public void myExceptionAdvice(Exception e) {
		System.out.println("this is myexceptionadvice!!"+e.getMessage());
	}

}
