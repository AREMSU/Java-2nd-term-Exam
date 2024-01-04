import products.TShirts;
import products.Order;
public class Main {
    public static void main(String[]args){
        String[] sizes = {"M", "L", "XL"};

        TShirts SaitamaShirt = new TShirts("Saitama Shirt", "111", 1500, "Kaser",
                "A double sided Saitama print shirt.", sizes);
        SaitamaShirt.display();

        TShirts BlueShirt = new TShirts("Blue Shirt", "222", 1000, "You n Me",
                "A absolutely normal full blue and plain shirt.", sizes);
        BlueShirt.display();

        TShirts FormalShirt = new TShirts("Formal Shirt", "333", 2000, "4MEN",
                "A amazing shirt for for formal wear and casual dressing.", sizes);
        FormalShirt.display();

        String[] orderItems = {"111", "222"};
        int[] orderPrices = {1500, 1000};
        Order aarnavOrder = new Order("Aarnav Dahal", "9860384809", orderItems, orderPrices);
        aarnavOrder.printBillWithVAT();
    }
}

