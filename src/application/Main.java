package application;

import DAO.DAOFactory;
import DAO.DepartmentDAO;
import DAO.impl.DepartmentDaoJDBC;
import entities.Department;

public class Main {

	public static void main(String[] args) {
		
		//SellerDAO sellerDao= DAOFactory.createSellerDao();
		DepartmentDAO department = DAOFactory.createDepartmentDao();
		
		 System.out.println("===teste 1 : department insert ===");
		  
		 // Department dp = new Department(null,"casa ,mesa e banho");
		 
		 //department.insert(dp);
		 
		 System.out.println( "===teste 4 : department FindAll ===");
		 
		 System.out.println(department.findAll());
		 
		 
		/*
		 * System.out.println("Insert complete");
		 * 
		 * System.out.println("===teste 2 : department findById ===");
		 * 
		 * System.out.println(department.findById(5));
		 */
		/*
		 * System.out.println("===teste 3 : department delete ===");
		 * department.deleteById(5); System.out.println("Delete complete");
		 */
		/*
		 * System.out.println("===teste 3 : department update ===");
		 * 
		 * Department dep2 = department.findById(3); dep2.setName("cooking");
		 * department.update(dep2); System.out.println("Update complete");
		 */
			
		
		
	}

}
