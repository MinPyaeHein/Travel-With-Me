package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

/**
 * TimeTableId generated by hbm2java
 */
@Embeddable
public class TimeTableId implements java.io.Serializable {

	private int shopId;
	private int dayId;

	public TimeTableId() {
	}

	public TimeTableId(int shopId, int dayId) {
		this.shopId = shopId;
		this.dayId = dayId;
	}
	
	@Column(name = "shop_id", nullable = false)
	public int getShopId() {
		return this.shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	@Column(name = "day_id", nullable = false)
	public int getDayId() {
		return this.dayId;
	}

	public void setDayId(int dayId) {
		this.dayId = dayId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TimeTableId))
			return false;
		TimeTableId castOther = (TimeTableId) other;

		return (this.getShopId() == castOther.getShopId()) && (this.getDayId() == castOther.getDayId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getShopId();
		result = 37 * result + this.getDayId();
		return result;
	}

}
