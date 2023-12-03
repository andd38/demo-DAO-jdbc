package application;

import DAO.DAOFactory;
import DAO.DepartmentDAO;
import entities.Department;

public class Main {

	public static void main(String[] args) {
		
		//SellerDAO sellerDao= DAOFactory.createSellerDao();
		DepartmentDAO department = DAOFactory.createDepartmentDao();
		/*
		 * System.out.println("===teste 1 : department insert ===");
		 * 
		 * Department dp = new Department(null,"casa ,mesa e banho");
		 * 
		 * department.insert(dp);
		 */
		
		
		System.out.println("Insert complete");
		
		System.out.println("===teste 2 : department findById ===");
		
		System.out.println(department.findById(5));
	}

}
