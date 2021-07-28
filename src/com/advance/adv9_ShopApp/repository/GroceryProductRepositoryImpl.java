package com.advance.adv9_ShopApp.repository;
import com.advance.adv9_ShopApp.model.GroceryProduct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepository {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public GroceryProductRepositoryImpl() throws IOException {
        Path path = Paths.get("C:/Users/ACASA/IdeaProjects/curs_Java/src/groceries.csv");
        Files.lines(path)
                .skip(1)
                .filter(line -> line != null)
                .filter(line -> !line.isEmpty())
                .map(line -> {
                    try {
                        String[] arrayElem = line.split("\\|");
                        String id = arrayElem[0];
                        double price = Double.parseDouble(arrayElem[1]);
                        String currency = arrayElem[2];
                        String name = arrayElem[3];
                        String description = arrayElem[4];
                        Date expirationDate = DATE_FORMAT.parse(arrayElem[5]);
                        boolean isBio = Boolean.parseBoolean(arrayElem[6]);
                        String countryOfOrigin = arrayElem[7];

                        return new GroceryProduct(
                                expirationDate,
                                isBio,
                                countryOfOrigin,
                                id,
                                price,
                                currency,
                                name,
                                description
                        );
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(groceryProduct -> groceryProduct != null)
                .forEach(groceryProduct -> add(groceryProduct));

    }
}
