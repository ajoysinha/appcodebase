/**
 * 
 */
package com.web.appmanagement.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 229338
 *
 */
public class SourceOfIncome implements Serializable {
	
	private static final long serialVersionUID = 29079705991479231L;
	private int id = 0;
	private String displayType = "";
	private String description = "";
	private String shortType = "";
	private Date updateDate = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShortType() {
		return shortType;
	}
	public void setShortType(String shortType) {
		this.shortType = shortType;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	
}
