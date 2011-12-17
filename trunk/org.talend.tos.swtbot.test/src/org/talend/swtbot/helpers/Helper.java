// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.swtbot.helpers;

import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.talend.swtbot.TalendSwtBotForTos;

/**
 * DOC fzhong class global comment. Detailled comment
 */
public interface Helper {

    SWTGefBot GEFBOT = new SWTGefBot();

    TalendSwtBotForTos UTIL = new TalendSwtBotForTos();
}
