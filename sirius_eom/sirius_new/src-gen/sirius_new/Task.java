/**
 */
package sirius_new;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.Task#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.Task#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link sirius_new.Task#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link sirius_new.Task#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Description</em>' attribute.
	 * @see #setTaskDescription(String)
	 * @see sirius_new.Sirius_newPackage#getTask_TaskDescription()
	 * @model
	 * @generated
	 */
	String getTaskDescription();

	/**
	 * Sets the value of the '{@link sirius_new.Task#getTaskDescription <em>Task Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Description</em>' attribute.
	 * @see #getTaskDescription()
	 * @generated
	 */
	void setTaskDescription(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(XMLGregorianCalendar)
	 * @see sirius_new.Sirius_newPackage#getTask_Deadline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDeadline();

	/**
	 * Sets the value of the '{@link sirius_new.Task#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"NOT_STARTED"</code>.
	 * The literals are from the enumeration {@link sirius_new.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see sirius_new.Status
	 * @see #setStatus(Status)
	 * @see sirius_new.Sirius_newPackage#getTask_Status()
	 * @model default="NOT_STARTED"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link sirius_new.Task#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see sirius_new.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // Task
