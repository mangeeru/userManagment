package com.immortal.sol.user.mangt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BaseEntity {
	
	@Column(name = "create_by")
	private String createdBy;
	@Column(name = "modify_by")
	private String modifyBy;
	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "entity_id")
	private String entityId;//client id or entity id to belongs
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseEntity [createdBy=");
		builder.append(createdBy);
		builder.append(", modifyBy=");
		builder.append(modifyBy);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", modifyDate=");
		builder.append(modifyDate);
		builder.append("]");
		return builder.toString();
	}

}
