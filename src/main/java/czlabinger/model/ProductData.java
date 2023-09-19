package czlabinger.model;

import java.util.ArrayList;
import java.util.Random;

public class ProductData {

    private ArrayList<Product> product;

    public ProductData() {
        int r = new Random().nextInt(6) + 4;

		this.product = new ArrayList<Product>();

		for(int i = 0; i < r; i++) {
			this.product.add(new Product());
		}
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public ArrayList<Product> getProduct() {
        return this.product;
    }


}
