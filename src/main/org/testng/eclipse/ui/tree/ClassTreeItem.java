package org.testng.eclipse.ui.tree;

import org.eclipse.swt.widgets.TreeItem;
import org.testng.ITestResult;
import org.testng.eclipse.ui.RunInfo;

public class ClassTreeItem extends BaseTreeItem implements ITreeItem {

  public ClassTreeItem(TreeItem parent, RunInfo runInfo) {
    super(parent, runInfo);
    update(runInfo);
  }

  public void update(RunInfo runInfo) {
    getTreeItem().setText(runInfo.getClassName());
    maybeUpdateImage(runInfo);
  }

}
