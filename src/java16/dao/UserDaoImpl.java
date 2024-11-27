package java16.dao;

import java16.db.DataBase;
import java16.models.User;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UserDaoImpl implements UserDao{

    private final DataBase dataBase = new DataBase();

    private final Scanner scannerStr = new Scanner(System.in);

    private final Scanner scannerInt = new Scanner(System.in);



    @Override
    public void register(User newUser) {

        dataBase.users = Arrays.copyOf(dataBase.users, dataBase.users.length + 1);

        dataBase.users[dataBase.users.length - 1] = newUser;



            try {
                System.out.println("write gmail :  ");
                String gmail = scannerStr.nextLine();


                System.out.println("write passwors :  ");

                String password = scannerStr.nextLine();


                boolean isbloc = false;
                for (User user : dataBase.users) {
                    if (user.getGmail().equals(gmail)

                    && user.getPassword().equals(password) ){
                        isbloc = true;
                        System.out.println("Hello" + user.getUserName() + "welcome to java 16 ev");
                        break;

                    }
                }
                if (!isbloc) {
                    throw new RuntimeException("not found this user ");

                }

            }catch (Exception e ){
                System.out.println(e.getMessage());
            }
        }

    @Override
    public void Login() {

    }
}




