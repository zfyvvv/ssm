package cn.zfy.demo;

import org.springframework.beans.factory.annotation.Value;

public class Demo {
	@Value("${key1}")
	private String str1;
	@Value("${key2}")
	private String str2;
	
	public void print() {
		System.out.println(str1+":"+str2);
	}

}
