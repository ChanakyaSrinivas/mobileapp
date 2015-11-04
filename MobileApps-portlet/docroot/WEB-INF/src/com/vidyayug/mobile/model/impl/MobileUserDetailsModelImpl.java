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

package com.vidyayug.mobile.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vidyayug.mobile.model.MobileUserDetails;
import com.vidyayug.mobile.model.MobileUserDetailsModel;
import com.vidyayug.mobile.model.MobileUserDetailsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MobileUserDetails service. Represents a row in the &quot;Mobile_userdetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vidyayug.mobile.model.MobileUserDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MobileUserDetailsImpl}.
 * </p>
 *
 * @author MVIDYA
 * @see MobileUserDetailsImpl
 * @see com.vidyayug.mobile.model.MobileUserDetails
 * @see com.vidyayug.mobile.model.MobileUserDetailsModel
 * @generated
 */
@JSON(strict = true)
public class MobileUserDetailsModelImpl extends BaseModelImpl<MobileUserDetails>
	implements MobileUserDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mobile user details model instance should use the {@link com.vidyayug.mobile.model.MobileUserDetails} interface instead.
	 */
	public static final String TABLE_NAME = "Mobile_userdetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "email", Types.VARCHAR },
			{ "username", Types.VARCHAR },
			{ "password_", Types.BIGINT },
			{ "street", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "zipcode", Types.VARCHAR },
			{ "phoneNumber", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Mobile_userdetails (userId LONG not null primary key,companyId LONG,email VARCHAR(75) null,username VARCHAR(75) null,password_ LONG,street VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,zipcode VARCHAR(75) null,phoneNumber VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Mobile_userdetails";
	public static final String ORDER_BY_JPQL = " ORDER BY mobileUserDetails.userId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Mobile_userdetails.userId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vidyayug.mobile.model.MobileUserDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vidyayug.mobile.model.MobileUserDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MobileUserDetails toModel(MobileUserDetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MobileUserDetails model = new MobileUserDetailsImpl();

		model.setUserId(soapModel.getUserId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setEmail(soapModel.getEmail());
		model.setUsername(soapModel.getUsername());
		model.setPassword(soapModel.getPassword());
		model.setStreet(soapModel.getStreet());
		model.setCity(soapModel.getCity());
		model.setState(soapModel.getState());
		model.setZipcode(soapModel.getZipcode());
		model.setPhoneNumber(soapModel.getPhoneNumber());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MobileUserDetails> toModels(
		MobileUserDetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MobileUserDetails> models = new ArrayList<MobileUserDetails>(soapModels.length);

		for (MobileUserDetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vidyayug.mobile.model.MobileUserDetails"));

	public MobileUserDetailsModelImpl() {
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

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public String getUsername() {
		if (_username == null) {
			return StringPool.BLANK;
		}
		else {
			return _username;
		}
	}

	@Override
	public void setUsername(String username) {
		_username = username;
	}

	@JSON
	@Override
	public long getPassword() {
		return _password;
	}

	@Override
	public void setPassword(long password) {
		_password = password;
	}

	@JSON
	@Override
	public String getStreet() {
		if (_street == null) {
			return StringPool.BLANK;
		}
		else {
			return _street;
		}
	}

	@Override
	public void setStreet(String street) {
		_street = street;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getZipcode() {
		if (_zipcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _zipcode;
		}
	}

	@Override
	public void setZipcode(String zipcode) {
		_zipcode = zipcode;
	}

	@JSON
	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			MobileUserDetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MobileUserDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MobileUserDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MobileUserDetailsImpl mobileUserDetailsImpl = new MobileUserDetailsImpl();

		mobileUserDetailsImpl.setUserId(getUserId());
		mobileUserDetailsImpl.setCompanyId(getCompanyId());
		mobileUserDetailsImpl.setEmail(getEmail());
		mobileUserDetailsImpl.setUsername(getUsername());
		mobileUserDetailsImpl.setPassword(getPassword());
		mobileUserDetailsImpl.setStreet(getStreet());
		mobileUserDetailsImpl.setCity(getCity());
		mobileUserDetailsImpl.setState(getState());
		mobileUserDetailsImpl.setZipcode(getZipcode());
		mobileUserDetailsImpl.setPhoneNumber(getPhoneNumber());
		mobileUserDetailsImpl.setCreateDate(getCreateDate());
		mobileUserDetailsImpl.setModifiedDate(getModifiedDate());

		mobileUserDetailsImpl.resetOriginalValues();

		return mobileUserDetailsImpl;
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

		if (!(obj instanceof MobileUserDetails)) {
			return false;
		}

		MobileUserDetails mobileUserDetails = (MobileUserDetails)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<MobileUserDetails> toCacheModel() {
		MobileUserDetailsCacheModel mobileUserDetailsCacheModel = new MobileUserDetailsCacheModel();

		mobileUserDetailsCacheModel.userId = getUserId();

		mobileUserDetailsCacheModel.companyId = getCompanyId();

		mobileUserDetailsCacheModel.email = getEmail();

		String email = mobileUserDetailsCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			mobileUserDetailsCacheModel.email = null;
		}

		mobileUserDetailsCacheModel.username = getUsername();

		String username = mobileUserDetailsCacheModel.username;

		if ((username != null) && (username.length() == 0)) {
			mobileUserDetailsCacheModel.username = null;
		}

		mobileUserDetailsCacheModel.password = getPassword();

		mobileUserDetailsCacheModel.street = getStreet();

		String street = mobileUserDetailsCacheModel.street;

		if ((street != null) && (street.length() == 0)) {
			mobileUserDetailsCacheModel.street = null;
		}

		mobileUserDetailsCacheModel.city = getCity();

		String city = mobileUserDetailsCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			mobileUserDetailsCacheModel.city = null;
		}

		mobileUserDetailsCacheModel.state = getState();

		String state = mobileUserDetailsCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			mobileUserDetailsCacheModel.state = null;
		}

		mobileUserDetailsCacheModel.zipcode = getZipcode();

		String zipcode = mobileUserDetailsCacheModel.zipcode;

		if ((zipcode != null) && (zipcode.length() == 0)) {
			mobileUserDetailsCacheModel.zipcode = null;
		}

		mobileUserDetailsCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = mobileUserDetailsCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			mobileUserDetailsCacheModel.phoneNumber = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			mobileUserDetailsCacheModel.createDate = createDate.getTime();
		}
		else {
			mobileUserDetailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			mobileUserDetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			mobileUserDetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return mobileUserDetailsCacheModel;
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

	private static ClassLoader _classLoader = MobileUserDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MobileUserDetails.class
		};
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
	private MobileUserDetails _escapedModel;
}