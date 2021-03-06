/*******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.ui.trans.steps.teradatabulkloader;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.ui.core.PropsUI;
import org.pentaho.di.ui.core.widget.TextVar;

public class DirectoryTextVarMenuItem extends TextVarMenuItem {
  private final Shell shell;

  DirectoryTextVarMenuItem( Shell shell, Composite parent, PropsUI props, TransMeta transMeta, ModifyListener lsMod,
      Control top, String labelProp ) {
    super( parent, props, transMeta, lsMod, top, labelProp, TeraDataBulkLoaderDialog.DIR_BUTTON );
    this.shell = shell;
  }

  DirectoryTextVarMenuItem( Shell shell, Composite parent, PropsUI props, TransMeta transMeta, ModifyListener lsMod,
      CompositeMenuItem top, String labelProp ) {
    this( shell, parent, props, transMeta, lsMod, top.getComposite(), labelProp );
  }

  DirectoryTextVarMenuItem( Shell shell, Composite parent, PropsUI props, TransMeta transMeta, ModifyListener lsMod,
      TextVarMenuItem top, String labelProp ) {
    this( shell, parent, props, transMeta, lsMod, top.getButton(), labelProp );
  }

  @Override
  protected SelectionListener createSelectionListener( TextVar textVar ) {
    return new DirectorySelectionButtonListener( textVar, shell );
  }
}
