/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethical Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.EthicalIssue#getName <em>Name</em>}</li>
 *   <li>{@link sirius_new.EthicalIssue#getIssueDescription <em>Issue Description</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getEthicalIssue()
 * @model
 * @generated
 */
public interface EthicalIssue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius_new.Sirius_newPackage#getEthicalIssue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius_new.EthicalIssue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Issue Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Description</em>' attribute.
	 * @see #setIssueDescription(String)
	 * @see sirius_new.Sirius_newPackage#getEthicalIssue_IssueDescription()
	 * @model
	 * @generated
	 */
	String getIssueDescription();

	/**
	 * Sets the value of the '{@link sirius_new.EthicalIssue#getIssueDescription <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Description</em>' attribute.
	 * @see #getIssueDescription()
	 * @generated
	 */
	void setIssueDescription(String value);

} // EthicalIssue
