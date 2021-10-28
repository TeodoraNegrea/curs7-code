package ro.fasttrackit.temacurs7;

public class BottleMain {
    public static void main(String[] args) {
        Bottle bottle = new Bottle( 5.5 , 4.8, false );
        System.out.println(bottle.bottleHasMoreLiquid());
        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.getEmptyCapacity());
        System.out.println(bottle.isOpen());
        System.out.println(bottle.isClosed());
        System.out.println(bottle.drinkAmountOfLiquid());
        bottle.close();
        bottle.drinkTooMuch();
        bottle.openedBottle();

    }
}
