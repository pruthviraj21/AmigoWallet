package com.infy.amigoWallet.entity;

public class Merchant {
private String name;
private String type;
private int value;
public Merchant() {
	super();
	// TODO Auto-generated constructor stub
}
public Merchant(String name, String type, int value) {
	super();
	this.name = name;
	this.type = type;
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "Merchant [name=" + name + ", type=" + type + ", value=" + value + "]";
}

}
