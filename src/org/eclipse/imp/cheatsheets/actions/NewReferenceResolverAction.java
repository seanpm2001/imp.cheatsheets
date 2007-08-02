/*
 * Created on Mar 23, 2006
 */
package org.eclipse.imp.cheatsheets.actions;

import org.eclipse.imp.wizards.NewReferenceResolver;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

public class NewReferenceResolverAction extends Action implements ICheatSheetAction {
    public NewReferenceResolverAction() {
    	this("Create new reference resolver");
    }

    public NewReferenceResolverAction(String text) {
    	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
    	NewReferenceResolver newReferenceResolverWizard = new NewReferenceResolver();
    	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    	WizardDialog wizDialog= new WizardDialog(shell, newReferenceResolverWizard);

    	wizDialog.open();
    }
}
