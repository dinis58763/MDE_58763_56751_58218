/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sirius_new.Sirius_newPackage
 * @generated
 */
public interface Sirius_newFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sirius_newFactory eINSTANCE = sirius_new.impl.Sirius_newFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Milestone</em>'.
	 * @generated
	 */
	Milestone createMilestone();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Ethical Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethical Issue</em>'.
	 * @generated
	 */
	EthicalIssue createEthicalIssue();

	/**
	 * Returns a new object of class '<em>Faculty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Faculty</em>'.
	 * @generated
	 */
	Faculty createFaculty();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thesis</em>'.
	 * @generated
	 */
	Thesis createThesis();

	/**
	 * Returns a new object of class '<em>Thesis Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thesis Model</em>'.
	 * @generated
	 */
	ThesisModel createThesisModel();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree</em>'.
	 * @generated
	 */
	Degree createDegree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Sirius_newPackage getSirius_newPackage();

} //Sirius_newFactory
