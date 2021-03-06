package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemJoinLanguageId generated by hbm2java
 */
@Embeddable
public class ItemJoinLanguageId implements java.io.Serializable {

	private int itemId;
	private int languageId;

	public ItemJoinLanguageId() {
	}

	public ItemJoinLanguageId(int itemId, int languageId) {
		this.itemId = itemId;
		this.languageId = languageId;
	}

	@Column(name = "item_id", nullable = false)
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Column(name = "language_id", nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemJoinLanguageId))
			return false;
		ItemJoinLanguageId castOther = (ItemJoinLanguageId) other;

		return (this.getItemId() == castOther.getItemId()) && (this.getLanguageId() == castOther.getLanguageId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getItemId();
		result = 37 * result + this.getLanguageId();
		return result;
	}

}
