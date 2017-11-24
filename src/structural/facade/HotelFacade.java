package structural.facade;

public class HotelFacade {

    public Menus getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        return vegRestaurant.getMenus();
    }

    public Menus getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return nonVegRestaurant.getMenus();
    }

    public Menus getBothMenu(){
        BothVegNonVegRestaurant bothVegNonVegRestaurant = new BothVegNonVegRestaurant();
        return bothVegNonVegRestaurant.getMenus();
    }
}
