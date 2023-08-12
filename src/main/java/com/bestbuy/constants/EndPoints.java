package com.bestbuy.constants;

/**
 * Created by Jay
 */
public class EndPoints {

    /**
     * This is Endpoints of bestbuy
     */

    public static final String CREATE_PRODUCTS = "/products";
    public static final String GET_PRODUCT_BY_ID = "/products/{productsID}";
    public static final String UPDATE_PRODUCT_BY_ID = "/products/{productsID}";
    public static final String DELETE_PRODUCT_BY_ID = "/products/{productsID}";

    /**
     * This is store Endpoints
     */


    public static final String CREATE_STORE = "/stores";
    public static final String GET_STORE_BY_ID = "/stores/{id}";
    public static final String UPDATE_STORE_BY_ID = "/stores/{id}";
    public static final String DELETE_STORE_BY_ID = "/stores/{id}";


}
