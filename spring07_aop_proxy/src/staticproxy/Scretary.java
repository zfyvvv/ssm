package staticproxy;

import staticproxy.Business;

public class Scretary implements Business{
	private Boss boss=new Boss();
	@Override
	public void chat() {
		System.out.println("book a hotel!");
		boss.chat();
		System.out.println("meeting record!");
	}

}
