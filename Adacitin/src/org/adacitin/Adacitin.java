package org.adacitin;

import org.base.BaseClass;
import org.pojoclass.LoginPage;

public class Adacitin extends BaseClass {
	public static void main(String[] args) {
		BaseClass build=new BaseClass();
		// first step
		build.getdriver();
		build.getUrl("http://adactinhotelapp.com/");
		// second step
		LoginPage log = new LoginPage();
		build.enterTxt(log.getUserName(), "karthi007");
		build.enterTxt(log.getPass(), "Karthi@1989");
		build.butnClick(log.getLogin());
		
		
		
		
		
		
	}
	

}
