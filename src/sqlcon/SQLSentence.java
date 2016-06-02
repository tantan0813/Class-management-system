package sqlcon;

public class SQLSentence {
	public static String insertuser() {
		String sql = "insert into user(username,password,nickname,gender,email,address,profession,birthday,phone) values(?,?,?,?,?,?,?,?,?)";
		return sql;
	}

	public static String verifyuser(String username) {
		String sql = "select password from user where username=" + username;
		return sql;
	}

	public static String insertintentinf() {
		String sql = "insert into intentinf(nickname,title,content) values(?,?,?)";
		return sql;
	}

	public static String getnickname(String username) {
		String sql = "select nickname from user where username=" + username;
		return sql;
	}

	public static String getcontent() {
		String sql = "select * from intentinf";
		return sql;
	}

	public static String getcontentcount() {
		String sql = "select count(*) as intentcount from intentinf";
		return sql;
	}

	public static String changeinf() {
		String sql = "update user set username=?,password=?,nickname=?,gender=?,email=?,address=?,profession=?,birthday=?,phone=? where username=?";
		return sql;
	}
	public static String getuser(String username){
		String sql = "select * from user where username="+username;
		return sql;
	}
}
