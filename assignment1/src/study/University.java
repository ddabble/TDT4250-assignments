/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.University#getName <em>Name</em>}</li>
 *   <li>{@link study.University#getStudyProgrammes <em>Study Programmes</em>}</li>
 *   <li>{@link study.University#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.University#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link study.StudyProgramme}.
	 * It is bidirectional and its opposite is '{@link study.StudyProgramme#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programmes</em>' containment reference list.
	 * @see study.StudyPackage#getUniversity_StudyProgrammes()
	 * @see study.StudyProgramme#getUniversity
	 * @model opposite="university" containment="true"
	 * @generated
	 */
	EList<StudyProgramme> getStudyProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.Course}.
	 * It is bidirectional and its opposite is '{@link study.Course#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getUniversity_Courses()
	 * @see study.Course#getUniversity
	 * @model opposite="university" containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link study.Student}.
	 * It is bidirectional and its opposite is '{@link study.Student#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see study.StudyPackage#getUniversity_Students()
	 * @see study.Student#getUniversity
	 * @model opposite="university" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // University
