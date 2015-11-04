/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vidyayug.mobile.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MobileUserDetails}.
 * </p>
 *
 * @author MVIDYA
 * @see MobileUserDetails
 * @generated
 */
public class MobileUserDetailsWrapper implements MobileUserDetails,
	ModelWrapper<MobileUserDetails> {
	public MobileUserDetailsWrapper(MobileUserDetails mobileUserDetails) {
		_mobileUserDetails = mobileUserDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return MobileUserDetails.class;
	}

	@Override
	public String getModelClassName() {
		return MobileUserDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("email", getEmail());
		attributes.put("username", getUsername());
		attributes.put("password", getPassword());
		attributes.put("street", getStreet());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zipcode", getZipcode());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Long password = (Long)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String street = (String)attributes.get("street");

		if (street != null) {
			setStreet(street);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zipcode = (String)attributes.get("zipcode");

		if (zipcode != null) {
			setZipcode(zipcode);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this mobile user details.
	*
	* @return the primary key of this mobile user details
	*/
	@Override
	public long getPrimaryKey() {
		return _mobileUserDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mobile user details.
	*
	* @param primaryKey the primary key of this mobile user details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mobileUserDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this mobile user details.
	*
	* @return the user ID of this mobile user details
	*/
	@Override
	public long getUserId() {
		return _mobileUserDetails.getUserId();
	}

	/**
	* Sets the user ID of this mobile user details.
	*
	* @param userId the user ID of this mobile user details
	*/
	@Override
	public void setUserId(long userId) {
		_mobileUserDetails.setUserId(userId);
	}

	/**
	* Returns the user uuid of this mobile user details.
	*
	* @return the user uuid of this mobile user details
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobileUserDetails.getUserUuid();
	}

	/**
	* Sets the user uuid of this mobile user details.
	*
	* @param userUuid the user uuid of this mobile user details
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_mobileUserDetails.setUserUuid(userUuid);
	}

	/**
	* Returns the company ID of this mobile user details.
	*
	* @return the company ID of this mobile user details
	*/
	@Override
	public long getCompanyId() {
		return _mobileUserDetails.getCompanyId();
	}

	/**
	* Sets the company ID of this mobile user details.
	*
	* @param companyId the company ID of this mobile user details
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mobileUserDetails.setCompanyId(companyId);
	}

	/**
	* Returns the email of this mobile user details.
	*
	* @return the email of this mobile user details
	*/
	@Override
	public java.lang.String getEmail() {
		return _mobileUserDetails.getEmail();
	}

	/**
	* Sets the email of this mobile user details.
	*
	* @param email the email of this mobile user details
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_mobileUserDetails.setEmail(email);
	}

	/**
	* Returns the username of this mobile user details.
	*
	* @return the username of this mobile user details
	*/
	@Override
	public java.lang.String getUsername() {
		return _mobileUserDetails.getUsername();
	}

	/**
	* Sets the username of this mobile user details.
	*
	* @param username the username of this mobile user details
	*/
	@Override
	public void setUsername(java.lang.String username) {
		_mobileUserDetails.setUsername(username);
	}

	/**
	* Returns the password of this mobile user details.
	*
	* @return the password of this mobile user details
	*/
	@Override
	public long getPassword() {
		return _mobileUserDetails.getPassword();
	}

	/**
	* Sets the password of this mobile user details.
	*
	* @param password the password of this mobile user details
	*/
	@Override
	public void setPassword(long password) {
		_mobileUserDetails.setPassword(password);
	}

	/**
	* Returns the street of this mobile user details.
	*
	* @return the street of this mobile user details
	*/
	@Override
	public java.lang.String getStreet() {
		return _mobileUserDetails.getStreet();
	}

	/**
	* Sets the street of this mobile user details.
	*
	* @param street the street of this mobile user details
	*/
	@Override
	public void setStreet(java.lang.String street) {
		_mobileUserDetails.setStreet(street);
	}

	/**
	* Returns the city of this mobile user details.
	*
	* @return the city of this mobile user details
	*/
	@Override
	public java.lang.String getCity() {
		return _mobileUserDetails.getCity();
	}

	/**
	* Sets the city of this mobile user details.
	*
	* @param city the city of this mobile user details
	*/
	@Override
	public void setCity(java.lang.String city) {
		_mobileUserDetails.setCity(city);
	}

	/**
	* Returns the state of this mobile user details.
	*
	* @return the state of this mobile user details
	*/
	@Override
	public java.lang.String getState() {
		return _mobileUserDetails.getState();
	}

	/**
	* Sets the state of this mobile user details.
	*
	* @param state the state of this mobile user details
	*/
	@Override
	public void setState(java.lang.String state) {
		_mobileUserDetails.setState(state);
	}

	/**
	* Returns the zipcode of this mobile user details.
	*
	* @return the zipcode of this mobile user details
	*/
	@Override
	public java.lang.String getZipcode() {
		return _mobileUserDetails.getZipcode();
	}

	/**
	* Sets the zipcode of this mobile user details.
	*
	* @param zipcode the zipcode of this mobile user details
	*/
	@Override
	public void setZipcode(java.lang.String zipcode) {
		_mobileUserDetails.setZipcode(zipcode);
	}

	/**
	* Returns the phone number of this mobile user details.
	*
	* @return the phone number of this mobile user details
	*/
	@Override
	public java.lang.String getPhoneNumber() {
		return _mobileUserDetails.getPhoneNumber();
	}

	/**
	* Sets the phone number of this mobile user details.
	*
	* @param phoneNumber the phone number of this mobile user details
	*/
	@Override
	public void setPhoneNumber(java.lang.String phoneNumber) {
		_mobileUserDetails.setPhoneNumber(phoneNumber);
	}

	/**
	* Returns the create date of this mobile user details.
	*
	* @return the create date of this mobile user details
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _mobileUserDetails.getCreateDate();
	}

	/**
	* Sets the create date of this mobile user details.
	*
	* @param createDate the create date of this mobile user details
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_mobileUserDetails.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this mobile user details.
	*
	* @return the modified date of this mobile user details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _mobileUserDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this mobile user details.
	*
	* @param modifiedDate the modified date of this mobile user details
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_mobileUserDetails.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _mobileUserDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_mobileUserDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _mobileUserDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mobileUserDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _mobileUserDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _mobileUserDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mobileUserDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mobileUserDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_mobileUserDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_mobileUserDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mobileUserDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MobileUserDetailsWrapper((MobileUserDetails)_mobileUserDetails.clone());
	}

	@Override
	public int compareTo(
		com.vidyayug.mobile.model.MobileUserDetails mobileUserDetails) {
		return _mobileUserDetails.compareTo(mobileUserDetails);
	}

	@Override
	public int hashCode() {
		return _mobileUserDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vidyayug.mobile.model.MobileUserDetails> toCacheModel() {
		return _mobileUserDetails.toCacheModel();
	}

	@Override
	public com.vidyayug.mobile.model.MobileUserDetails toEscapedModel() {
		return new MobileUserDetailsWrapper(_mobileUserDetails.toEscapedModel());
	}

	@Override
	public com.vidyayug.mobile.model.MobileUserDetails toUnescapedModel() {
		return new MobileUserDetailsWrapper(_mobileUserDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mobileUserDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mobileUserDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mobileUserDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MobileUserDetailsWrapper)) {
			return false;
		}

		MobileUserDetailsWrapper mobileUserDetailsWrapper = (MobileUserDetailsWrapper)obj;

		if (Validator.equals(_mobileUserDetails,
					mobileUserDetailsWrapper._mobileUserDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MobileUserDetails getWrappedMobileUserDetails() {
		return _mobileUserDetails;
	}

	@Override
	public MobileUserDetails getWrappedModel() {
		return _mobileUserDetails;
	}

	@Override
	public void resetOriginalValues() {
		_mobileUserDetails.resetOriginalValues();
	}

	private MobileUserDetails _mobileUserDetails;
}