package application;

import DAO.DAOFactory;
import DAO.SellerDAO;
import entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDAO sellerDao= DAOFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
