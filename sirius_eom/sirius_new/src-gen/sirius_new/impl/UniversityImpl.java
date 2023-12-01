/**
 */
package sirius_new.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius_new.Faculty;
import sirius_new.Sirius_newPackage;
import sirius_new.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.impl.UniversityImpl#getFaculty <em>Faculty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
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
	 * The cached value of the '{@link #getFaculty() <em>Faculty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculty()
	 * @generated
	 * @ordered
	 */
	protected Faculty faculty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.UNIVERSITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.UNIVERSITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty getFaculty() {
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaculty(Faculty newFaculty, NotificationChain msgs) {
		Faculty oldFaculty = faculty;
		faculty = newFaculty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.UNIVERSITY__FACULTY, oldFaculty, newFaculty);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaculty(Faculty newFaculty) {
		if (newFaculty != faculty) {
			NotificationChain msgs = null;
			if (faculty != null)
				msgs = ((InternalEObject) faculty).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.UNIVERSITY__FACULTY, null, msgs);
			if (newFaculty != null)
				msgs = ((InternalEObject) newFaculty).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.UNIVERSITY__FACULTY, null, msgs);
			msgs = basicSetFaculty(newFaculty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.UNIVERSITY__FACULTY, newFaculty,
					newFaculty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Sirius_newPackage.UNIVERSITY__FACULTY:
			return basicSetFaculty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Sirius_newPackage.UNIVERSITY__NAME:
			return getName();
		case Sirius_newPackage.UNIVERSITY__FACULTY:
			return getFaculty();
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
		case Sirius_newPackage.UNIVERSITY__NAME:
			setName((String) newValue);
			return;
		case Sirius_newPackage.UNIVERSITY__FACULTY:
			setFaculty((Faculty) newValue);
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
		case Sirius_newPackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Sirius_newPackage.UNIVERSITY__FACULTY:
			setFaculty((Faculty) null);
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
		case Sirius_newPackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Sirius_newPackage.UNIVERSITY__FACULTY:
			return faculty != null;
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
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
