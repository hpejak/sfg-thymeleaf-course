package hr.pejak.sfgthymeleafcourse.service;


import hr.pejak.sfgthymeleafcourse.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
