package jdbc;

class MysqlConnection {


    /*public static Connection getDBConnection() {

        Connection connection = null;
        String mySqlDriver = "com.mysql.cj.SeleniumProject.jdbc.Driver";
        String urlString = "SeleniumProject.jdbc:mysql://localhost:3306/mysql";
        String userName = "root";
        String password = "root";

        try {
            Class.forName(mySqlDriver);
            connection = DriverManager.getConnection(urlString, userName, password);
            System.out.println("Connection success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }

    public static void getCities() {
        Connection connection = null;

        String query = "select * from world.city";
        try {
            connection = getDBConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(3).equals("IND")) {
                    System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }
    }

    public static void getCountries() {
        Connection connection = null;
        String query = "select * from world.country";
        try {
            connection = getDBConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }
    }


    public static void main(String args[]) {

//        getCities();
        getCountries();
    }*/


}