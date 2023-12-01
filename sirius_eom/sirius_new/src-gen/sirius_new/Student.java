/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.Student#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.Student#getAge <em>Age</em>}</li>
 *   <li>{@link sirius_new.Student#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see sirius_new.Sirius_newPackage#getStudent_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link sirius_new.Student#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see sirius_new.Sirius_newPackage#getStudent_EmailAddress()
	 * @model
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link sirius_new.Student#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

} // Student
