/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

/**
 * @author Jimmy
 * 
 */
public interface VerifyRegistrationEmailRequest extends BoxRequest {

    /**
     * @return the loginName
     */
    public String getLoginName();

    /**
     * @param loginName
     *            the loginName to set
     */
    public void setLoginName(String loginName);
}
