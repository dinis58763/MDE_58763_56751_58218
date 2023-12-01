/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.Faculty#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference.
	 * @see #setDepartments(Department)
	 * @see sirius_new.Sirius_newPackage#getFaculty_Departments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Department getDepartments();

	/**
	 * Sets the value of the '{@link sirius_new.Faculty#getDepartments <em>Departments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departments</em>' containment reference.
	 * @see #getDepartments()
	 * @generated
	 */
	void setDepartments(Department value);

} // Faculty
