/**
 */
package sirius_new.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sirius_new.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sirius_new.Sirius_newPackage
 * @generated
 */
public class Sirius_newSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Sirius_newPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sirius_newSwitch() {
		if (modelPackage == null) {
			modelPackage = Sirius_newPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Sirius_newPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.MILESTONE: {
			Milestone milestone = (Milestone) theEObject;
			T result = caseMilestone(milestone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.STUDENT: {
			Student student = (Student) theEObject;
			T result = caseStudent(student);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.TOOL: {
			Tool tool = (Tool) theEObject;
			T result = caseTool(tool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.ETHICAL_ISSUE: {
			EthicalIssue ethicalIssue = (EthicalIssue) theEObject;
			T result = caseEthicalIssue(ethicalIssue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.FACULTY: {
			Faculty faculty = (Faculty) theEObject;
			T result = caseFaculty(faculty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.UNIVERSITY: {
			University university = (University) theEObject;
			T result = caseUniversity(university);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.PROFESSOR: {
			Professor professor = (Professor) theEObject;
			T result = caseProfessor(professor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.THESIS: {
			Thesis thesis = (Thesis) theEObject;
			T result = caseThesis(thesis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.THESIS_MODEL: {
			ThesisModel thesisModel = (ThesisModel) theEObject;
			T result = caseThesisModel(thesisModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.DEPARTMENT: {
			Department department = (Department) theEObject;
			T result = caseDepartment(department);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sirius_newPackage.DEGREE: {
			Degree degree = (Degree) theEObject;
			T result = caseDegree(degree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Milestone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilestone(Milestone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethical Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethical Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthicalIssue(EthicalIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Faculty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Faculty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaculty(Faculty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversity(University object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor(Professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesis(Thesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thesis Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thesis Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThesisModel(ThesisModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartment(Department object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree(Degree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Sirius_newSwitch
