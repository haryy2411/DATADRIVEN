package com.blazeecommerce;


public class POM {
private Store_login_pojo store_login_pojo;
private Addcart addcart;
private PlaceOrder_pojo placeOrder_pojo;

public Store_login_pojo getStore_login_pojo() {
	return (store_login_pojo==null)?store_login_pojo= new Store_login_pojo(): store_login_pojo;
}
public Addcart getAddcart() {
	return (addcart==null)?addcart =new Addcart(): addcart;
}
public PlaceOrder_pojo getPlaceOrder_pojo() {
	return (placeOrder_pojo==null)?placeOrder_pojo= new PlaceOrder_pojo(): placeOrder_pojo;
}



}
