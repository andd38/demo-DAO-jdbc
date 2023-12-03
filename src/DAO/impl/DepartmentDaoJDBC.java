package DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;

import DAO.DepartmentDAO;
import db.DB;
import db.DbException;
import entities.Department;
import entities.Seller;

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
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.* ,department.Name as DepName "
					+ "from seller INNER JOIN department "
					+ "on seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?;");
			st.setInt(1, id);
			rs =st.executeQuery();
			
			if(rs.next()) {
				Department dep = instantiateDepartment(rs);
				
				return dep;
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}


	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
		
	}

	@Override
	public List<Department> findAll() {
		
		return null;
	}

}
