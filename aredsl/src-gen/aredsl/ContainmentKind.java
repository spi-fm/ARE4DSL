/**
 */
package aredsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Containment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aredsl.AredslPackage#getContainmentKind()
 * @model
 * @generated
 */
public enum ContainmentKind implements Enumerator {
	/**
	 * The '<em><b>FREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE(0, "FREE", "FREE"),

	/**
	 * The '<em><b>HORIZONTAL ARRANGEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ARRANGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_ARRANGEMENT(1, "HORIZONTAL_ARRANGEMENT", "HORIZONTAL_ARRANGEMENT"),

	/**
	 * The '<em><b>VERTICAL ARRANGEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_ARRANGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_ARRANGEMENT(2, "VERTICAL_ARRANGEMENT", "VERTICAL_ARRANGEMENT"),

	/**
	 * The '<em><b>EXTERNAL LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_LINK(3, "EXTERNAL_LINK", "EXTERNAL_LINK");

	/**
	 * The '<em><b>FREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREE_VALUE = 0;

	/**
	 * The '<em><b>HORIZONTAL ARRANGEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTAL ARRANGEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_ARRANGEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_ARRANGEMENT_VALUE = 1;

	/**
	 * The '<em><b>VERTICAL ARRANGEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICAL ARRANGEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_ARRANGEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_ARRANGEMENT_VALUE = 2;

	/**
	 * The '<em><b>EXTERNAL LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTERNAL LINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_LINK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Containment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContainmentKind[] VALUES_ARRAY = new ContainmentKind[] { FREE, HORIZONTAL_ARRANGEMENT,
			VERTICAL_ARRANGEMENT, EXTERNAL_LINK, };

	/**
	 * A public read-only list of all the '<em><b>Containment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContainmentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Containment Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainmentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Containment Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainmentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Containment Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainmentKind get(int value) {
		switch (value) {
		case FREE_VALUE:
			return FREE;
		case HORIZONTAL_ARRANGEMENT_VALUE:
			return HORIZONTAL_ARRANGEMENT;
		case VERTICAL_ARRANGEMENT_VALUE:
			return VERTICAL_ARRANGEMENT;
		case EXTERNAL_LINK_VALUE:
			return EXTERNAL_LINK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContainmentKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ContainmentKind
