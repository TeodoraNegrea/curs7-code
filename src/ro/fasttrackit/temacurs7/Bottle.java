package ro.fasttrackit.temacurs7;

import java.util.Random;
import java.util.Scanner;

public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(double totalCapacity, double availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean bottleHasMoreLiquid() {
        if (availableLiquid < totalCapacity) {
            return false;
        } else {
            return true;
        }
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        double emptyCapacity = totalCapacity - availableLiquid;
        if (totalCapacity > availableLiquid) {

        }
        return emptyCapacity;
    }

    public String isOpen() {
        if (!this.open) {
        }
        return "The bottle is opened";
    }

    public String isClosed() {
        if (this.open) {
        }
        return "The bottle is closed";
    }

    public String drinkAmountOfLiquid() {
        Random random = new Random();
        int aPartOfLiquid = random.nextInt();
        if (totalCapacity < availableLiquid) {
        }
        return aPartOfLiquid + " You drink a lot";
    }

    public void close() {
        if (!this.open) {
            System.out.println("The bottle is closed");
        } else {
            this.open = false;
        }
    }

    public void drinkTooMuch() {
        if (availableLiquid < totalCapacity) {
            System.out.println("There is no more water!");
        } else {
            System.out.println("You can drink. You still have a little water!");
        }
    }

    public void openedBottle() {
        if (this.open) {
            System.out.println("The bottle is open");
        } else {
            this.open = true;
        }
    }
}