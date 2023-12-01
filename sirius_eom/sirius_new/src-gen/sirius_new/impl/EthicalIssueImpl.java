/**
 */
package sirius_new.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius_new.EthicalIssue;
import sirius_new.Sirius_newPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethical Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.EthicalIssueImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.impl.EthicalIssueImpl#getIssueDescription <em>Issue Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthicalIssueImpl extends MinimalEObjectImpl.Container implements EthicalIssue {
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
	 * The default value of the '{@link #getIssueDescription() <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDescription() <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDescription()
	 * @generated
	 * @ordered
	 */
	protected String issueDescription = ISSUE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthicalIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.ETHICAL_ISSUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.ETHICAL_ISSUE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueDescription() {
		return issueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDescription(String newIssueDescription) {
		String oldIssueDescription = issueDescription;
		issueDescription = newIssueDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.ETHICAL_ISSUE__ISSUE_DESCRIPTION,
					oldIssueDescription, issueDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Sirius_newPackage.ETHICAL_ISSUE__NAME:
			return getName();
		case Sirius_newPackage.ETHICAL_ISSUE__ISSUE_DESCRIPTION:
			return getIssueDescription();
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
		case Sirius_newPackage.ETHICAL_ISSUE__NAME:
			setName((String) newValue);
			return;
		case Sirius_newPackage.ETHICAL_ISSUE__ISSUE_DESCRIPTION:
			setIssueDescription((String) newValue);
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
		case Sirius_newPackage.ETHICAL_ISSUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Sirius_newPackage.ETHICAL_ISSUE__ISSUE_DESCRIPTION:
			setIssueDescription(ISSUE_DESCRIPTION_EDEFAULT);
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
		case Sirius_newPackage.ETHICAL_ISSUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Sirius_newPackage.ETHICAL_ISSUE__ISSUE_DESCRIPTION:
			return ISSUE_DESCRIPTION_EDEFAULT == null ? issueDescription != null
					: !ISSUE_DESCRIPTION_EDEFAULT.equals(issueDescription);
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
		result.append(", issueDescription: ");
		result.append(issueDescription);
		result.append(')');
		return result.toString();
	}

} //EthicalIssueImpl
