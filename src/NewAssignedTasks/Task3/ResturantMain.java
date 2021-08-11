package NewAssignedTasks.Task3;

import java.sql.SQLOutput;

public class ResturantMain {
    public static void main(String... args) {
        ResturantImpl resturant = new ResturantImpl();
        System.out.println(resturant.getTotal(args));

        }
    }
