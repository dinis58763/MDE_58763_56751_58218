/**
 */
package sirius_new;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.Thesis#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.Thesis#getDescription <em>Description</em>}</li>
 *   <li>{@link sirius_new.Thesis#getDegree <em>Degree</em>}</li>
 *   <li>{@link sirius_new.Thesis#getMilestones <em>Milestones</em>}</li>
 *   <li>{@link sirius_new.Thesis#getEthicalIssues <em>Ethical Issues</em>}</li>
 *   <li>{@link sirius_new.Thesis#getTasks <em>Tasks</em>}</li>
 *   <li>{@link sirius_new.Thesis#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getThesis()
 * @model
 * @generated
 */
public interface Thesis extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getThesis_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.Thesis#getName <em>Name</em>}' attribute.
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
	 * @see sirius_new.Sirius_newPackage#getThesis_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link sirius_new.Thesis#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(Degree)
	 * @see sirius_new.Sirius_newPackage#getThesis_Degree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Degree getDegree();

	/**
	 * Sets the value of the '{@link sirius_new.Thesis#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Degree value);

	/**
	 * Returns the value of the '<em><b>Milestones</b></em>' containment reference list.
	 * The list contents are of type {@link sirius_new.Milestone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestones</em>' containment reference list.
	 * @see sirius_new.Sirius_newPackage#getThesis_Milestones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Milestone> getMilestones();

	/**
	 * Returns the value of the '<em><b>Ethical Issues</b></em>' containment reference list.
	 * The list contents are of type {@link sirius_new.EthicalIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethical Issues</em>' containment reference list.
	 * @see sirius_new.Sirius_newPackage#getThesis_EthicalIssues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EthicalIssue> getEthicalIssues();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link sirius_new.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see sirius_new.Sirius_newPackage#getThesis_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link sirius_new.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see sirius_new.Sirius_newPackage#getThesis_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

} // Thesis
