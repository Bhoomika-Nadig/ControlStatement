package com.hibernate.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="mobiledetails")
@Entity//if we don't use,hibernate will not consider as entity
	

public class MobileEntity {
		
	@Id	//metadata
		@Column(name= "mobile_id")
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy="increment")
	 private int mobileId;

@Column//just mention column name
	
	(name="mobile_name")
	private String mobileName;

	@Column//just mention column name
	
	(name="mobile_brand")
	private String mobileBrand;

	@Column(name="mobile_network")
	private String mobilenetwork;

	public MobileEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileEntity(String mobileName, String mobileBrand, String mobilenetwork) {
		super();
		//this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileBrand = mobileBrand;
		this.mobilenetwork = mobilenetwork;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobilenetwork() {
		return mobilenetwork;
	}

	public void setMobilenetwork(String mobilenetwork) {
		this.mobilenetwork = mobilenetwork;
	}

	@Override
	public String toString() {
		return "MobileEntity [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileBrand=" + mobileBrand
				+ ", mobilenetwork=" + mobilenetwork + "]";
	}

	

	

}