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

package com.vidyayug.mobile.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vidyayug.mobile.model.MobileUserDetails;

import java.util.List;

/**
 * The persistence utility for the mobile user details service. This utility wraps {@link MobileUserDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MVIDYA
 * @see MobileUserDetailsPersistence
 * @see MobileUserDetailsPersistenceImpl
 * @generated
 */
public class MobileUserDetailsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MobileUserDetails mobileUserDetails) {
		getPersistence().clearCache(mobileUserDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MobileUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MobileUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MobileUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MobileUserDetails update(MobileUserDetails mobileUserDetails)
		throws SystemException {
		return getPersistence().update(mobileUserDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MobileUserDetails update(
		MobileUserDetails mobileUserDetails, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(mobileUserDetails, serviceContext);
	}

	/**
	* Caches the mobile user details in the entity cache if it is enabled.
	*
	* @param mobileUserDetails the mobile user details
	*/
	public static void cacheResult(
		com.vidyayug.mobile.model.MobileUserDetails mobileUserDetails) {
		getPersistence().cacheResult(mobileUserDetails);
	}

	/**
	* Caches the mobile user detailses in the entity cache if it is enabled.
	*
	* @param mobileUserDetailses the mobile user detailses
	*/
	public static void cacheResult(
		java.util.List<com.vidyayug.mobile.model.MobileUserDetails> mobileUserDetailses) {
		getPersistence().cacheResult(mobileUserDetailses);
	}

	/**
	* Creates a new mobile user details with the primary key. Does not add the mobile user details to the database.
	*
	* @param userId the primary key for the new mobile user details
	* @return the new mobile user details
	*/
	public static com.vidyayug.mobile.model.MobileUserDetails create(
		long userId) {
		return getPersistence().create(userId);
	}

	/**
	* Removes the mobile user details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the mobile user details
	* @return the mobile user details that was removed
	* @throws com.vidyayug.mobile.NoSuchMobileUserDetailsException if a mobile user details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vidyayug.mobile.model.MobileUserDetails remove(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vidyayug.mobile.NoSuchMobileUserDetailsException {
		return getPersistence().remove(userId);
	}

	public static com.vidyayug.mobile.model.MobileUserDetails updateImpl(
		com.vidyayug.mobile.model.MobileUserDetails mobileUserDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(mobileUserDetails);
	}

	/**
	* Returns the mobile user details with the primary key or throws a {@link com.vidyayug.mobile.NoSuchMobileUserDetailsException} if it could not be found.
	*
	* @param userId the primary key of the mobile user details
	* @return the mobile user details
	* @throws com.vidyayug.mobile.NoSuchMobileUserDetailsException if a mobile user details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vidyayug.mobile.model.MobileUserDetails findByPrimaryKey(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vidyayug.mobile.NoSuchMobileUserDetailsException {
		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	* Returns the mobile user details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the mobile user details
	* @return the mobile user details, or <code>null</code> if a mobile user details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vidyayug.mobile.model.MobileUserDetails fetchByPrimaryKey(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	* Returns all the mobile user detailses.
	*
	* @return the mobile user detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vidyayug.mobile.model.MobileUserDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mobile user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vidyayug.mobile.model.impl.MobileUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile user detailses
	* @param end the upper bound of the range of mobile user detailses (not inclusive)
	* @return the range of mobile user detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vidyayug.mobile.model.MobileUserDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mobile user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vidyayug.mobile.model.impl.MobileUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile user detailses
	* @param end the upper bound of the range of mobile user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mobile user detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vidyayug.mobile.model.MobileUserDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mobile user detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mobile user detailses.
	*
	* @return the number of mobile user detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MobileUserDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MobileUserDetailsPersistence)PortletBeanLocatorUtil.locate(com.vidyayug.mobile.service.ClpSerializer.getServletContextName(),
					MobileUserDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(MobileUserDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MobileUserDetailsPersistence persistence) {
	}

	private static MobileUserDetailsPersistence _persistence;
}