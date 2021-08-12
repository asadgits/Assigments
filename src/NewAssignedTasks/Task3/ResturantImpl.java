package NewAssignedTasks.Task3;

import java.util.Arrays;
import java.util.HashMap;

public class ResturantImpl implements IResturant{

    private static final HashMap<String, Integer> priceList = new HashMap<>();

    ResturantImpl(){
        priceList.put("biryani", 200);
        priceList.put("pilao", 150);
        priceList.put("chicken", 100);
        priceList.put("beef", 200);
    }

    public Integer getTotal(String[] menuItems) {
        return Arrays.stream(menuItems).mapToInt(i -> (int)getPrice(i) ).sum();
    }

    public Integer getPrice(String dish){
        try {
            return priceList.get(dish);
        } catch (NullPointerException e) {
            throw new CustomNullPointer("\"ITEM NOT FOUND\"");
        }



       /* if(priceList.get(dish)!=null) {
            return priceList.get(dish);
        }else{
            try {
                throw new NullPointerException("\"ITEM NOT FOUND\"");
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }

        return priceList.get(dish);*/
    }

}
