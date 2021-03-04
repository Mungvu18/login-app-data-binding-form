package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User("john","123456","John","john@gmail.com",18));
        users.add(new User("minh","123456","Minh","minh@gmail.com",18));
        users.add(new User("hoang","123456","Hoang","hoang@gmail.com",18));
        users.add(new User("linh","123456","Linh","linh@gmail.com",18));
        users.add(new User("kien","123456","Kien","kien@gmail.com",18));
    }
    public static User checkLogin(Login login){
        for (User u: users){
            if(login.getAccount().equals(u.getAccount())&&login.getPassword().equals(u.getPassword())){
                return u;
            }
        }
        return null;
    }
}
