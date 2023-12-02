package DAO;

import DAO.impl.DepartmentDaoJDBC;
import DAO.impl.SellerDaoJDBC;
import db.DB;

public class DAOFactory {
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
		
	}
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
