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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vidyayug.mobile.service.http.MobileUserDetailsServiceSoap}.
 *
 * @author MVIDYA
 * @see com.vidyayug.mobile.service.http.MobileUserDetailsServiceSoap
 * @generated
 */
public class MobileUserDetailsSoap implements Serializable {
	public static MobileUserDetailsSoap toSoapModel(MobileUserDetails model) {
		MobileUserDetailsSoap soapModel = new MobileUserDetailsSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setEmail(model.getEmail());
		soapModel.setUsername(model.getUsername());
		soapModel.setPassword(model.getPassword());
		soapModel.setStreet(model.getStreet());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setZipcode(model.getZipcode());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static MobileUserDetailsSoap[] toSoapModels(
		MobileUserDetails[] models) {
		MobileUserDetailsSoap[] soapModels = new MobileUserDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MobileUserDetailsSoap[][] toSoapModels(
		MobileUserDetails[][] models) {
		MobileUserDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MobileUserDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MobileUserDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MobileUserDetailsSoap[] toSoapModels(
		List<MobileUserDetails> models) {
		List<MobileUserDetailsSoap> soapModels = new ArrayList<MobileUserDetailsSoap>(models.size());

		for (MobileUserDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MobileUserDetailsSoap[soapModels.size()]);
	}

	public MobileUserDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public long getPassword() {
		return _password;
	}

	public void setPassword(long password) {
		_password = password;
	}

	public String getStreet() {
		return _street;
	}

	public void setStreet(String street) {
		_street = street;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getZipcode() {
		return _zipcode;
	}

	public void setZipcode(String zipcode) {
		_zipcode = zipcode;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _userId;
	private long _companyId;
	private String _email;
	private String _username;
	private long _password;
	private String _street;
	private String _city;
	private String _state;
	private String _zipcode;
	private String _phoneNumber;
	private Date _createDate;
	private Date _modifiedDate;
}