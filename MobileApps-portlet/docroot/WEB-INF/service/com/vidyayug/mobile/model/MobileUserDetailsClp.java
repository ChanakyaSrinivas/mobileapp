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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.vidyayug.mobile.service.ClpSerializer;
import com.vidyayug.mobile.service.MobileUserDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MVIDYA
 */
public class MobileUserDetailsClp extends BaseModelImpl<MobileUserDetails>
	implements MobileUserDetails {
	public MobileUserDetailsClp() {
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
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_mobileUserDetailsRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_mobileUserDetailsRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsername() {
		return _username;
	}

	@Override
	public void setUsername(String username) {
		_username = username;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUsername", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, username);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPassword() {
		return _password;
	}

	@Override
	public void setPassword(long password) {
		_password = password;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", long.class);

				method.invoke(_mobileUserDetailsRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStreet() {
		return _street;
	}

	@Override
	public void setStreet(String street) {
		_street = street;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setStreet", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, street);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity() {
		return _city;
	}

	@Override
	public void setCity(String city) {
		_city = city;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState() {
		return _state;
	}

	@Override
	public void setState(String state) {
		_state = state;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setState", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, state);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getZipcode() {
		return _zipcode;
	}

	@Override
	public void setZipcode(String zipcode) {
		_zipcode = zipcode;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setZipcode", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, zipcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhoneNumber() {
		return _phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneNumber", String.class);

				method.invoke(_mobileUserDetailsRemoteModel, phoneNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_mobileUserDetailsRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_mobileUserDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _mobileUserDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_mobileUserDetailsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMobileUserDetailsRemoteModel() {
		return _mobileUserDetailsRemoteModel;
	}

	public void setMobileUserDetailsRemoteModel(
		BaseModel<?> mobileUserDetailsRemoteModel) {
		_mobileUserDetailsRemoteModel = mobileUserDetailsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _mobileUserDetailsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_mobileUserDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MobileUserDetailsLocalServiceUtil.addMobileUserDetails(this);
		}
		else {
			MobileUserDetailsLocalServiceUtil.updateMobileUserDetails(this);
		}
	}

	@Override
	public MobileUserDetails toEscapedModel() {
		return (MobileUserDetails)ProxyUtil.newProxyInstance(MobileUserDetails.class.getClassLoader(),
			new Class[] { MobileUserDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MobileUserDetailsClp clone = new MobileUserDetailsClp();

		clone.setUserId(getUserId());
		clone.setCompanyId(getCompanyId());
		clone.setEmail(getEmail());
		clone.setUsername(getUsername());
		clone.setPassword(getPassword());
		clone.setStreet(getStreet());
		clone.setCity(getCity());
		clone.setState(getState());
		clone.setZipcode(getZipcode());
		clone.setPhoneNumber(getPhoneNumber());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(MobileUserDetails mobileUserDetails) {
		long primaryKey = mobileUserDetails.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MobileUserDetailsClp)) {
			return false;
		}

		MobileUserDetailsClp mobileUserDetails = (MobileUserDetailsClp)obj;

		long primaryKey = mobileUserDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", street=");
		sb.append(getStreet());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", zipcode=");
		sb.append(getZipcode());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.vidyayug.mobile.model.MobileUserDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street</column-name><column-value><![CDATA[");
		sb.append(getStreet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zipcode</column-name><column-value><![CDATA[");
		sb.append(getZipcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _mobileUserDetailsRemoteModel;
}