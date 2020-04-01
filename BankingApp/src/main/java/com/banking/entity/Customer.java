package com.banking.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	
	  
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL,
			  fetch=FetchType.EAGER) Set<Account> accounts;	 
	
	public Customer(String name) {
		this.name=name;
	}
	public Customer(Long id,String name) {
		this.id=id;
		this.name=name;
	}

}
