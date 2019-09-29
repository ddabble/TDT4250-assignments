/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Course List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.ElectiveCourseList#getSemester <em>Semester</em>}</li>
 *   <li>{@link study.ElectiveCourseList#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getElectiveCourseList()
 * @model
 * @generated
 */
public interface ElectiveCourseList extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Semester#getElectiveCourses <em>Elective Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see study.StudyPackage#getElectiveCourseList_Semester()
	 * @see study.Semester#getElectiveCourses
	 * @model opposite="electiveCourses" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link study.ElectiveCourseList#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link study.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see study.StudyPackage#getElectiveCourseList_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // ElectiveCourseList
