package lab3;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public Order() {
        this.setQtyOrdered(0);
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
        } else {
            this.itemsOrdered[this.qtyOrdered] = disc;
            this.qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean check = false;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i].equals(disc)) {
                for (int j = i; j < this.qtyOrdered - 2; j++) {
                    this.itemsOrdered[j] = this.itemsOrdered[j+1];
                }
                this.qtyOrdered -= 1;
                i -= 1;
                check = true;
            }
        }
        if (check) {
            System.out.println("The disc has been removed");
        } else {
            System.out.println("Disc not found");
        }
    }

    public float totalCost() {
        float res = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            res += this.itemsOrdered[i].getCost();
        }
        return res;
    }
}
