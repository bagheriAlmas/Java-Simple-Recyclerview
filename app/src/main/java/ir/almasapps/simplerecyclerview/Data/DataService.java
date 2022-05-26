package ir.almasapps.simplerecyclerview.Data;

import java.util.ArrayList;
import java.util.List;

import ir.almasapps.simplerecyclerview.R;
import ir.almasapps.simplerecyclerview.Model.User;

public class DataService {
    public List<User> getUsers(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Mahdi Bagheri","+989121234567", R.drawable.user1));
        list.add(new User("Ken Strickland","+989122345678", R.drawable.user2));
        list.add(new User("Yasin Mejia","+989123456789", R.drawable.user3));
        list.add(new User("Karim Tajdari","+989124567891", R.drawable.user4));
        list.add(new User("Glenn Palmer","+989125678912", R.drawable.user5));
        list.add(new User("Lola Alexander","+989126789123", R.drawable.user6));
        list.add(new User("Meghan Wise","+989126789123", R.drawable.user7));
        list.add(new User("Sharon Thornton","+989126789123", R.drawable.user8));
        list.add(new User("Haris Rossi","+989126789123", R.drawable.user9));
        list.add(new User("Tabitha Lawrence","+989126789123", R.drawable.user10));
        list.add(new User("Kyla Moghimi","+989126789123", R.drawable.user11));
        list.add(new User("Felicity Miles","+989126789123", R.drawable.user12));
        list.add(new User("Misha Berry","+989126789123", R.drawable.user13));
        list.add(new User("Jenna Tran","+989126789123", R.drawable.user14));
        list.add(new User("Jonah Newman","+989126789123", R.drawable.user15));

        return list;
    }
}
