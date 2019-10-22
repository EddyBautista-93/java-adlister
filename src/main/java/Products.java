import models.Product;

import java.util.List;

public interface Products {

    List<Product> all(); // Gets all of the products record
    void insert(Product product); // persist new product to the database
}
