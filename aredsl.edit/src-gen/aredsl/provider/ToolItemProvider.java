/**
 */
package aredsl.provider;

import aredsl.AredslFactory;
import aredsl.AredslPackage;
import aredsl.Tool;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aredsl.Tool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addTargetPreconditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tool_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tool_id_feature", "_UI_Tool_type"),
						AredslPackage.Literals.TOOL__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tool_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tool_description_feature",
								"_UI_Tool_type"),
						AredslPackage.Literals.TOOL__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tool_precondition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tool_precondition_feature",
								"_UI_Tool_type"),
						AredslPackage.Literals.TOOL__PRECONDITION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Tool_targetPrecondition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Tool_targetPrecondition_feature",
								"_UI_Tool_type"),
						AredslPackage.Literals.TOOL__TARGET_PRECONDITION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AredslPackage.Literals.TOOL__BEHAVIOURS);
			childrenFeatures.add(AredslPackage.Literals.TOOL__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tool) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Tool_type")
				: getString("_UI_Tool_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Tool.class)) {
		case AredslPackage.TOOL__ID:
		case AredslPackage.TOOL__DESCRIPTION:
		case AredslPackage.TOOL__PRECONDITION:
		case AredslPackage.TOOL__TARGET_PRECONDITION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AredslPackage.TOOL__BEHAVIOURS:
		case AredslPackage.TOOL__ACTIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createCreateInstanceOperation()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createRemoveOperation()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createSetOperation()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createUnsetOperation()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createChangeContextOperation()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createMoveElement()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createShowSystemMenu()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS,
				AredslFactory.eINSTANCE.createArrangeElements()));

		newChildDescriptors.add(
				createChildParameter(AredslPackage.Literals.TOOL__BEHAVIOURS, AredslFactory.eINSTANCE.createExit()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createMarkerBasedTrackerAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createMarkerLessTrackerAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createSensorBasedAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createGestureAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createVoiceAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createMentalAction()));

		newChildDescriptors.add(createChildParameter(AredslPackage.Literals.TOOL__ACTIONS,
				AredslFactory.eINSTANCE.createTactileAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AredslEditPlugin.INSTANCE;
	}

}
