package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cart")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Cart {
	
	public int id;
	public int user_id;
	@Id
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id" ,strategy = "native")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="user_id")
	public int getU() {
		return user_id;
	}
	public void setU(int user_id) {
		this.user_id = user_id;
	}
	
}
