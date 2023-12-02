package application;

import DAO.DAOFactory;
import DAO.DepartmentDAO;
import entities.Department;

public class Main {

	public static void main(String[] args) {
		
		//SellerDAO sellerDao= DAOFactory.createSellerDao();
		DepartmentDAO department = DAOFactory.createDepartmentDao();
		System.out.println("===teste 1 : department insert ===");
		
		Department dp = new Department(null,"games");
		
		department.insert(dp);
		
		
		System.out.println("Insert complete");
	}

}
