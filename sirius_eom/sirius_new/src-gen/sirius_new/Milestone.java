/**
 */
package sirius_new;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.Milestone#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.Milestone#getDescription <em>Description</em>}</li>
 *   <li>{@link sirius_new.Milestone#getCompletionDate <em>Completion Date</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getMilestone_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.Milestone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see sirius_new.Sirius_newPackage#getMilestone_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link sirius_new.Milestone#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Date</em>' attribute.
	 * @see #setCompletionDate(XMLGregorianCalendar)
	 * @see sirius_new.Sirius_newPackage#getMilestone_CompletionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getCompletionDate();

	/**
	 * Sets the value of the '{@link sirius_new.Milestone#getCompletionDate <em>Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Date</em>' attribute.
	 * @see #getCompletionDate()
	 * @generated
	 */
	void setCompletionDate(XMLGregorianCalendar value);

} // Milestone
