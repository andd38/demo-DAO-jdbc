package application;


import java.util.Date;
import java.util.List;

import DAO.DAOFactory;
import DAO.SellerDAO;
import entities.Department;
import entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDAO sellerDao= DAOFactory.createSellerDao();
		
		System.out.println("===teste 1 : seller findBy id===");
		
		Seller seller = sellerDao.findById(3);
		Seller seller2 =sellerDao.findById(3);
		
		//System.out.println(seller);
		
		 //Department department = new Department(2,null);
			/*
			 * System.out.println("===teste 2 : seller findBy id==="); List<Seller>list =
			 * sellerDao.findByDepartment(department); for (Seller seller1 : list) {
			 * System.out.println(seller1); }
			 */
			 
		 
		
		
		
			
			/*
			 * System.out.println("===teste 3 : seller findBy id==="); List<Seller>list1 =
			 * sellerDao.findAll(); for (Seller obj : list1) { System.out.println(obj); }
			 */
		 
			/*
			 * System.out.println("========teste 04: insert=========="); Seller newSeller
			 * =new Seller(null,"greg","greg@gmail.com",new Date(),4000.0,department);
			 * sellerDao.insert(newSeller); System.out.println("Inserted ! new id = "+
			 * newSeller.getId());
			 */
		
		System.out.println("========teste 05: insert==========");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		
		sellerDao.update(seller);
		System.out.println("Update completed");
		seller2=sellerDao.findById(3);
		seller2.setName("Jorge");
		sellerDao.update(seller2);
		
	}

}
