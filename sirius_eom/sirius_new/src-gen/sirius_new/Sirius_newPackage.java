/**
 */
package sirius_new;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sirius_new.Sirius_newFactory
 * @model kind="package"
 * @generated
 */
public interface Sirius_newPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sirius_new";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sirius_new";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sirius_new";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sirius_newPackage eINSTANCE = sirius_new.impl.Sirius_newPackageImpl.init();

	/**
	 * The meta object id for the '{@link sirius_new.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.TaskImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.MilestoneImpl <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.MilestoneImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__COMPLETION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.StudentImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AGE = 1;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL_ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.ToolImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.EthicalIssueImpl <em>Ethical Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.EthicalIssueImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getEthicalIssue()
	 * @generated
	 */
	int ETHICAL_ISSUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_ISSUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Issue Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_ISSUE__ISSUE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Ethical Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_ISSUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ethical Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHICAL_ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.FacultyImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__DEPARTMENTS = 1;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.UniversityImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__FACULTY = 1;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.ProfessorImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.ThesisImpl <em>Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.ThesisImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getThesis()
	 * @generated
	 */
	int THESIS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__DEGREE = 2;

	/**
	 * The feature id for the '<em><b>Milestones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__MILESTONES = 3;

	/**
	 * The feature id for the '<em><b>Ethical Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__ETHICAL_ISSUES = 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__TASKS = 5;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__TOOLS = 6;

	/**
	 * The number of structural features of the '<em>Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.ThesisModelImpl <em>Thesis Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.ThesisModelImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getThesisModel()
	 * @generated
	 */
	int THESIS_MODEL = 9;

	/**
	 * The feature id for the '<em><b>University</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL__UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Thesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL__THESIS = 1;

	/**
	 * The feature id for the '<em><b>Professor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL__PROFESSOR = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL__STUDENT = 3;

	/**
	 * The number of structural features of the '<em>Thesis Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thesis Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.DepartmentImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.impl.DegreeImpl
	 * @see sirius_new.impl.Sirius_newPackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sirius_new.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sirius_new.Status
	 * @see sirius_new.impl.Sirius_newPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 12;

	/**
	 * Returns the meta object for class '{@link sirius_new.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see sirius_new.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Task#getTaskDescription <em>Task Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Description</em>'.
	 * @see sirius_new.Task#getTaskDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskDescription();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Task#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see sirius_new.Task#getDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see sirius_new.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for class '{@link sirius_new.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see sirius_new.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Milestone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Milestone#getName()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Name();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Milestone#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sirius_new.Milestone#getDescription()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Description();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Milestone#getCompletionDate <em>Completion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Date</em>'.
	 * @see sirius_new.Milestone#getCompletionDate()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_CompletionDate();

	/**
	 * Returns the meta object for class '{@link sirius_new.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see sirius_new.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Student#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see sirius_new.Student#getAge()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Age();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Student#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see sirius_new.Student#getEmailAddress()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_EmailAddress();

	/**
	 * Returns the meta object for class '{@link sirius_new.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see sirius_new.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for class '{@link sirius_new.EthicalIssue <em>Ethical Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethical Issue</em>'.
	 * @see sirius_new.EthicalIssue
	 * @generated
	 */
	EClass getEthicalIssue();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.EthicalIssue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.EthicalIssue#getName()
	 * @see #getEthicalIssue()
	 * @generated
	 */
	EAttribute getEthicalIssue_Name();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.EthicalIssue#getIssueDescription <em>Issue Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Description</em>'.
	 * @see sirius_new.EthicalIssue#getIssueDescription()
	 * @see #getEthicalIssue()
	 * @generated
	 */
	EAttribute getEthicalIssue_IssueDescription();

	/**
	 * Returns the meta object for class '{@link sirius_new.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see sirius_new.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Faculty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Faculty#getName()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.Faculty#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departments</em>'.
	 * @see sirius_new.Faculty#getDepartments()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Departments();

	/**
	 * Returns the meta object for class '{@link sirius_new.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see sirius_new.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.University#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Faculty</em>'.
	 * @see sirius_new.University#getFaculty()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Faculty();

	/**
	 * Returns the meta object for class '{@link sirius_new.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see sirius_new.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Professor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Professor#getName()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Name();

	/**
	 * Returns the meta object for class '{@link sirius_new.Thesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis</em>'.
	 * @see sirius_new.Thesis
	 * @generated
	 */
	EClass getThesis();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Thesis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Thesis#getName()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Name();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Thesis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sirius_new.Thesis#getDescription()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Description();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.Thesis#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degree</em>'.
	 * @see sirius_new.Thesis#getDegree()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Degree();

	/**
	 * Returns the meta object for the containment reference list '{@link sirius_new.Thesis#getMilestones <em>Milestones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestones</em>'.
	 * @see sirius_new.Thesis#getMilestones()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Milestones();

	/**
	 * Returns the meta object for the containment reference list '{@link sirius_new.Thesis#getEthicalIssues <em>Ethical Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ethical Issues</em>'.
	 * @see sirius_new.Thesis#getEthicalIssues()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_EthicalIssues();

	/**
	 * Returns the meta object for the containment reference list '{@link sirius_new.Thesis#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see sirius_new.Thesis#getTasks()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link sirius_new.Thesis#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see sirius_new.Thesis#getTools()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Tools();

	/**
	 * Returns the meta object for class '{@link sirius_new.ThesisModel <em>Thesis Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis Model</em>'.
	 * @see sirius_new.ThesisModel
	 * @generated
	 */
	EClass getThesisModel();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.ThesisModel#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>University</em>'.
	 * @see sirius_new.ThesisModel#getUniversity()
	 * @see #getThesisModel()
	 * @generated
	 */
	EReference getThesisModel_University();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.ThesisModel#getThesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thesis</em>'.
	 * @see sirius_new.ThesisModel#getThesis()
	 * @see #getThesisModel()
	 * @generated
	 */
	EReference getThesisModel_Thesis();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.ThesisModel#getProfessor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Professor</em>'.
	 * @see sirius_new.ThesisModel#getProfessor()
	 * @see #getThesisModel()
	 * @generated
	 */
	EReference getThesisModel_Professor();

	/**
	 * Returns the meta object for the containment reference '{@link sirius_new.ThesisModel#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Student</em>'.
	 * @see sirius_new.ThesisModel#getStudent()
	 * @see #getThesisModel()
	 * @generated
	 */
	EReference getThesisModel_Student();

	/**
	 * Returns the meta object for class '{@link sirius_new.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see sirius_new.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for class '{@link sirius_new.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see sirius_new.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for the attribute '{@link sirius_new.Degree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sirius_new.Degree#getName()
	 * @see #getDegree()
	 * @generated
	 */
	EAttribute getDegree_Name();

	/**
	 * Returns the meta object for enum '{@link sirius_new.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see sirius_new.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sirius_newFactory getSirius_newFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sirius_new.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.TaskImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Task Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_DESCRIPTION = eINSTANCE.getTask_TaskDescription();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DEADLINE = eINSTANCE.getTask_Deadline();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.MilestoneImpl <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.MilestoneImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__NAME = eINSTANCE.getMilestone_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__DESCRIPTION = eINSTANCE.getMilestone_Description();

		/**
		 * The meta object literal for the '<em><b>Completion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__COMPLETION_DATE = eINSTANCE.getMilestone_CompletionDate();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.StudentImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__AGE = eINSTANCE.getStudent_Age();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__EMAIL_ADDRESS = eINSTANCE.getStudent_EmailAddress();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.ToolImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.EthicalIssueImpl <em>Ethical Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.EthicalIssueImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getEthicalIssue()
		 * @generated
		 */
		EClass ETHICAL_ISSUE = eINSTANCE.getEthicalIssue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHICAL_ISSUE__NAME = eINSTANCE.getEthicalIssue_Name();

		/**
		 * The meta object literal for the '<em><b>Issue Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHICAL_ISSUE__ISSUE_DESCRIPTION = eINSTANCE.getEthicalIssue_IssueDescription();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.FacultyImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__NAME = eINSTANCE.getFaculty_Name();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__DEPARTMENTS = eINSTANCE.getFaculty_Departments();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.UniversityImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__FACULTY = eINSTANCE.getUniversity_Faculty();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.ProfessorImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__NAME = eINSTANCE.getProfessor_Name();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.ThesisImpl <em>Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.ThesisImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getThesis()
		 * @generated
		 */
		EClass THESIS = eINSTANCE.getThesis();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS__NAME = eINSTANCE.getThesis_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS__DESCRIPTION = eINSTANCE.getThesis_Description();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__DEGREE = eINSTANCE.getThesis_Degree();

		/**
		 * The meta object literal for the '<em><b>Milestones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__MILESTONES = eINSTANCE.getThesis_Milestones();

		/**
		 * The meta object literal for the '<em><b>Ethical Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__ETHICAL_ISSUES = eINSTANCE.getThesis_EthicalIssues();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__TASKS = eINSTANCE.getThesis_Tasks();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__TOOLS = eINSTANCE.getThesis_Tools();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.ThesisModelImpl <em>Thesis Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.ThesisModelImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getThesisModel()
		 * @generated
		 */
		EClass THESIS_MODEL = eINSTANCE.getThesisModel();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_MODEL__UNIVERSITY = eINSTANCE.getThesisModel_University();

		/**
		 * The meta object literal for the '<em><b>Thesis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_MODEL__THESIS = eINSTANCE.getThesisModel_Thesis();

		/**
		 * The meta object literal for the '<em><b>Professor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_MODEL__PROFESSOR = eINSTANCE.getThesisModel_Professor();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS_MODEL__STUDENT = eINSTANCE.getThesisModel_Student();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.DepartmentImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '{@link sirius_new.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.impl.DegreeImpl
		 * @see sirius_new.impl.Sirius_newPackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE__NAME = eINSTANCE.getDegree_Name();

		/**
		 * The meta object literal for the '{@link sirius_new.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sirius_new.Status
		 * @see sirius_new.impl.Sirius_newPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //Sirius_newPackage
