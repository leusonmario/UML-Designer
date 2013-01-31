/*******************************************************************************
 * Copyright (c) 2009, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.properties.uml.parts.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class SubstitutionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SubstitutionPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningTemplateParameter;
	protected EObjectFlatComboViewer templateParameter;
	protected ReferencesTable supplier;
	protected List<ViewerFilter> supplierBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supplierFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable client;
	protected List<ViewerFilter> clientBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer contract;
	protected EObjectFlatComboViewer substitutingClassifier;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public SubstitutionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public Composite createFigure(final Composite parent) {
    view = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(view);
    return view;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(Composite view) { 
    CompositionSequence substitutionStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = substitutionStep.addStep(UmlViewsRepository.Substitution.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.owningTemplateParameter);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.templateParameter);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.supplier);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.client);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.contract);
    propertiesStep.addStep(UmlViewsRepository.Substitution.Properties.substitutingClassifier);
    
    
    composer = new PartComposer(substitutionStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.Substitution.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.name) {
          return createNameText(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.visibility) {
          return createVisibilityEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.clientDependency) {
          return createClientDependencyAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.owningTemplateParameter) {
          return createOwningTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.templateParameter) {
          return createTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.supplier) {
          return createSupplierAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.client) {
          return createClientAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.contract) {
          return createContractFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Substitution.Properties.substitutingClassifier) {
          return createSubstitutingClassifierFlatComboViewer(parent);
        }
        return parent;
      }
    };
    composer.compose(view);
  }

	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(Composite parent) {
    Group propertiesGroup = new Group(parent, SWT.NONE);
    propertiesGroup.setText(UmlMessages.SubstitutionPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesGroupData.horizontalSpan = 3;
    propertiesGroup.setLayoutData(propertiesGroupData);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    return propertiesGroup;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNameText(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.name, UmlMessages.SubstitutionPropertiesEditionPart_NameLabel);
    name = SWTUtils.createScrollableText(parent, SWT.BORDER);
    GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
    name.setLayoutData(nameData);
    name.addFocusListener(new FocusAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
      }

    });
    name.addKeyListener(new KeyAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, UmlViewsRepository.Substitution.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.name, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.visibility, UmlMessages.SubstitutionPropertiesEditionPart_VisibilityLabel);
    visibility = new EMFComboViewer(parent);
    visibility.setContentProvider(new ArrayContentProvider());
    visibility.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
    GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
    visibility.getCombo().setLayoutData(visibilityData);
    visibility.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       * 	@generated
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.Substitution.Properties.visibility);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.visibility, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Substitution.Properties.clientDependency, UmlMessages.SubstitutionPropertiesEditionPart_ClientDependencyLabel);		 
    this.clientDependency = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.clientDependency, UmlViewsRepository.SWT_KIND));
    this.clientDependency.createControls(parent);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.Substitution.Properties.clientDependency);
    clientDependency.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addClientDependency() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(clientDependency.getInput(), clientDependencyFilters, clientDependencyBusinessFilters,
    "clientDependency", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.clientDependency,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        clientDependency.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveClientDependency(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void editClientDependency(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        clientDependency.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createOwningTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.owningTemplateParameter, UmlMessages.SubstitutionPropertiesEditionPart_OwningTemplateParameterLabel);
    owningTemplateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Substitution.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND));
    owningTemplateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    owningTemplateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.owningTemplateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningTemplateParameter()));
      }

    });
    GridData owningTemplateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    owningTemplateParameter.setLayoutData(owningTemplateParameterData);
    owningTemplateParameter.setID(UmlViewsRepository.Substitution.Properties.owningTemplateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.templateParameter, UmlMessages.SubstitutionPropertiesEditionPart_TemplateParameterLabel);
    templateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Substitution.Properties.templateParameter, UmlViewsRepository.SWT_KIND));
    templateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    templateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.templateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTemplateParameter()));
      }

    });
    GridData templateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    templateParameter.setLayoutData(templateParameterData);
    templateParameter.setID(UmlViewsRepository.Substitution.Properties.templateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.templateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createSupplierAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Substitution.Properties.supplier, UmlMessages.SubstitutionPropertiesEditionPart_SupplierLabel);		 
    this.supplier = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addSupplier(); }
      public void handleEdit(EObject element) { editSupplier(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupplier(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromSupplier(element); }
      public void navigateTo(EObject element) { }
    });
    this.supplier.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.supplier, UmlViewsRepository.SWT_KIND));
    this.supplier.createControls(parent);
    this.supplier.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.supplier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData supplierData = new GridData(GridData.FILL_HORIZONTAL);
    supplierData.horizontalSpan = 3;
    this.supplier.setLayoutData(supplierData);
    this.supplier.disableMove();
    supplier.setID(UmlViewsRepository.Substitution.Properties.supplier);
    supplier.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addSupplier() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supplier.getInput(), supplierFilters, supplierBusinessFilters,
    "supplier", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.supplier,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        supplier.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveSupplier(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.supplier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    supplier.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromSupplier(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.supplier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    supplier.refresh();
  }

	/**
	 * @generated
	 */
	protected void editSupplier(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        supplier.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createClientAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Substitution.Properties.client, UmlMessages.SubstitutionPropertiesEditionPart_ClientLabel);		 
    this.client = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClient(); }
      public void handleEdit(EObject element) { editClient(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClient(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClient(element); }
      public void navigateTo(EObject element) { }
    });
    this.client.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.client, UmlViewsRepository.SWT_KIND));
    this.client.createControls(parent);
    this.client.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.client, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientData = new GridData(GridData.FILL_HORIZONTAL);
    clientData.horizontalSpan = 3;
    this.client.setLayoutData(clientData);
    this.client.disableMove();
    client.setID(UmlViewsRepository.Substitution.Properties.client);
    client.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addClient() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(client.getInput(), clientFilters, clientBusinessFilters,
    "client", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.client,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        client.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveClient(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.client, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    client.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClient(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.client, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    client.refresh();
  }

	/**
	 * @generated
	 */
	protected void editClient(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        client.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createContractFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.contract, UmlMessages.SubstitutionPropertiesEditionPart_ContractLabel);
    contract = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Substitution.Properties.contract, UmlViewsRepository.SWT_KIND));
    contract.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    contract.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.contract, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getContract()));
      }

    });
    GridData contractData = new GridData(GridData.FILL_HORIZONTAL);
    contract.setLayoutData(contractData);
    contract.setID(UmlViewsRepository.Substitution.Properties.contract);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.contract, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createSubstitutingClassifierFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Substitution.Properties.substitutingClassifier, UmlMessages.SubstitutionPropertiesEditionPart_SubstitutingClassifierLabel);
    substitutingClassifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Substitution.Properties.substitutingClassifier, UmlViewsRepository.SWT_KIND));
    substitutingClassifier.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    substitutingClassifier.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubstitutionPropertiesEditionPartImpl.this, UmlViewsRepository.Substitution.Properties.substitutingClassifier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSubstitutingClassifier()));
      }

    });
    GridData substitutingClassifierData = new GridData(GridData.FILL_HORIZONTAL);
    substitutingClassifier.setLayoutData(substitutingClassifierData);
    substitutingClassifier.setID(UmlViewsRepository.Substitution.Properties.substitutingClassifier);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Substitution.Properties.substitutingClassifier, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getOwningTemplateParameter()
	 * @generated
	 */
	public EObject getOwningTemplateParameter() {
    if (owningTemplateParameter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) owningTemplateParameter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initOwningTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initOwningTemplateParameter(EObjectFlatComboSettings settings) {
		owningTemplateParameter.setInput(settings);
		if (current != null) {
			owningTemplateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.owningTemplateParameter);
		if (readOnly && owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(false);
			owningTemplateParameter.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setOwningTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setOwningTemplateParameter(EObject newValue) {
    if (newValue != null) {
      owningTemplateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      owningTemplateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.owningTemplateParameter);
    if (readOnly && owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(false);
      owningTemplateParameter.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		owningTemplateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getTemplateParameter()
	 * @generated
	 */
	public EObject getTemplateParameter() {
    if (templateParameter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) templateParameter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initTemplateParameter(EObjectFlatComboSettings settings) {
		templateParameter.setInput(settings);
		if (current != null) {
			templateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.templateParameter);
		if (readOnly && templateParameter.isEnabled()) {
			templateParameter.setEnabled(false);
			templateParameter.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !templateParameter.isEnabled()) {
			templateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setTemplateParameter(EObject newValue) {
    if (newValue != null) {
      templateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      templateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.templateParameter);
    if (readOnly && templateParameter.isEnabled()) {
      templateParameter.setEnabled(false);
      templateParameter.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !templateParameter.isEnabled()) {
      templateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		templateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initSupplier(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupplier(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supplier.setContentProvider(contentProvider);
		supplier.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.supplier);
		if (readOnly && supplier.getTable().isEnabled()) {
			supplier.setEnabled(false);
			supplier.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !supplier.getTable().isEnabled()) {
			supplier.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#updateSupplier()
	 * @generated
	 */
	public void updateSupplier() {
  supplier.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterSupplier(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSupplier(ViewerFilter filter) {
    supplierFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterSupplier(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSupplier(ViewerFilter filter) {
    supplierBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#isContainedInSupplierTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSupplierTable(EObject element) {
    return ((ReferencesTableSettings)supplier.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initClient(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClient(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		client.setContentProvider(contentProvider);
		client.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.client);
		if (readOnly && client.getTable().isEnabled()) {
			client.setEnabled(false);
			client.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !client.getTable().isEnabled()) {
			client.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#updateClient()
	 * @generated
	 */
	public void updateClient() {
  client.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterClient(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClient(ViewerFilter filter) {
    clientFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterClient(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClient(ViewerFilter filter) {
    clientBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#isContainedInClientTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientTable(EObject element) {
    return ((ReferencesTableSettings)client.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getContract()
	 * @generated
	 */
	public EObject getContract() {
    if (contract.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) contract.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initContract(EObjectFlatComboSettings)
	 */
	public void initContract(EObjectFlatComboSettings settings) {
		contract.setInput(settings);
		if (current != null) {
			contract.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.contract);
		if (readOnly && contract.isEnabled()) {
			contract.setEnabled(false);
			contract.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !contract.isEnabled()) {
			contract.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setContract(EObject newValue)
	 * @generated
	 */
	public void setContract(EObject newValue) {
    if (newValue != null) {
      contract.setSelection(new StructuredSelection(newValue));
    } else {
      contract.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.contract);
    if (readOnly && contract.isEnabled()) {
      contract.setEnabled(false);
      contract.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !contract.isEnabled()) {
      contract.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setContractButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContractButtonMode(ButtonsModeEnum newValue) {
		contract.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterContract(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToContract(ViewerFilter filter) {
    contract.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterContract(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToContract(ViewerFilter filter) {
    contract.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#getSubstitutingClassifier()
	 * @generated
	 */
	public EObject getSubstitutingClassifier() {
    if (substitutingClassifier.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) substitutingClassifier.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#initSubstitutingClassifier(EObjectFlatComboSettings)
	 */
	public void initSubstitutingClassifier(EObjectFlatComboSettings settings) {
		substitutingClassifier.setInput(settings);
		if (current != null) {
			substitutingClassifier.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.substitutingClassifier);
		if (readOnly && substitutingClassifier.isEnabled()) {
			substitutingClassifier.setEnabled(false);
			substitutingClassifier.setToolTipText(UmlMessages.Substitution_ReadOnly);
		} else if (!readOnly && !substitutingClassifier.isEnabled()) {
			substitutingClassifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setSubstitutingClassifier(EObject newValue)
	 * @generated
	 */
	public void setSubstitutingClassifier(EObject newValue) {
    if (newValue != null) {
      substitutingClassifier.setSelection(new StructuredSelection(newValue));
    } else {
      substitutingClassifier.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Substitution.Properties.substitutingClassifier);
    if (readOnly && substitutingClassifier.isEnabled()) {
      substitutingClassifier.setEnabled(false);
      substitutingClassifier.setToolTipText(UmlMessages.Substitution_ReadOnly);
    } else if (!readOnly && !substitutingClassifier.isEnabled()) {
      substitutingClassifier.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#setSubstitutingClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSubstitutingClassifierButtonMode(ButtonsModeEnum newValue) {
		substitutingClassifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addFilterSubstitutingClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSubstitutingClassifier(ViewerFilter filter) {
    substitutingClassifier.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.SubstitutionPropertiesEditionPart#addBusinessFilterSubstitutingClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSubstitutingClassifier(ViewerFilter filter) {
    substitutingClassifier.addBusinessRuleFilter(filter);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.Substitution_Part_Title;
  }



}