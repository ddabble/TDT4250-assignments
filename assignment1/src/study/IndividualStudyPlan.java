/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.IndividualStudyPlan#getStudent <em>Student</em>}</li>
 *   <li>{@link study.IndividualStudyPlan#getCurrentSemester <em>Current Semester</em>}</li>
 *   <li>{@link study.IndividualStudyPlan#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getIndividualStudyPlan()
 * @model
 * @generated
 */
public interface IndividualStudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see study.StudyPackage#getIndividualStudyPlan_Student()
	 * @see study.Student#getStudyPlan
	 * @model opposite="studyPlan" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link study.IndividualStudyPlan#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Current Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Semester</em>' reference.
	 * @see #setCurrentSemester(Semester)
	 * @see study.StudyPackage#getIndividualStudyPlan_CurrentSemester()
	 * @model required="true"
	 * @generated
	 */
	Semester getCurrentSemester();

	/**
	 * Sets the value of the '{@link study.IndividualStudyPlan#getCurrentSemester <em>Current Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Semester</em>' reference.
	 * @see #getCurrentSemester()
	 * @generated
	 */
	void setCurrentSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.CourseRelationship}.
	 * It is bidirectional and its opposite is '{@link study.CourseRelationship#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getIndividualStudyPlan_Courses()
	 * @see study.CourseRelationship#getStudyPlan
	 * @model opposite="studyPlan" containment="true"
	 * @generated
	 */
	EList<CourseRelationship> getCourses();

} // IndividualStudyPlan
