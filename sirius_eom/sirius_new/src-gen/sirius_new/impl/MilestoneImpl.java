/**
 */
package sirius_new.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius_new.Milestone;
import sirius_new.Sirius_newPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.MilestoneImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.impl.MilestoneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sirius_new.impl.MilestoneImpl#getCompletionDate <em>Completion Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilestoneImpl extends MinimalEObjectImpl.Container implements Milestone {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionDate() <em>Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar COMPLETION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionDate() <em>Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar completionDate = COMPLETION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.MILESTONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.MILESTONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.MILESTONE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCompletionDate() {
		return completionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionDate(XMLGregorianCalendar newCompletionDate) {
		XMLGregorianCalendar oldCompletionDate = completionDate;
		completionDate = newCompletionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.MILESTONE__COMPLETION_DATE,
					oldCompletionDate, completionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Sirius_newPackage.MILESTONE__NAME:
			return getName();
		case Sirius_newPackage.MILESTONE__DESCRIPTION:
			return getDescription();
		case Sirius_newPackage.MILESTONE__COMPLETION_DATE:
			return getCompletionDate();
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
		case Sirius_newPackage.MILESTONE__NAME:
			setName((String) newValue);
			return;
		case Sirius_newPackage.MILESTONE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Sirius_newPackage.MILESTONE__COMPLETION_DATE:
			setCompletionDate((XMLGregorianCalendar) newValue);
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
		case Sirius_newPackage.MILESTONE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Sirius_newPackage.MILESTONE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Sirius_newPackage.MILESTONE__COMPLETION_DATE:
			setCompletionDate(COMPLETION_DATE_EDEFAULT);
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
		case Sirius_newPackage.MILESTONE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Sirius_newPackage.MILESTONE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Sirius_newPackage.MILESTONE__COMPLETION_DATE:
			return COMPLETION_DATE_EDEFAULT == null ? completionDate != null
					: !COMPLETION_DATE_EDEFAULT.equals(completionDate);
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
		result.append(", description: ");
		result.append(description);
		result.append(", completionDate: ");
		result.append(completionDate);
		result.append(')');
		return result.toString();
	}

} //MilestoneImpl
