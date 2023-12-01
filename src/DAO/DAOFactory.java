package DAO;

import DAO.impl.SellerDaoJDBC;
import db.DB;

public class DAOFactory {
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
		
	}
}
