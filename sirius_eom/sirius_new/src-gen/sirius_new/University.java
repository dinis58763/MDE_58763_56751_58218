/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.University#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.University#getFaculty <em>Faculty</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' containment reference.
	 * @see #setFaculty(Faculty)
	 * @see sirius_new.Sirius_newPackage#getUniversity_Faculty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Faculty getFaculty();

	/**
	 * Sets the value of the '{@link sirius_new.University#getFaculty <em>Faculty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' containment reference.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(Faculty value);

} // University
