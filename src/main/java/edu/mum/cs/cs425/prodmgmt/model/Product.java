package edu.mum.cs.cs425.prodmgmt.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Product {
private long pid;
private long productNumber;
private String name;
private float unitPrice;
private Date dateMfd;
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public long getProductNumber() {
	return productNumber;
}
public void setProductNumber(long productNumber) {
	this.productNumber = productNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(float unitPrice) {
	this.unitPrice = unitPrice;
}
public Date getDateMfd() {
	return dateMfd;
}
public void setDateMfd(Date dateMfd) {
	this.dateMfd = dateMfd;
}
public Product(long productNumber, String name, float unitPrice, Date dateMfd) {
	super();
	this.productNumber = productNumber;
	this.name = name;
	this.unitPrice = unitPrice;
	this.dateMfd = dateMfd;
}

}
