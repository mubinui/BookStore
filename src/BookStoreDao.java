import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookStoreDao {

        public static boolean insertBooksToDB(BookStore bs){
            boolean flag = false;
            try{
                Connection con = Connector.createConnection();
                String q = "insert into books(id,bookname, booktype) values(?,?,?)";
                PreparedStatement prestmpt = con.prepareStatement(q);
                //set the values of the parameters
                prestmpt.setInt(1,bs.getBook_id());
                prestmpt.setString(2,bs.getBook_name());
                prestmpt.setString(3, bs.getBook_type());
                //executing query
                prestmpt.executeUpdate();
                flag = true;



            }
            catch (Exception e){
                e.printStackTrace();
            }
            return flag;
        }
        public static boolean updateBooks(int bookID,String bookName,String bookType){
            boolean flag = false;
            try{
                Connection connection = Connector.createConnection();
                String query = "UPDATE books SET bookname = ?,booktype = ? WHERE id = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,bookName);
                ps.setString(2,bookType);
                ps.setInt(3,bookID);
                ps.executeUpdate();
                flag= true;


            }
            catch (Exception e){
                e.printStackTrace();
            }
            return flag;

        }

        public static boolean deleteBooks(int bookID) {
            boolean flag = false;
            try{
                Connection connection = Connector.createConnection();
                String query = "DELETE FROM books where id = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, bookID);
                statement.executeUpdate();
                flag = true;

            }
            catch (Exception e){
                e.printStackTrace();
            }
            return flag;
        }

        public static void displayBooks() {

            try {
                Connection connection = Connector.createConnection();
                //Connector is a class name ;
                String query = "SELECT * FROM books";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                System.err.println("Id  || "+"Book   ||  "+"Type");
                //Printing the resultSet
                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String type = resultSet.getString(3);
                    System.out.println(id+" || "+name+" || "+type);

                }

            }
            catch (Exception e){
                e.printStackTrace();
            }

        }


}
