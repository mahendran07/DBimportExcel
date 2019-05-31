package com.chainsys.exportdb.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.exportdb.util.ConnectionUtil;


public class ExportdbDAO {

	public List<String> exportValue(String table_name) {
		List<String> tablevalue=new ArrayList<>();
		Connection connection=ConnectionUtil.getConnection();
		String sql="select * from "+table_name;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = resultset.getMetaData();
			int numOfCols = rsmd.getColumnCount(); 
			while (resultset.next()) {
				for(int i = 1; i <= numOfCols; i++) { 
					//System.out.println(rsmd.getColumnName(i)); 
					tablevalue.add(resultset.getString(rsmd.getColumnName(i)));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tablevalue;
	}

}
