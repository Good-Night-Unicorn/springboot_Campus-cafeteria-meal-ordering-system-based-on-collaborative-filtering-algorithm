package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 美食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-18 18:40:52
 */
@TableName("meishi")
public class MeishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeishiEntity() {
		
	}
	
	public MeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 店名
	 */
					
	private String name;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：店名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：店名
	 */
	public String getName() {
		return name;
	}
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
