package sqlcon;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tan.bean.*;



public class SQLUtil {
	public SQLConnect sp;
	public SQLUtil(){
		sp = new SQLConnect();
	}
	public int insertuser(User user){
		sp.connectdatabase();
		String sql = SQLSentence.insertuser();
		int row = 0;
		 try {
			PreparedStatement ps = sp.conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getNickname());
			ps.setString(4, user.getGender());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getProfession());
			ps.setString(8, user.getBirthday());
			ps.setString(9, user.getPhone());
			row = ps.executeUpdate();
			if(row > 0){
				System.out.println("保存信息成功");
				sp.closedatabase();
				return row;
			}
			sp.closedatabase();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("保存信息失败");
			sp.closedatabase();
			//e.printStackTrace();
			return 0;
		}
	}
	
	
	public boolean verifyuser(User user){
		String username = user.getUsername();
		sp.connectdatabase();
		Boolean result=false;
		String sql = SQLSentence.verifyuser(username);
		Statement status;
		try {
			status = sp.conn.createStatement();
			ResultSet set = status.executeQuery(sql);
			if(set.next()){
				
				String password = set.getString("password");
				result = password.equals(user.getPassword());
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public String getnickname(User user){
		String username = user.getUsername();
		sp.connectdatabase();
		String nickname = "";
		String sql = SQLSentence.getnickname(username);
		Statement status;
		try {
			status = sp.conn.createStatement();
			ResultSet set = status.executeQuery(sql);
			set.next();
			nickname = set.getString("nickname");
			return nickname;
		} catch (SQLException e) {
			e.printStackTrace();
			return "空";
		}
		
	}
	
	public boolean insertintent(Intent intent){
		sp.connectdatabase();
		String sql = SQLSentence.insertintentinf();
		int row = 0;
		 try {
			
			PreparedStatement ps = sp.conn.prepareStatement(sql);
			ps.setString(1, intent.getNickname());
			ps.setString(2, intent.getTitle());
			ps.setString(3, intent.getContent());
			
			row = ps.executeUpdate();
			if(row > 0){
				System.out.println("保存信息成功");
				sp.closedatabase();
				return true;
			}
			sp.closedatabase();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("保存信息失败");
			sp.closedatabase();
			e.printStackTrace();
			return false;
		}
	}
	public List<Intent> getcontent(){
		sp.connectdatabase();
		String sql = SQLSentence.getcontent();
		try{
			Statement stmt = sp.conn.createStatement();
			ResultSet rs;
			rs=stmt.executeQuery(sql);
			List<Intent> data = new ArrayList<Intent>();
			while(rs.next()){
				Intent intent = new Intent(rs.getString("id"), rs.getString("nickname"), rs.getString("title"), rs.getString("content"), rs.getString("createtime"));
				data.add(intent);
				
			}
			return data;
		}catch(SQLException e){
			return null;
		}		
	}
	public User getuser(String username){
		sp.connectdatabase();
		String sql = SQLSentence.getuser(username);
		try{
		Statement stmt = sp.conn.createStatement();
		ResultSet rs;
		rs=stmt.executeQuery(sql);
		rs.next();
		User user = new User(rs.getString("username"), rs.getString("password"), rs.getString("nickname"), rs.getString("gender"), rs.getString("email"), rs.getString("address"), rs.getString("profession"), rs.getString("birthday"), rs.getString("phone"));
		return user;
		}catch(SQLException e){
			return null;
		}
		
		
	}
}
