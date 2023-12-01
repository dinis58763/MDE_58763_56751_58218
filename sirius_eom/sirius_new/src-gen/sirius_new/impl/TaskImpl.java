/**
 */
package sirius_new.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius_new.Sirius_newPackage;
import sirius_new.Status;
import sirius_new.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.impl.TaskImpl#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link sirius_new.impl.TaskImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link sirius_new.impl.TaskImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskDescription() <em>Task Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskDescription() <em>Task Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDescription()
	 * @generated
	 * @ordered
	 */
	protected String taskDescription = TASK_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.NOT_STARTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskDescription() {
		return taskDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskDescription(String newTaskDescription) {
		String oldTaskDescription = taskDescription;
		taskDescription = newTaskDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.TASK__TASK_DESCRIPTION,
					oldTaskDescription, taskDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(XMLGregorianCalendar newDeadline) {
		XMLGregorianCalendar oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.TASK__DEADLINE, oldDeadline,
					deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.TASK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Sirius_newPackage.TASK__NAME:
			return getName();
		case Sirius_newPackage.TASK__TASK_DESCRIPTION:
			return getTaskDescription();
		case Sirius_newPackage.TASK__DEADLINE:
			return getDeadline();
		case Sirius_newPackage.TASK__STATUS:
			return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Sirius_newPackage.TASK__NAME:
			setName((String) newValue);
			return;
		case Sirius_newPackage.TASK__TASK_DESCRIPTION:
			setTaskDescription((String) newValue);
			return;
		case Sirius_newPackage.TASK__DEADLINE:
			setDeadline((XMLGregorianCalendar) newValue);
			return;
		case Sirius_newPackage.TASK__STATUS:
			setStatus((Status) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Sirius_newPackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Sirius_newPackage.TASK__TASK_DESCRIPTION:
			setTaskDescription(TASK_DESCRIPTION_EDEFAULT);
			return;
		case Sirius_newPackage.TASK__DEADLINE:
			setDeadline(DEADLINE_EDEFAULT);
			return;
		case Sirius_newPackage.TASK__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Sirius_newPackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Sirius_newPackage.TASK__TASK_DESCRIPTION:
			return TASK_DESCRIPTION_EDEFAULT == null ? taskDescription != null
					: !TASK_DESCRIPTION_EDEFAULT.equals(taskDescription);
		case Sirius_newPackage.TASK__DEADLINE:
			return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
		case Sirius_newPackage.TASK__STATUS:
			return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", taskDescription: ");
		result.append(taskDescription);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
