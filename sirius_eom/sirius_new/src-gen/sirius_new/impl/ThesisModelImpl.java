/**
 */
package sirius_new.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius_new.Professor;
import sirius_new.Sirius_newPackage;
import sirius_new.Student;
import sirius_new.Thesis;
import sirius_new.ThesisModel;
import sirius_new.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.ThesisModelImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisModelImpl#getThesis <em>Thesis</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisModelImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisModelImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThesisModelImpl extends MinimalEObjectImpl.Container implements ThesisModel {
	/**
	 * The cached value of the '{@link #getUniversity() <em>University</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversity()
	 * @generated
	 * @ordered
	 */
	protected University university;

	/**
	 * The cached value of the '{@link #getThesis() <em>Thesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesis()
	 * @generated
	 * @ordered
	 */
	protected Thesis thesis;

	/**
	 * The cached value of the '{@link #getProfessor() <em>Professor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessor()
	 * @generated
	 * @ordered
	 */
	protected Professor professor;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.THESIS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University getUniversity() {
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		University oldUniversity = university;
		university = newUniversity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.THESIS_MODEL__UNIVERSITY, oldUniversity, newUniversity);
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
	public void setUniversity(University newUniversity) {
		if (newUniversity != university) {
			NotificationChain msgs = null;
			if (university != null)
				msgs = ((InternalEObject) university).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__UNIVERSITY, null, msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject) newUniversity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__UNIVERSITY, null, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS_MODEL__UNIVERSITY,
					newUniversity, newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thesis getThesis() {
		return thesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesis(Thesis newThesis, NotificationChain msgs) {
		Thesis oldThesis = thesis;
		thesis = newThesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.THESIS_MODEL__THESIS, oldThesis, newThesis);
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
	public void setThesis(Thesis newThesis) {
		if (newThesis != thesis) {
			NotificationChain msgs = null;
			if (thesis != null)
				msgs = ((InternalEObject) thesis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__THESIS, null, msgs);
			if (newThesis != null)
				msgs = ((InternalEObject) newThesis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__THESIS, null, msgs);
			msgs = basicSetThesis(newThesis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS_MODEL__THESIS, newThesis,
					newThesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfessor(Professor newProfessor, NotificationChain msgs) {
		Professor oldProfessor = professor;
		professor = newProfessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.THESIS_MODEL__PROFESSOR, oldProfessor, newProfessor);
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
	public void setProfessor(Professor newProfessor) {
		if (newProfessor != professor) {
			NotificationChain msgs = null;
			if (professor != null)
				msgs = ((InternalEObject) professor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__PROFESSOR, null, msgs);
			if (newProfessor != null)
				msgs = ((InternalEObject) newProfessor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__PROFESSOR, null, msgs);
			msgs = basicSetProfessor(newProfessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS_MODEL__PROFESSOR,
					newProfessor, newProfessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.THESIS_MODEL__STUDENT, oldStudent, newStudent);
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
	public void setStudent(Student newStudent) {
		if (newStudent != student) {
			NotificationChain msgs = null;
			if (student != null)
				msgs = ((InternalEObject) student).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__STUDENT, null, msgs);
			if (newStudent != null)
				msgs = ((InternalEObject) newStudent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS_MODEL__STUDENT, null, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS_MODEL__STUDENT, newStudent,
					newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Sirius_newPackage.THESIS_MODEL__UNIVERSITY:
			return basicSetUniversity(null, msgs);
		case Sirius_newPackage.THESIS_MODEL__THESIS:
			return basicSetThesis(null, msgs);
		case Sirius_newPackage.THESIS_MODEL__PROFESSOR:
			return basicSetProfessor(null, msgs);
		case Sirius_newPackage.THESIS_MODEL__STUDENT:
			return basicSetStudent(null, msgs);
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
		case Sirius_newPackage.THESIS_MODEL__UNIVERSITY:
			return getUniversity();
		case Sirius_newPackage.THESIS_MODEL__THESIS:
			return getThesis();
		case Sirius_newPackage.THESIS_MODEL__PROFESSOR:
			return getProfessor();
		case Sirius_newPackage.THESIS_MODEL__STUDENT:
			return getStudent();
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
		case Sirius_newPackage.THESIS_MODEL__UNIVERSITY:
			setUniversity((University) newValue);
			return;
		case Sirius_newPackage.THESIS_MODEL__THESIS:
			setThesis((Thesis) newValue);
			return;
		case Sirius_newPackage.THESIS_MODEL__PROFESSOR:
			setProfessor((Professor) newValue);
			return;
		case Sirius_newPackage.THESIS_MODEL__STUDENT:
			setStudent((Student) newValue);
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
		case Sirius_newPackage.THESIS_MODEL__UNIVERSITY:
			setUniversity((University) null);
			return;
		case Sirius_newPackage.THESIS_MODEL__THESIS:
			setThesis((Thesis) null);
			return;
		case Sirius_newPackage.THESIS_MODEL__PROFESSOR:
			setProfessor((Professor) null);
			return;
		case Sirius_newPackage.THESIS_MODEL__STUDENT:
			setStudent((Student) null);
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
		case Sirius_newPackage.THESIS_MODEL__UNIVERSITY:
			return university != null;
		case Sirius_newPackage.THESIS_MODEL__THESIS:
			return thesis != null;
		case Sirius_newPackage.THESIS_MODEL__PROFESSOR:
			return professor != null;
		case Sirius_newPackage.THESIS_MODEL__STUDENT:
			return student != null;
		}
		return super.eIsSet(featureID);
	}

} //ThesisModelImpl
