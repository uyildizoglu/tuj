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
package tosstudio.metadata.databaseoperation;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.swtbot.TalendSwtBotForTos;
import org.talend.swtbot.Utilities;
import org.talend.swtbot.items.TalendDBItem;

/**
 * DOC Administrator class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class DuplicateMysqlTest extends TalendSwtBotForTos {

    private TalendDBItem dbItem;

    private static final String DBNAME = "test_mysql"; //$NON-NLS-1$

    private static final String NEW_DBNAME = "duplicate_mysql"; //$NON-NLS-1$

    @Before
    public void createMySQL() {
        dbItem = new TalendDBItem(DBNAME, Utilities.DbConnectionType.MYSQL);
        dbItem.create();
    }

    @Test
    public void duplicateMysql() {
        dbItem.duplicate(NEW_DBNAME);
    }

    @After
    public void removePreviouslyCreateItems() {
        Utilities.cleanUpRepository(dbItem.getParentNode());
        Utilities.emptyRecycleBin();
    }
}
