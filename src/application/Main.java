package application;

import java.util.List;

import DAO.DAOFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDAO sellerDao= DAOFactory.createSellerDao();
		
		System.out.println("===teste 1 : seller findBy id===");
		
		//Seller seller = sellerDao.findById(3);
		//System.out.println(seller);
		/*
		 * Department department = new Department(2,null);
		 * System.out.println("===teste 2 : seller findBy id==="); List<Seller>list =
		 * sellerDao.findByDepartment(department); for (Seller seller : list) {
		 * System.out.println(seller); }
		 */
		
		
		System.out.println("===teste 3 : seller findBy id===");
		List<Seller>list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
