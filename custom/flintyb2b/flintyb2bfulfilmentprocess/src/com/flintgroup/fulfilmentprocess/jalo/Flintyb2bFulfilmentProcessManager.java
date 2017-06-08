/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.flintgroup.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.flintgroup.fulfilmentprocess.constants.Flintyb2bFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class Flintyb2bFulfilmentProcessManager extends GeneratedFlintyb2bFulfilmentProcessManager
{
	public static final Flintyb2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Flintyb2bFulfilmentProcessManager) em.getExtension(Flintyb2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
