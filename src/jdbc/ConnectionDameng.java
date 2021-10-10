package jdbc;

import security.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDameng {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDameng t = new ConnectionDameng();
        t.insert();
        t.query();
    }

    public int insert() throws ClassNotFoundException, SQLException {
        //1.regedit driver
        Class.forName("dm.jdbc.driver.DmDriver");
        //2.get connection
        Connection connection = DriverManager.getConnection("jdbc:dm://localhost:5236", "SYSDBA", "Lxh2019..");
        System.out.println("连接成功");
        //3.excute sqlstring
        String sqlString = "SET IDENTITY_INSERT SYSDBA.SYS_USER ON;\n" +
                "insert into SYSDBA.SYS_USER(DEPT_ID,LOGIN_NAME,USER_NAME) values(124,'TEST','TEST');\n" +
                "SET IDENTITY_INSERT SYSDBA.SYS_USER OFF;";
        java.sql.Statement statement = connection.createStatement();
        int result = statement.executeUpdate(sqlString);
        if (statement != null) {//4、release　
            System.out.println("insert语句执行成功");
            statement.close();
            connection.close();
            System.out.println("连接已关闭");
        }
        return result;
    }

    public void query() throws ClassNotFoundException {
        //1.regedit driver
        Class.forName("dm.jdbc.driver.DmDriver");
        try {
            //2.get connection
            Connection connection = DriverManager.getConnection("jdbc:dm://localhost:5236", "SYSDBA", "Lxh2019..");
            System.out.println("连接成功");
            //3.excute sqlstring
            String sqlString = "SELECT USER_ID,DEPT_ID,LOGIN_NAME,USER_NAME FROM SYSDBA.SYS_USER;";
            java.sql.Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlString);
            while (rs.next()) {
                String userid = rs.getString("USER_ID");
                String deptid = rs.getString("DEPT_ID");
                String loginname = rs.getString("LOGIN_NAME");
                String username = rs.getString("USER_NAME");
                System.out.println(userid + "," + deptid + "," + loginname + "," + username);
            }
            if (statement != null) {
                //4、release　
                System.out.println("query语句执行成功");
                rs.close();
                statement.close();
                connection.close();
                System.out.println("连接已关闭");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
