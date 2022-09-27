package com.aspire.framework.pagefactory.TestNG.Baseclass.utilityclass_listner_propertyFile;

import java.util.Date;

public class TimeStamp {
public static void main(String[] args) {
	Date d  = new Date();
	 String timestamp = d.toString().replace(" "," ").replace(" ", " ");
	 System.out.println(timestamp);
	
	
}
}
