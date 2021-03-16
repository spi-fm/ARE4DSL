/**
 */
package aredsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query Language Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aredsl.AredslPackage#getQueryLanguageKind()
 * @model
 * @generated
 */
public enum QueryLanguageKind implements Enumerator {
	/**
	 * The '<em><b>LINQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINQ_VALUE
	 * @generated
	 * @ordered
	 */
	LINQ(0, "LINQ", "LINQ"),

	/**
	 * The '<em><b>JPQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPQL_VALUE
	 * @generated
	 * @ordered
	 */
	JPQL(1, "JPQL", "JPQL"),

	/**
	 * The '<em><b>SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_VALUE
	 * @generated
	 * @ordered
	 */
	SQL(2, "SQL", "SQL"),

	/**
	 * The '<em><b>AQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AQL_VALUE
	 * @generated
	 * @ordered
	 */
	AQL(3, "AQL", "AQL"),

	/**
	 * The '<em><b>OCL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL_VALUE
	 * @generated
	 * @ordered
	 */
	OCL(4, "OCL", "OCL"),

	/**
	 * The '<em><b>XPATH XQUERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_XQUERY_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH_XQUERY(5, "XPATH_XQUERY", "XPATH_XQUERY");

	/**
	 * The '<em><b>LINQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINQ_VALUE = 0;

	/**
	 * The '<em><b>JPQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPQL_VALUE = 1;

	/**
	 * The '<em><b>SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQL_VALUE = 2;

	/**
	 * The '<em><b>AQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AQL_VALUE = 3;

	/**
	 * The '<em><b>OCL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCL_VALUE = 4;

	/**
	 * The '<em><b>XPATH XQUERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XPATH XQUERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XPATH_XQUERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_XQUERY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Query Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueryLanguageKind[] VALUES_ARRAY = new QueryLanguageKind[] { LINQ, JPQL, SQL, AQL, OCL,
			XPATH_XQUERY, };

	/**
	 * A public read-only list of all the '<em><b>Query Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueryLanguageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Query Language Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryLanguageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Language Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryLanguageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Language Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguageKind get(int value) {
		switch (value) {
		case LINQ_VALUE:
			return LINQ;
		case JPQL_VALUE:
			return JPQL;
		case SQL_VALUE:
			return SQL;
		case AQL_VALUE:
			return AQL;
		case OCL_VALUE:
			return OCL;
		case XPATH_XQUERY_VALUE:
			return XPATH_XQUERY;
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
	private QueryLanguageKind(int value, String name, String literal) {
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

} //QueryLanguageKind
