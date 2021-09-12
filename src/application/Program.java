package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	
		System.out.println("---------------------------------------------------------------------------------------------------------------");
	
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(obj -> System.out.println(obj));
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		list = sellerDao.findAll();
		list.forEach(obj -> System.out.println(obj));
	}

}
