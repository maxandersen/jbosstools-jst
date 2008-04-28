/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.jst.web.tld.model.handlers;

import org.jboss.tools.common.meta.action.SignificanceMessage;
import org.jboss.tools.common.meta.action.XAction;
import org.jboss.tools.common.model.XModelObject;
import org.jboss.tools.jst.web.messages.xpl.WebUIMessages;

public class DeleteValidatorSignificanceMessage implements SignificanceMessage {

	public String getMessage(XAction action, XModelObject object, XModelObject[] objects) {
		return WebUIMessages.DELETE_VALIDATOR_NODE_FROM_XML;
	}

}
