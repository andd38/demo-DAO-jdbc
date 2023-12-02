package DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DAO.DepartmentDAO;
import db.DB;
import db.DbException;
import entities.Department;

public class DepartmentDaoJDBC implements DepartmentDAO{
	
	private Connection conn;
	
	
	
	public DepartmentDaoJDBC(Connection conn) {
		
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(("Insert into Department (Name)" +
						"values (?)"),Statement.RETURN_GENERATED_KEYS);
			
			
			st.setString(1, obj.getName());
			
			int rows = st.executeUpdate();
			if(rows> 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id =rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}else {
				throw new DbException("Error unexpected");	
	      }
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Department obj) {
		
		
	}

	@Override
	public void deleteById(Integer id) {
		
		
	}

	@Override
	public Department findById(Integer id) {
		
		return null;
	}

	@Override
	public List<Department> findAll() {
		
		return null;
	}

}
