package com.beans;

public class Goods {
    private int goodsId;
    private String goodsName;
    private int costPrice;
    private int sellPrice;
    private String manufacturer;
    private int times;
    private int porfit;
    private int tradingNum;
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public int getPorfit() {
		return porfit;
	}
	public void setPorfit(int porfit) {
		this.porfit = porfit;
	}
	public int getTradingNum() {
		return tradingNum;
	}
	public void setTradingNum(int tradingNum) {
		this.tradingNum = tradingNum;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
    
}
