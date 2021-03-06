package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "traveldb")
public class User implements java.io.Serializable {

	private Integer userId;
	private String name;
	private String lastName;
	private String email;
	private String status;
	private String password;
	private Set<OrderForm> orderForms = new HashSet<OrderForm>(0);
	private Set<ReviewCommand> reviewCommands = new HashSet<ReviewCommand>(0);
	private Set<Review> reviews = new HashSet<Review>(0);

	public User() {
	}

	public User(String name, String lastName, String email) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}

	public User(String name, String lastName, String email, String status, String password, Set<OrderForm> orderForms,
			Set<ReviewCommand> reviewCommands, Set<Review> reviews) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.status = status;
		this.password = password;
		this.orderForms = orderForms;
		this.reviewCommands = reviewCommands;
		this.reviews = reviews;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_name", nullable = false, length = 200)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status", length = 7)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_join_order_form", catalog = "traveldb", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "order_form_id", nullable = false, updatable = false) })
	public Set<OrderForm> getOrderForms() {
		return this.orderForms;
	}

	public void setOrderForms(Set<OrderForm> orderForms) {
		this.orderForms = orderForms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<ReviewCommand> getReviewCommands() {
		return this.reviewCommands;
	}

	public void setReviewCommands(Set<ReviewCommand> reviewCommands) {
		this.reviewCommands = reviewCommands;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

}
