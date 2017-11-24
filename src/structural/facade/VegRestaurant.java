package structural.facade;

public class VegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
