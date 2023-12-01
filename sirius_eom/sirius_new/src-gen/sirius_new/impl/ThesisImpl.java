/**
 */
package sirius_new.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sirius_new.Degree;
import sirius_new.EthicalIssue;
import sirius_new.Milestone;
import sirius_new.Sirius_newPackage;
import sirius_new.Task;
import sirius_new.Thesis;
import sirius_new.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.impl.ThesisImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getMilestones <em>Milestones</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getEthicalIssues <em>Ethical Issues</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link sirius_new.impl.ThesisImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThesisImpl extends MinimalEObjectImpl.Container implements Thesis {
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
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected Degree degree;

	/**
	 * The cached value of the '{@link #getMilestones() <em>Milestones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestones()
	 * @generated
	 * @ordered
	 */
	protected EList<Milestone> milestones;

	/**
	 * The cached value of the '{@link #getEthicalIssues() <em>Ethical Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthicalIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<EthicalIssue> ethicalIssues;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sirius_newPackage.Literals.THESIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegree(Degree newDegree, NotificationChain msgs) {
		Degree oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Sirius_newPackage.THESIS__DEGREE, oldDegree, newDegree);
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
	public void setDegree(Degree newDegree) {
		if (newDegree != degree) {
			NotificationChain msgs = null;
			if (degree != null)
				msgs = ((InternalEObject) degree).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS__DEGREE, null, msgs);
			if (newDegree != null)
				msgs = ((InternalEObject) newDegree).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Sirius_newPackage.THESIS__DEGREE, null, msgs);
			msgs = basicSetDegree(newDegree, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sirius_newPackage.THESIS__DEGREE, newDegree,
					newDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Milestone> getMilestones() {
		if (milestones == null) {
			milestones = new EObjectContainmentEList<Milestone>(Milestone.class, this,
					Sirius_newPackage.THESIS__MILESTONES);
		}
		return milestones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EthicalIssue> getEthicalIssues() {
		if (ethicalIssues == null) {
			ethicalIssues = new EObjectContainmentEList<EthicalIssue>(EthicalIssue.class, this,
					Sirius_newPackage.THESIS__ETHICAL_ISSUES);
		}
		return ethicalIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, Sirius_newPackage.THESIS__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, Sirius_newPackage.THESIS__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Sirius_newPackage.THESIS__DEGREE:
			return basicSetDegree(null, msgs);
		case Sirius_newPackage.THESIS__MILESTONES:
			return ((InternalEList<?>) getMilestones()).basicRemove(otherEnd, msgs);
		case Sirius_newPackage.THESIS__ETHICAL_ISSUES:
			return ((InternalEList<?>) getEthicalIssues()).basicRemove(otherEnd, msgs);
		case Sirius_newPackage.THESIS__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case Sirius_newPackage.THESIS__TOOLS:
			return ((InternalEList<?>) getTools()).basicRemove(otherEnd, msgs);
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
		case Sirius_newPackage.THESIS__NAME:
			return getName();
		case Sirius_newPackage.THESIS__DESCRIPTION:
			return getDescription();
		case Sirius_newPackage.THESIS__DEGREE:
			return getDegree();
		case Sirius_newPackage.THESIS__MILESTONES:
			return getMilestones();
		case Sirius_newPackage.THESIS__ETHICAL_ISSUES:
			return getEthicalIssues();
		case Sirius_newPackage.THESIS__TASKS:
			return getTasks();
		case Sirius_newPackage.THESIS__TOOLS:
			return getTools();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Sirius_newPackage.THESIS__NAME:
			setName((String) newValue);
			return;
		case Sirius_newPackage.THESIS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Sirius_newPackage.THESIS__DEGREE:
			setDegree((Degree) newValue);
			return;
		case Sirius_newPackage.THESIS__MILESTONES:
			getMilestones().clear();
			getMilestones().addAll((Collection<? extends Milestone>) newValue);
			return;
		case Sirius_newPackage.THESIS__ETHICAL_ISSUES:
			getEthicalIssues().clear();
			getEthicalIssues().addAll((Collection<? extends EthicalIssue>) newValue);
			return;
		case Sirius_newPackage.THESIS__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case Sirius_newPackage.THESIS__TOOLS:
			getTools().clear();
			getTools().addAll((Collection<? extends Tool>) newValue);
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
		case Sirius_newPackage.THESIS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Sirius_newPackage.THESIS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Sirius_newPackage.THESIS__DEGREE:
			setDegree((Degree) null);
			return;
		case Sirius_newPackage.THESIS__MILESTONES:
			getMilestones().clear();
			return;
		case Sirius_newPackage.THESIS__ETHICAL_ISSUES:
			getEthicalIssues().clear();
			return;
		case Sirius_newPackage.THESIS__TASKS:
			getTasks().clear();
			return;
		case Sirius_newPackage.THESIS__TOOLS:
			getTools().clear();
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
		case Sirius_newPackage.THESIS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Sirius_newPackage.THESIS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Sirius_newPackage.THESIS__DEGREE:
			return degree != null;
		case Sirius_newPackage.THESIS__MILESTONES:
			return milestones != null && !milestones.isEmpty();
		case Sirius_newPackage.THESIS__ETHICAL_ISSUES:
			return ethicalIssues != null && !ethicalIssues.isEmpty();
		case Sirius_newPackage.THESIS__TASKS:
			return tasks != null && !tasks.isEmpty();
		case Sirius_newPackage.THESIS__TOOLS:
			return tools != null && !tools.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ThesisImpl
