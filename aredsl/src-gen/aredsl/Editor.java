/**
 */
package aredsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aredsl.Editor#getLayer <em>Layer</em>}</li>
 *   <li>{@link aredsl.Editor#getDescription <em>Description</em>}</li>
 *   <li>{@link aredsl.Editor#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link aredsl.Editor#getName <em>Name</em>}</li>
 *   <li>{@link aredsl.Editor#getToolsets <em>Toolsets</em>}</li>
 *   <li>{@link aredsl.Editor#getQueryLanguageKind <em>Query Language Kind</em>}</li>
 * </ul>
 *
 * @see aredsl.AredslPackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference list.
	 * @see aredsl.AredslPackage#getEditor_Layer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Layer> getLayer();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see aredsl.AredslPackage#getEditor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link aredsl.Editor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see aredsl.AredslPackage#getEditor_FileExtension()
	 * @model
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link aredsl.Editor#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aredsl.AredslPackage#getEditor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aredsl.Editor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Toolsets</b></em>' containment reference list.
	 * The list contents are of type {@link aredsl.ToolSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolsets</em>' containment reference list.
	 * @see aredsl.AredslPackage#getEditor_Toolsets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ToolSet> getToolsets();

	/**
	 * Returns the value of the '<em><b>Query Language Kind</b></em>' attribute.
	 * The default value is <code>"LINQ"</code>.
	 * The literals are from the enumeration {@link aredsl.QueryLanguageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Language Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Language Kind</em>' attribute.
	 * @see aredsl.QueryLanguageKind
	 * @see #setQueryLanguageKind(QueryLanguageKind)
	 * @see aredsl.AredslPackage#getEditor_QueryLanguageKind()
	 * @model default="LINQ"
	 * @generated
	 */
	QueryLanguageKind getQueryLanguageKind();

	/**
	 * Sets the value of the '{@link aredsl.Editor#getQueryLanguageKind <em>Query Language Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language Kind</em>' attribute.
	 * @see aredsl.QueryLanguageKind
	 * @see #getQueryLanguageKind()
	 * @generated
	 */
	void setQueryLanguageKind(QueryLanguageKind value);

} // Editor
