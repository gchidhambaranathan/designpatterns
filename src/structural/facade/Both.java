package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Both implements Menus {
    List<Item> items = new ArrayList<>();
    static {
        //add needed items;
    }
    @Override
    public List<Item> getItems() {

        return items;
    }
}
