package com.cg.eis.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUTIL {
	private static String url=null;
	 private static String usn=null;
	 private static String pwd=null;
	 private static String driver=null;
	 private static Connection con=null;
	 public static Connection getCon()
	 throws SQLException, IOException
	 {
		 Properties myprops=getProps();
		 url=myprops.getProperty("dburl");
		 usn=myprops.getProperty("dbunm");
		 pwd=myprops.getProperty("dbpwd");
		 if(con==null)
		 {
			 con=DriverManager.getConnection(url,usn,pwd);
			 
				 }
		 return con;
	 }
	 public static Properties getProps() throws IOException
	 {
		 Properties dbProps=new Properties();
		 FileReader fr=new FileReader("dbinfo.properties");
		 dbProps.load(fr);
		 return dbProps;
	 }
	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
