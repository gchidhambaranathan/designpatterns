package structural.facade;

public class FacadeTest {

    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();
        hotelFacade.getVegMenu();
        hotelFacade.getNonVegMenu();
        hotelFacade.getBothMenu();
    }
}
