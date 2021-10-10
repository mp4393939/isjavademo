package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionMysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ry?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8", "root", "root");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select user_id,dept_id,login_name,user_name,user_type,email,phonenumber,sex,create_time from sys_user");
            while (rs.next()) {
                String user_id = rs.getString("user_id");
                String dept_id = rs.getString("dept_id");
                String login_name = rs.getString("login_name");
                String user_name = rs.getString("user_name");
                String user_type = rs.getString("user_type");
                String email = rs.getString("email");
                String phonenumber = rs.getString("phonenumber");
                String sex = rs.getString("sex");
                String create_time = rs.getString("create_time");
                System.out.println(user_id + "," + dept_id + "," + login_name + "," + user_name + "," + user_type + "," + email + "," + phonenumber + "," + sex + "," + create_time);
            }
            //先得到的先关闭，后得到的后关闭
            System.out.println("query语句执行成功");
            rs.close();
            st.close();
            conn.close();
            System.out.println("连接已关闭");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
