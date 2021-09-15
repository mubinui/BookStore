
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("📚 Welcome to BRACU Book Store 📚");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("=> PRESS 1 to ADD Books");
            System.out.println("=> Press 2 to UPDATE Books");
            System.out.println("=> PRESS 3 to DELETE Books");
            System.out.println("=> PRESS 4 to DISPLAY Books");
            System.out.println("=> PRESS 5 to EXIT the app");
            int c = Integer.parseInt(br.readLine());
            if (c == 1){
                //add books
                System.out.println("Enter Book ID");
                int bookID = Integer.parseInt(br.readLine());

                System.out.println("Enter Book Name ");
                String name = br.readLine();
                System.out.println("Enter Book Type ");
                String type = br.readLine();
                BookStore bs = new BookStore(bookID,name,type);
                boolean result = BookStoreDao.insertBooksToDB(bs);
                if(result){
                    System.out.println(" => Book is successfully added ");
                }
                else {
                    System.out.println("=>Something went wrong ");
                }
                System.out.println(bs);


            }
            if (c == 2) {
                //Update books
                System.out.println("Enter Book ID");
                int bookID = Integer.parseInt(br.readLine());

                System.out.println("Enter Book Name ");
                String name = br.readLine();
                System.out.println("Enter Book Type ");
                String type = br.readLine();
                boolean result = BookStoreDao.updateBooks(bookID,name,type);
                if (result) {
                    System.out.println(" => Book is successfully updated ");
                } else {
                    System.out.println("=>Something went wrong ");
                }

            }
            else if (c == 3){
                //delete books..
                System.out.println("=> Enter BookID to delete");
                int bookID= Integer.parseInt(br.readLine());
                boolean flag =BookStoreDao.deleteBooks(bookID);
                if(flag){
                    System.out.println("=> Deleted Successfully");
                }
                else{
                    System.out.println("=> Id not found ");
                }

            }
            else if (c == 4){
                //display student..
                BookStoreDao.displayBooks();

            }
            else if (c == 5){
                //Exit
                break;
            }
            else{

            }
        }
        System.out.println(" =>Thank for Comming To our Book Store  ! ");
        System.out.println(" =>See you soon !");
    }

}
