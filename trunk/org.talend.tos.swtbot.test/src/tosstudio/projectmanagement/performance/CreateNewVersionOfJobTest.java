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
package tosstudio.projectmanagement.performance;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.swtbot.TalendSwtBotForTos;
import org.talend.swtbot.Utilities;
import org.talend.swtbot.items.TalendJobItem;

/**
 * DOC Administrator class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class CreateNewVersionOfJobTest extends TalendSwtBotForTos {

    private TalendJobItem jobItem;

    private static final String JOBNAME = "test01"; //$NON-NLS-1$

    @Before
    public void createAJob() {
        jobItem = new TalendJobItem(JOBNAME);
        jobItem.create();
    }

    @Test
    public void createNewVersionOfJob() {
        jobItem.getEditor().saveAndClose();
        jobItem.getItem().contextMenu("Edit properties").click();

        gefBot.shell("Edit properties").activate();
        gefBot.button("M").click();
        gefBot.button("m").click();
        gefBot.button("Finish").click();

        SWTBotTreeItem newJobItem = null;
        try {
            newJobItem = jobItem.getParentNode().expand().getNode(JOBNAME + " 1.1");
            jobItem.setItem(newJobItem);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Assert.assertNotNull("new version of job is not created", newJobItem);
        }
    }

    @After
    public void removePreviouslyCreateItems() {
        Utilities.cleanUpRepository(jobItem.getParentNode());
        Utilities.emptyRecycleBin();
    }
}
