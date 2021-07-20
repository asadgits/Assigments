package testInterfaceAndAbstractClass;

public interface Engine {

    //this method For Testing purpose
    //when 2 methods are same in 2 interfaces So What would be the Behaviour
    default void work() {
        return null;
    }

}
