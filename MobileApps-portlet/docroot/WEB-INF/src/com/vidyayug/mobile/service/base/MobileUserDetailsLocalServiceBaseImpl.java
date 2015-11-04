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

package com.vidyayug.mobile.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vidyayug.mobile.model.MobileUserDetails;
import com.vidyayug.mobile.service.MobileUserDetailsLocalService;
import com.vidyayug.mobile.service.persistence.MobileUserDetailsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the mobile user details local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vidyayug.mobile.service.impl.MobileUserDetailsLocalServiceImpl}.
 * </p>
 *
 * @author MVIDYA
 * @see com.vidyayug.mobile.service.impl.MobileUserDetailsLocalServiceImpl
 * @see com.vidyayug.mobile.service.MobileUserDetailsLocalServiceUtil
 * @generated
 */
public abstract class MobileUserDetailsLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements MobileUserDetailsLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vidyayug.mobile.service.MobileUserDetailsLocalServiceUtil} to access the mobile user details local service.
	 */

	/**
	 * Adds the mobile user details to the database. Also notifies the appropriate model listeners.
	 *
	 * @param mobileUserDetails the mobile user details
	 * @return the mobile user details that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MobileUserDetails addMobileUserDetails(
		MobileUserDetails mobileUserDetails) throws SystemException {
		mobileUserDetails.setNew(true);

		return mobileUserDetailsPersistence.update(mobileUserDetails);
	}

	/**
	 * Creates a new mobile user details with the primary key. Does not add the mobile user details to the database.
	 *
	 * @param userId the primary key for the new mobile user details
	 * @return the new mobile user details
	 */
	@Override
	public MobileUserDetails createMobileUserDetails(long userId) {
		return mobileUserDetailsPersistence.create(userId);
	}

	/**
	 * Deletes the mobile user details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the mobile user details
	 * @return the mobile user details that was removed
	 * @throws PortalException if a mobile user details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MobileUserDetails deleteMobileUserDetails(long userId)
		throws PortalException, SystemException {
		return mobileUserDetailsPersistence.remove(userId);
	}

	/**
	 * Deletes the mobile user details from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mobileUserDetails the mobile user details
	 * @return the mobile user details that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MobileUserDetails deleteMobileUserDetails(
		MobileUserDetails mobileUserDetails) throws SystemException {
		return mobileUserDetailsPersistence.remove(mobileUserDetails);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(MobileUserDetails.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return mobileUserDetailsPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vidyayug.mobile.model.impl.MobileUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return mobileUserDetailsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vidyayug.mobile.model.impl.MobileUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return mobileUserDetailsPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return mobileUserDetailsPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return mobileUserDetailsPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public MobileUserDetails fetchMobileUserDetails(long userId)
		throws SystemException {
		return mobileUserDetailsPersistence.fetchByPrimaryKey(userId);
	}

	/**
	 * Returns the mobile user details with the primary key.
	 *
	 * @param userId the primary key of the mobile user details
	 * @return the mobile user details
	 * @throws PortalException if a mobile user details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MobileUserDetails getMobileUserDetails(long userId)
		throws PortalException, SystemException {
		return mobileUserDetailsPersistence.findByPrimaryKey(userId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return mobileUserDetailsPersistence.findByPrimaryKey(primaryKeyObj);
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
	@Override
	public List<MobileUserDetails> getMobileUserDetailses(int start, int end)
		throws SystemException {
		return mobileUserDetailsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of mobile user detailses.
	 *
	 * @return the number of mobile user detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getMobileUserDetailsesCount() throws SystemException {
		return mobileUserDetailsPersistence.countAll();
	}

	/**
	 * Updates the mobile user details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param mobileUserDetails the mobile user details
	 * @return the mobile user details that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MobileUserDetails updateMobileUserDetails(
		MobileUserDetails mobileUserDetails) throws SystemException {
		return mobileUserDetailsPersistence.update(mobileUserDetails);
	}

	/**
	 * Returns the mobile user details local service.
	 *
	 * @return the mobile user details local service
	 */
	public com.vidyayug.mobile.service.MobileUserDetailsLocalService getMobileUserDetailsLocalService() {
		return mobileUserDetailsLocalService;
	}

	/**
	 * Sets the mobile user details local service.
	 *
	 * @param mobileUserDetailsLocalService the mobile user details local service
	 */
	public void setMobileUserDetailsLocalService(
		com.vidyayug.mobile.service.MobileUserDetailsLocalService mobileUserDetailsLocalService) {
		this.mobileUserDetailsLocalService = mobileUserDetailsLocalService;
	}

	/**
	 * Returns the mobile user details remote service.
	 *
	 * @return the mobile user details remote service
	 */
	public com.vidyayug.mobile.service.MobileUserDetailsService getMobileUserDetailsService() {
		return mobileUserDetailsService;
	}

	/**
	 * Sets the mobile user details remote service.
	 *
	 * @param mobileUserDetailsService the mobile user details remote service
	 */
	public void setMobileUserDetailsService(
		com.vidyayug.mobile.service.MobileUserDetailsService mobileUserDetailsService) {
		this.mobileUserDetailsService = mobileUserDetailsService;
	}

	/**
	 * Returns the mobile user details persistence.
	 *
	 * @return the mobile user details persistence
	 */
	public MobileUserDetailsPersistence getMobileUserDetailsPersistence() {
		return mobileUserDetailsPersistence;
	}

	/**
	 * Sets the mobile user details persistence.
	 *
	 * @param mobileUserDetailsPersistence the mobile user details persistence
	 */
	public void setMobileUserDetailsPersistence(
		MobileUserDetailsPersistence mobileUserDetailsPersistence) {
		this.mobileUserDetailsPersistence = mobileUserDetailsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.vidyayug.mobile.model.MobileUserDetails",
			mobileUserDetailsLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.vidyayug.mobile.model.MobileUserDetails");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return MobileUserDetails.class;
	}

	protected String getModelClassName() {
		return MobileUserDetails.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = mobileUserDetailsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.vidyayug.mobile.service.MobileUserDetailsLocalService.class)
	protected com.vidyayug.mobile.service.MobileUserDetailsLocalService mobileUserDetailsLocalService;
	@BeanReference(type = com.vidyayug.mobile.service.MobileUserDetailsService.class)
	protected com.vidyayug.mobile.service.MobileUserDetailsService mobileUserDetailsService;
	@BeanReference(type = MobileUserDetailsPersistence.class)
	protected MobileUserDetailsPersistence mobileUserDetailsPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MobileUserDetailsLocalServiceClpInvoker _clpInvoker = new MobileUserDetailsLocalServiceClpInvoker();
}