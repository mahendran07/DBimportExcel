package com.chainsys.exportdb.serviceImpl;

import java.util.List;

import com.chainsys.exportdb.DAO.ExportdbDAO;
import com.chainsys.exportdb.service.Exportdboperation;

public class ExportserviceImpl implements Exportdboperation {
	ExportdbDAO exportdb=new ExportdbDAO();
	@Override
	public List<String> dbData(String table_name) {
		List<String> dbContent=null;
		dbContent=exportdb.exportValue(table_name);
		return dbContent;
	}
}
