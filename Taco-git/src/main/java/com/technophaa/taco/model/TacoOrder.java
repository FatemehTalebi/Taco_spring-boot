package com.technophaa.taco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Entity
public class TacoOrder  implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	
	 private String deliveryName;
	 private String deliveryStreet;
	 private String deliveryCity;
	 private String deliveryState;
	 private String deliveryZip;
	 private String ccNumber;
	 private String ccExpiration;
	 private String ccCVV;
	 @OneToMany(cascade = CascadeType.ALL)
	 private List<Taco> tacos = new ArrayList<>();
	 

	 @Override
	public String toString() {
		return "RacoOrder [deliveryName=" + deliveryName + ", deliveryStreet=" + deliveryStreet + ", deliveryCity="
				+ deliveryCity + ", deliveryState=" + deliveryState + ", deliveryZip=" + deliveryZip + ", ccNumber="
				+ ccNumber + ", ccExpiration=" + ccExpiration + ", ccCVV=" + ccCVV + ", tacos=" + tacos + "]";
	}



	public String getDeliveryName() {
		return deliveryName;
	}



	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}



	public String getDeliveryStreet() {
		return deliveryStreet;
	}



	public void setDeliveryStreet(String deliveryStreet) {
		this.deliveryStreet = deliveryStreet;
	}



	public String getDeliveryCity() {
		return deliveryCity;
	}



	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}



	public String getDeliveryState() {
		return deliveryState;
	}



	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}



	public String getDeliveryZip() {
		return deliveryZip;
	}



	public void setDeliveryZip(String deliveryZip) {
		this.deliveryZip = deliveryZip;
	}



	public String getCcNumber() {
		return ccNumber;
	}



	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}



	public String getCcExpiration() {
		return ccExpiration;
	}



	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}



	public String getCcCVV() {
		return ccCVV;
	}



	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}



	public List<Taco> getTacos() {
		return tacos;
	}



	public void setTacos(List<Taco> tacos) {
		this.tacos = tacos;
	}



	public TacoOrder(String deliveryName, String deliveryStreet, String deliveryCity, String deliveryState,
			String deliveryZip, String ccNumber, String ccExpiration, String ccCVV, List<Taco> tacos) {
		super();
		this.deliveryName = deliveryName;
		this.deliveryStreet = deliveryStreet;
		this.deliveryCity = deliveryCity;
		this.deliveryState = deliveryState;
		this.deliveryZip = deliveryZip;
		this.ccNumber = ccNumber;
		this.ccExpiration = ccExpiration;
		this.ccCVV = ccCVV;
		this.tacos = tacos;
	}



	public TacoOrder() {
		super();
	}



	public void addTaco(Taco taco) {
	 this.tacos.add(taco);
	 }
	 
}
