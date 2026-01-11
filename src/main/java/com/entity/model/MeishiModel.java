package com.entity.model;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-18 18:40:52
 */
public class MeishiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String picture;
		
	/**
	 * 地址
	 */
	
	private String address;
		
	/**
	 * 评分
	 */
	
	private Double score;
		
	/**
	 * 人均
	 */
	
	private Double price;
		
	/**
	 * 点评数
	 */
	
	private Integer recommentcount;
		
	/**
	 * 来源
	 */
	
	private String laiyuan;
		
	/**
	 * 点评
	 */
	
	private String dianpin;
		
	/**
	 * 餐厅介绍
	 */
	
	private String description;
		
	/**
	 * 电话
	 */
	
	private String phone;
		
	/**
	 * 菜系
	 */
	
	private String caixi;
		
	/**
	 * 营业时间
	 */
	
	private String yinyetime;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：图片
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setScore(Double score) {
		this.score = score;
	}
	
	/**
	 * 获取：评分
	 */
	public Double getScore() {
		return score;
	}
				
	
	/**
	 * 设置：人均
	 */
	 
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * 获取：人均
	 */
	public Double getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：点评数
	 */
	 
	public void setRecommentcount(Integer recommentcount) {
		this.recommentcount = recommentcount;
	}
	
	/**
	 * 获取：点评数
	 */
	public Integer getRecommentcount() {
		return recommentcount;
	}
				
	
	/**
	 * 设置：来源
	 */
	 
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	
	/**
	 * 获取：来源
	 */
	public String getLaiyuan() {
		return laiyuan;
	}
				
	
	/**
	 * 设置：点评
	 */
	 
	public void setDianpin(String dianpin) {
		this.dianpin = dianpin;
	}
	
	/**
	 * 获取：点评
	 */
	public String getDianpin() {
		return dianpin;
	}
				
	
	/**
	 * 设置：餐厅介绍
	 */
	 
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 获取：餐厅介绍
	 */
	public String getDescription() {
		return description;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
				
	
	/**
	 * 设置：菜系
	 */
	 
	public void setCaixi(String caixi) {
		this.caixi = caixi;
	}
	
	/**
	 * 获取：菜系
	 */
	public String getCaixi() {
		return caixi;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYinyetime(String yinyetime) {
		this.yinyetime = yinyetime;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYinyetime() {
		return yinyetime;
	}
			
}
