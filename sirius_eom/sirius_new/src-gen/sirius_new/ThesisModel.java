/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius_new.ThesisModel#getUniversity <em>University</em>}</li>
 *   <li>{@link sirius_new.ThesisModel#getThesis <em>Thesis</em>}</li>
 *   <li>{@link sirius_new.ThesisModel#getProfessor <em>Professor</em>}</li>
 *   <li>{@link sirius_new.ThesisModel#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see sirius_new.Sirius_newPackage#getThesisModel()
 * @model
 * @generated
 */
public interface ThesisModel extends EObject {
	/**
	 * Returns the value of the '<em><b>University</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' containment reference.
	 * @see #setUniversity(University)
	 * @see sirius_new.Sirius_newPackage#getThesisModel_University()
	 * @model containment="true" required="true"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link sirius_new.ThesisModel#getUniversity <em>University</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' containment reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * Returns the value of the '<em><b>Thesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis</em>' containment reference.
	 * @see #setThesis(Thesis)
	 * @see sirius_new.Sirius_newPackage#getThesisModel_Thesis()
	 * @model containment="true"
	 * @generated
	 */
	Thesis getThesis();

	/**
	 * Sets the value of the '{@link sirius_new.ThesisModel#getThesis <em>Thesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesis</em>' containment reference.
	 * @see #getThesis()
	 * @generated
	 */
	void setThesis(Thesis value);

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' containment reference.
	 * @see #setProfessor(Professor)
	 * @see sirius_new.Sirius_newPackage#getThesisModel_Professor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Professor getProfessor();

	/**
	 * Sets the value of the '{@link sirius_new.ThesisModel#getProfessor <em>Professor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Professor</em>' containment reference.
	 * @see #getProfessor()
	 * @generated
	 */
	void setProfessor(Professor value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference.
	 * @see #setStudent(Student)
	 * @see sirius_new.Sirius_newPackage#getThesisModel_Student()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link sirius_new.ThesisModel#getStudent <em>Student</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' containment reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // ThesisModel
