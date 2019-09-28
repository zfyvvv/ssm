package cglibdypro;

import staticproxy.Business;

public class Boss implements Business{

	@Override
	public void chat() {
		System.out.println("the topic of chat is money!");
	}
}
