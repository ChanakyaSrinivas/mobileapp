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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vidyayug.mobile.model.MobileUserDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MobileUserDetails in entity cache.
 *
 * @author MVIDYA
 * @see MobileUserDetails
 * @generated
 */
public class MobileUserDetailsCacheModel implements CacheModel<MobileUserDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", email=");
		sb.append(email);
		sb.append(", username=");
		sb.append(username);
		sb.append(", password=");
		sb.append(password);
		sb.append(", street=");
		sb.append(street);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zipcode=");
		sb.append(zipcode);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MobileUserDetails toEntityModel() {
		MobileUserDetailsImpl mobileUserDetailsImpl = new MobileUserDetailsImpl();

		mobileUserDetailsImpl.setUserId(userId);
		mobileUserDetailsImpl.setCompanyId(companyId);

		if (email == null) {
			mobileUserDetailsImpl.setEmail(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setEmail(email);
		}

		if (username == null) {
			mobileUserDetailsImpl.setUsername(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setUsername(username);
		}

		mobileUserDetailsImpl.setPassword(password);

		if (street == null) {
			mobileUserDetailsImpl.setStreet(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setStreet(street);
		}

		if (city == null) {
			mobileUserDetailsImpl.setCity(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setCity(city);
		}

		if (state == null) {
			mobileUserDetailsImpl.setState(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setState(state);
		}

		if (zipcode == null) {
			mobileUserDetailsImpl.setZipcode(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setZipcode(zipcode);
		}

		if (phoneNumber == null) {
			mobileUserDetailsImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			mobileUserDetailsImpl.setPhoneNumber(phoneNumber);
		}

		if (createDate == Long.MIN_VALUE) {
			mobileUserDetailsImpl.setCreateDate(null);
		}
		else {
			mobileUserDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mobileUserDetailsImpl.setModifiedDate(null);
		}
		else {
			mobileUserDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		mobileUserDetailsImpl.resetOriginalValues();

		return mobileUserDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		companyId = objectInput.readLong();
		email = objectInput.readUTF();
		username = objectInput.readUTF();
		password = objectInput.readLong();
		street = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zipcode = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(companyId);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}

		objectOutput.writeLong(password);

		if (street == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zipcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipcode);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long userId;
	public long companyId;
	public String email;
	public String username;
	public long password;
	public String street;
	public String city;
	public String state;
	public String zipcode;
	public String phoneNumber;
	public long createDate;
	public long modifiedDate;
}