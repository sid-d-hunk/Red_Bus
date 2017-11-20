package com.sid.dto;

import java.util.List;

public class BusdetailsDTO {
private String busNo;
private String busName;	
private boolean isAc;
private boolean isVolvo;
private boolean isBustype;
private boolean isHalt;
private boolean isFood;
private boolean isCancellationpolicy;
private boolean isAmenities;
private List<Integer> seatAvailibityList;
private boolean isSeparetladiesseat;
private String support;
private  boolean smsAlert;
public String getBusNo() {
	return busNo;
}
public void setBusNo(String busNo) {
	this.busNo = busNo;
}
public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public List<Integer> getSeatAvailibityList() {
	return seatAvailibityList;
}
public void setSeatAvailibityList(List<Integer> seatAvailibityList) {
	this.seatAvailibityList = seatAvailibityList;
}
public boolean isSmsAlert() {
	return smsAlert;
}
public void setSmsAlert(boolean smsAlert) {
	this.smsAlert = smsAlert;
}
public boolean isAc() {
	return isAc;
}
public void setAc(boolean isAc) {
	this.isAc = isAc;
}
public boolean isVolvo() {
	return isVolvo;
}
public void setVolvo(boolean isVolvo) {
	this.isVolvo = isVolvo;
}
public boolean isBustype() {
	return isBustype;
}
public void setBustype(boolean isBustype) {
	this.isBustype = isBustype;
}
public boolean isHalt() {
	return isHalt;
}
public void setHalt(boolean isHalt) {
	this.isHalt = isHalt;
}
public boolean isDinner() {
	return isFood;
}
public void setDinner(boolean isDinner) {
	this.isFood = isDinner;
}
public boolean isCancellationpolicy() {
	return isCancellationpolicy;
}
public void setCancellationpolicy(boolean isCancellationpolicy) {
	this.isCancellationpolicy = isCancellationpolicy;
}
public boolean isAmenities() {
	return isAmenities;
}
public void setAmenities(boolean isAmenities) {
	this.isAmenities = isAmenities;
}

public boolean isFood() {
	return isFood;
}
public void setFood(boolean isFood) {
	this.isFood = isFood;
}
public List<Integer> getNumSeatavailibityList() {
	return seatAvailibityList;
}
public void setNumSeatavailibityList(List<Integer> numSeatavailibityList) {
	this.seatAvailibityList = numSeatavailibityList;
}
public boolean isSeparetladiesseat() {
	return isSeparetladiesseat;
}
public void setSeparetladiesseat(boolean isSeparetladiesseat) {
	this.isSeparetladiesseat = isSeparetladiesseat;
}
public String getSupport() {
	return support;
}
public void setSupport(String support) {
	support = support;
}
public boolean isSmsalert() {
	return smsAlert;
}
public void setSmsalert(boolean smsalert) {
	smsalert = smsalert;
}

}
