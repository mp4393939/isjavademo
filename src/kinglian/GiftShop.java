package kinglian;

public class GiftShop extends Storefront {

    public static void main(String[] arguments) {
        Storefront store = new Storefront();
        store.addItem("CO1", "MUG", "9.99", "150");
        store.addItem("CO2", "LG MUG", "12.99", "82");
        store.addItem("CO3", "MOUSEPAD", "10.49", "800");
        store.addItem("DO1", "T SHIRT", "16.99", "90");
        store.sort();
        for (int i = 0; i < store.getSize(); i++) {
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem ID:" + show.getId() + "\nName:" +
                    show.getName() + "\nRetail Price:$" + show.getprice() +
                    "\nPrice:$" + show.getprice() + "\nQuantity:" + show.getQuantity());

        }

    }

}
