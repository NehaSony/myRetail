package com.vodafone.co.uk.model;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Comparator<Product> {

	@Id
	private int productId;
	private String produtName;
	private String type;
	private int quantity;
	private int price;
	private String description;
	// private List<String> colour;

	public Product(int productId, String produtName, String type, int quantity, int price, String description) {
		super();
		this.productId = productId;
		this.produtName = produtName;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	public Product() {
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the produtName
	 */
	public String getProdutName() {
		return produtName;
	}

	/**
	 * @param produtName
	 *            the produtName to set
	 */
	public void setProdutName(String produtName) {
		this.produtName = produtName;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + price;
		result = prime * result + productId;
		result = prime * result + ((produtName == null) ? 0 : produtName.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (price != other.price)
			return false;
		if (productId != other.productId)
			return false;
		if (produtName == null) {
			if (other.produtName != null)
				return false;
		} else if (!produtName.equals(other.produtName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", produtName=" + produtName + ", type=" + type + ", quantity="
				+ quantity + ", price=" + price + ", description=" + description + "]";
	}

	// @Override
	// public int compare(Product p1, Product p2) {
	// if(p1.getType().equalsIgnoreCase(p2.getType())){
	// return
	// Integer.valueOf(p1.getProductId()).compareTo(Integer.valueOf(p2.getProductId()));
	// }
	// else
	// return p1.getType().compareTo(p2.getType());
	// }
	//
	/*
	 * @Override public int compareTo(Product p) {
	 * 
	 * return this.getType().compareTo(p.getType()); }
	 */
	// @Override
	// public int compareTo(Product p) {
	//
	// if (this.getType().equalsIgnoreCase(p.getType())) {
	// return
	// Integer.valueOf(this.getProductId()).compareTo(Integer.valueOf(p.getProductId()));
	// } else
	// return this.getType().compareTo(p.getType());
	// }

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getType().compareTo(p2.getType());
	}

	public static Comparator<Product> compareByName = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			return p1.getProdutName().compareTo(p2.getProdutName());
		}
	};

	public static Comparator<Product> sortAndGroupProductByType = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			if (p1.getType().equalsIgnoreCase(p2.getType())) {
				return Integer.valueOf(p1.getProductId()).compareTo(Integer.valueOf(p2.getProductId()));
			} else
				return p1.getType().compareTo(p2.getType());
		}
	};
}
