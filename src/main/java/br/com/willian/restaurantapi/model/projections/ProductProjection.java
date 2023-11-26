package br.com.willian.restaurantapi.model.projections;

import java.math.BigDecimal;

public interface ProductProjection {

    String getName();
    String getDetail();
    BigDecimal getPrice();
    String getCategory();
}
