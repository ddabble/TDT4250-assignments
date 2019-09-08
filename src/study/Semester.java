/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Semester#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link study.Semester#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link study.Semester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link study.Semester#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specialization)
	 * @see study.StudyPackage#getSemester_Specialization()
	 * @see study.Specialization#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link study.Semester#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(int)
	 * @see study.StudyPackage#getSemester_Ordinal()
	 * @model
	 * @generated
	 */
	int getOrdinal();

	/**
	 * Sets the value of the '{@link study.Semester#getOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #getOrdinal()
	 * @generated
	 */
	void setOrdinal(int value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link study.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see study.StudyPackage#getSemester_MandatoryCourses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link study.ElectiveCourseList#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference.
	 * @see #setElectiveCourses(ElectiveCourseList)
	 * @see study.StudyPackage#getSemester_ElectiveCourses()
	 * @see study.ElectiveCourseList#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	ElectiveCourseList getElectiveCourses();

	/**
	 * Sets the value of the '{@link study.Semester#getElectiveCourses <em>Elective Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Courses</em>' containment reference.
	 * @see #getElectiveCourses()
	 * @generated
	 */
	void setElectiveCourses(ElectiveCourseList value);

} // Semester
