package products;

public class Order {
    private String name;
    private String phoneNumber;
    private String[] itemCodes;
    private int[] itemPrices;

    public Order(String name, String phoneNumber, String[] itemCodes, int[] itemPrices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.itemCodes = itemCodes;
        this.itemPrices = itemPrices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getItemCodes() {
        return itemCodes;
    }

    public void setItemCodes(String[] itemCodes) {
        this.itemCodes = itemCodes;
    }

    public int[] getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(int[] itemPrices) {
        this.itemPrices = itemPrices;
    }

    public void printBillWithVAT() {
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + arrayToString(itemCodes));
        System.out.println("Prices: " + arrayToString(itemPrices));
        System.out.println();

        int total = 0;
        for (double price : itemPrices) {
            total += price;
        }

        double vat = 0.13 * total;

        System.out.println("Bill with VAT (13%):");
        System.out.println("Total: $" + total);
        System.out.println("VAT (13%): $" + vat);
        System.out.println("Grand Total: $" + (total + vat));
    }

    private String arrayToString(String[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    private String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

