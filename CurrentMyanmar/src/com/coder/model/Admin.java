package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "traveldb")
public class Admin implements java.io.Serializable {

	private Integer adminId;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String status;
	private Set<Shop> shops = new HashSet<Shop>(0);
	private Set<AdminRole> adminRoles = new HashSet<AdminRole>(0);

	public Admin() {
	}

	public Admin(String name, String email, String password, String phone) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public Admin(String name, String email, String password, String phone, String status, Set<Shop> shops,
			Set<AdminRole> adminRoles) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.status = status;
		this.shops = shops;
		this.adminRoles = adminRoles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "admin_id", unique = true, nullable = false)
	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 120)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "phone", nullable = false, length = 50)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "status", length = 7)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "admin")
	public Set<Shop> getShops() {
		return this.shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "admin_join_role", catalog = "traveldb", joinColumns = {
			@JoinColumn(name = "admin_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set<AdminRole> getAdminRoles() {
		return this.adminRoles;
	}

	public void setAdminRoles(Set<AdminRole> adminRoles) {
		this.adminRoles = adminRoles;
	}

}
