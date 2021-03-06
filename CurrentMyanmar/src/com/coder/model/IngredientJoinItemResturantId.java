package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IngredientJoinItemResturantId generated by hbm2java
 */
@Embeddable
public class IngredientJoinItemResturantId implements java.io.Serializable {

	private int ingredientId;
	private int itemJoinStoreId;

	public IngredientJoinItemResturantId() {
	}

	public IngredientJoinItemResturantId(int ingredientId, int itemJoinStoreId) {
		this.ingredientId = ingredientId;
		this.itemJoinStoreId = itemJoinStoreId;
	}

	@Column(name = "ingredient_id", nullable = false)
	public int getIngredientId() {
		return this.ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Column(name = "item_join_store_id", nullable = false)
	public int getItemJoinStoreId() {
		return this.itemJoinStoreId;
	}

	public void setItemJoinStoreId(int itemJoinStoreId) {
		this.itemJoinStoreId = itemJoinStoreId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IngredientJoinItemResturantId))
			return false;
		IngredientJoinItemResturantId castOther = (IngredientJoinItemResturantId) other;

		return (this.getIngredientId() == castOther.getIngredientId())
				&& (this.getItemJoinStoreId() == castOther.getItemJoinStoreId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIngredientId();
		result = 37 * result + this.getItemJoinStoreId();
		return result;
	}

}
