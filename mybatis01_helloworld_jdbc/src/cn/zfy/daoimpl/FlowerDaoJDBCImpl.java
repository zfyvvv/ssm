package cn.zfy.daoimpl;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Refreshable;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import cn.zfy.dao.FlowerDao;
import cn.zfy.pojo.Flower;

public class FlowerDaoJDBCImpl implements FlowerDao{

		/**
		 * 查询全部；
		 */
		@Override
		public List<Flower> selAll() {
			List<Flower> list=null;
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm", 
						"root", "123456");
				ps=conn.prepareStatement("select * from flower");
				rs=ps.executeQuery();
				//放在外面，可以查询所有；
				list=new ArrayList<>();
				while(rs.next()) {
					//放在里面，查的都是最后一个；每次都会new对象；
					//list=new ArrayList<>();
					list.add(new Flower(rs.getInt(1),rs.getString(2),
							rs.getInt(3),rs.getString(4)));
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			return list;
		}
	}
	
	
	


