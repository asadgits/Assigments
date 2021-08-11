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

    public Integer getTotal(String[] t1) {
        return Arrays.stream(t1).mapToInt(i -> (int)getPrice(i) ).sum();
    }

    public Object getPrice(String dish){

        try{
            if(this.priceList.get(dish).equals(null)){
                return this.priceList.get(dish);
                throw new  NullPointerException("\"ITEM NOT FOUND\"");
            };

        }catch(NullPointerException e){
            return "ITEM NOT FOUND";
        }

    }

}
