/**
 */
package aredsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Based Tracker Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.MarkerBasedTrackerAction#getMarkerId <em>Marker Id</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getMarkerBasedTrackerAction()
 * @model
 * @generated
 */
public interface MarkerBasedTrackerAction extends TrackerAction {
	/**
	 * Returns the value of the '<em><b>Marker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Id</em>' attribute.
	 * @see #setMarkerId(int)
	 * @see aredsl.AredslPackage#getMarkerBasedTrackerAction_MarkerId()
	 * @model
	 * @generated
	 */
	int getMarkerId();

	/**
	 * Sets the value of the '{@link aredsl.MarkerBasedTrackerAction#getMarkerId <em>Marker Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Id</em>' attribute.
	 * @see #getMarkerId()
	 * @generated
	 */
	void setMarkerId(int value);

} // MarkerBasedTrackerAction
