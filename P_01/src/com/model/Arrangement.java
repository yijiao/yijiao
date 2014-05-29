package com.model;

import java.util.Date;

//布局调整
public class Arrangement {
	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	//小学
	
	//新建校点(含教学点)数:城镇
	private int priNewCity;
	//新建校点(含教学点)数:县镇
	private int priNewDistrict;
	//新建校点(含教学点)数:农村
	private int priNewVillage;
	//撤并校（含教学点）数:城镇
	private int priMergeCity;
	//撤并校（含教学点）数:县镇
	private int priMergeDistrict;
	//撤并校（含教学点）数:农村
	private int priMergeVillage;
	//恢复校点数
	private int priRecover;
	//班级数(总数量)
	private int priTotal;
	//班级数(46-55人)
	private int priF2f;
	//班级数(56人以上) fifty to more
	private int priF2m;
	//大班比例
	private float priScale;
	//超大班比例
	private float priSuperScale;
	
	//初中
	
	//新建校点(含教学点)数:城镇
	private int middleNewCity;
	//新建校点(含教学点)数:县镇
	private int middleNewDistrict;
	//新建校点(含教学点)数:农村
	private int middleNewVillage;
	//撤并校（含教学点）数:城镇
	private int middleMergeCity;
	//撤并校（含教学点）数:县镇
	private int middleMergeDistrict;
	//撤并校（含教学点）数:农村
	private int middleMergeVillage;
	//恢复校点数
	private int middleRecover;
	//班级数(总数量)
	private int middleTotal;
	//班级数(46-55人)
	private int middleF2f;
	//班级数(56人以上) fifty to more
	private int middleF2m;
	//大班比例
	private float middleScale;
	//超大班比例
	private float middleSuperScale;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public int getPriNewCity() {
		return priNewCity;
	}
	public void setPriNewCity(int priNewCity) {
		this.priNewCity = priNewCity;
	}
	public int getPriNewDistrict() {
		return priNewDistrict;
	}
	public void setPriNewDistrict(int priNewDistrict) {
		this.priNewDistrict = priNewDistrict;
	}
	public int getPriNewVillage() {
		return priNewVillage;
	}
	public void setPriNewVillage(int priNewVillage) {
		this.priNewVillage = priNewVillage;
	}
	public int getPriMergeCity() {
		return priMergeCity;
	}
	public void setPriMergeCity(int priMergeCity) {
		this.priMergeCity = priMergeCity;
	}
	public int getPriMergeDistrict() {
		return priMergeDistrict;
	}
	public void setPriMergeDistrict(int priMergeDistrict) {
		this.priMergeDistrict = priMergeDistrict;
	}
	public int getPriMergeVillage() {
		return priMergeVillage;
	}
	public void setPriMergeVillage(int priMergeVillage) {
		this.priMergeVillage = priMergeVillage;
	}
	public int getPriRecover() {
		return priRecover;
	}
	public void setPriRecover(int priRecover) {
		this.priRecover = priRecover;
	}
	public int getPriTotal() {
		return priTotal;
	}
	public void setPriTotal(int priTotal) {
		this.priTotal = priTotal;
	}
	public int getPriF2f() {
		return priF2f;
	}
	public void setPriF2f(int priF2f) {
		this.priF2f = priF2f;
	}
	public int getPriF2m() {
		return priF2m;
	}
	public void setPriF2m(int priF2m) {
		this.priF2m = priF2m;
	}
	public float getPriScale() {
		return priScale;
	}
	public void setPriScale(float priScale) {
		this.priScale = priScale;
	}
	public float getPriSuperScale() {
		return priSuperScale;
	}
	public void setPriSuperScale(float priSuperScale) {
		this.priSuperScale = priSuperScale;
	}
	public int getMiddleNewCity() {
		return middleNewCity;
	}
	public void setMiddleNewCity(int middleNewCity) {
		this.middleNewCity = middleNewCity;
	}
	public int getMiddleNewDistrict() {
		return middleNewDistrict;
	}
	public void setMiddleNewDistrict(int middleNewDistrict) {
		this.middleNewDistrict = middleNewDistrict;
	}
	public int getMiddleNewVillage() {
		return middleNewVillage;
	}
	public void setMiddleNewVillage(int middleNewVillage) {
		this.middleNewVillage = middleNewVillage;
	}
	public int getMiddleMergeCity() {
		return middleMergeCity;
	}
	public void setMiddleMergeCity(int middleMergeCity) {
		this.middleMergeCity = middleMergeCity;
	}
	public int getMiddleMergeDistrict() {
		return middleMergeDistrict;
	}
	public void setMiddleMergeDistrict(int middleMergeDistrict) {
		this.middleMergeDistrict = middleMergeDistrict;
	}
	public int getMiddleMergeVillage() {
		return middleMergeVillage;
	}
	public void setMiddleMergeVillage(int middleMergeVillage) {
		this.middleMergeVillage = middleMergeVillage;
	}
	public int getMiddleRecover() {
		return middleRecover;
	}
	public void setMiddleRecover(int middleRecover) {
		this.middleRecover = middleRecover;
	}
	public int getMiddleTotal() {
		return middleTotal;
	}
	public void setMiddleTotal(int middleTotal) {
		this.middleTotal = middleTotal;
	}
	public int getMiddleF2f() {
		return middleF2f;
	}
	public void setMiddleF2f(int middleF2f) {
		this.middleF2f = middleF2f;
	}
	public int getMiddleF2m() {
		return middleF2m;
	}
	public void setMiddleF2m(int middleF2m) {
		this.middleF2m = middleF2m;
	}
	public float getMiddleScale() {
		return middleScale;
	}
	public void setMiddleScale(float middleScale) {
		this.middleScale = middleScale;
	}
	public float getMiddleSuperScale() {
		return middleSuperScale;
	}
	public void setMiddleSuperScale(float middleSuperScale) {
		this.middleSuperScale = middleSuperScale;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
