package com.pack.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomeGenerator implements IdentifierGenerator
{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException 
	{
		String prefix ="Roll-NO-";
		String suffix = "";
		try 
		{
			Connection con = session.connection();
			Statement statement = con.createStatement();
			String sq1 = "select customers_seq.nextval from dual";
			ResultSet resultSet = statement.executeQuery(sq1);
			if(resultSet.next())
			{
				int val = resultSet.getInt(1);
				suffix = String.valueOf(val);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return prefix+suffix;
	}
}
