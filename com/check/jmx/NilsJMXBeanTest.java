package com.check.jmx;

import java.lang.management.ManagementFactory;
import java.util.Date;
 
import javax.management.MBeanServer;
import javax.management.ObjectName;
 
public class NilsJMXBeanTest {
 
	public static void main(String[] args) throws Exception {
 
		NilsCacheInfo nilsCacheInfo = new NilsCacheInfo();
 
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		ObjectName objectName = new ObjectName("com.nils.cache:name=NilsCacheInfo");
		server.registerMBean(nilsCacheInfo, objectName);
 
		int i=1;
		while (true) {
			System.out.println("Test - " + new Date() + " " + i);
			nilsCacheInfo.incrementCounter();
			Thread.sleep(1000);
			i++;
		}
	}
}