package structural.facade;

public class BothVegNonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        Both both = new Both();
        return both;
    }
}
