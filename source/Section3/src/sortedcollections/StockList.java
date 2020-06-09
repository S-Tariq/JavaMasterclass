package sortedcollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> stockList;

    public StockList() {
        this.stockList = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            // Check if there is quantity of this item.
            StockItem inStock = stockList.getOrDefault(item.getName(), item);
            // If the stock exists then adjust the quantity.
            if(inStock != item){
                item.adjustStock(inStock.availableQuantity());
            }

            // Another way:
//            StockItem inStock = stockList.get(item.getName());
//            if(inStock != null){
//                item.adjustStock(inStock.availableQuantity());
//            }

            stockList.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){

        StockItem inStock = stockList.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.finaliseStock(quantity);
        }
        return 0;

        // Older implementation:
//        StockItem inStock = stockList.getOrDefault(item, null);
//
//        if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0)){
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;
    }

    public int reserveStock(String item, int quantity){
        StockItem inStock = stockList.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity){
        StockItem inStock = stockList.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key){
        return stockList.get(key);
    }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : stockList.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : stockList.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s += stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            s += String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value: " + String.format("%.2f", totalCost);
    }
}
