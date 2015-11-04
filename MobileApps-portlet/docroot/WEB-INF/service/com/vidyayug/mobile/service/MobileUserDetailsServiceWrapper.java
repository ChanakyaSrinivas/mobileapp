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

package com.vidyayug.mobile.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MobileUserDetailsService}.
 *
 * @author MVIDYA
 * @see MobileUserDetailsService
 * @generated
 */
public class MobileUserDetailsServiceWrapper implements MobileUserDetailsService,
	ServiceWrapper<MobileUserDetailsService> {
	public MobileUserDetailsServiceWrapper(
		MobileUserDetailsService mobileUserDetailsService) {
		_mobileUserDetailsService = mobileUserDetailsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mobileUserDetailsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mobileUserDetailsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mobileUserDetailsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.lang.String submitUserDetails() {
		return _mobileUserDetailsService.submitUserDetails();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MobileUserDetailsService getWrappedMobileUserDetailsService() {
		return _mobileUserDetailsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMobileUserDetailsService(
		MobileUserDetailsService mobileUserDetailsService) {
		_mobileUserDetailsService = mobileUserDetailsService;
	}

	@Override
	public MobileUserDetailsService getWrappedService() {
		return _mobileUserDetailsService;
	}

	@Override
	public void setWrappedService(
		MobileUserDetailsService mobileUserDetailsService) {
		_mobileUserDetailsService = mobileUserDetailsService;
	}

	private MobileUserDetailsService _mobileUserDetailsService;
}