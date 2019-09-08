/**
 */
package study;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.CourseRelationship#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.CourseRelationship#getCourse <em>Course</em>}</li>
 *   <li>{@link study.CourseRelationship#getGrade <em>Grade</em>}</li>
 *   <li>{@link study.CourseRelationship#getNumExamAttempts <em>Num Exam Attempts</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getCourseRelationship()
 * @model
 * @generated
 */
public interface CourseRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.IndividualStudyPlan#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(IndividualStudyPlan)
	 * @see study.StudyPackage#getCourseRelationship_StudyPlan()
	 * @see study.IndividualStudyPlan#getCourses
	 * @model opposite="courses" required="true" transient="false"
	 * @generated
	 */
	IndividualStudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link study.CourseRelationship#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(IndividualStudyPlan value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see study.StudyPackage#getCourseRelationship_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link study.CourseRelationship#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link study.GradeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see study.GradeEnum
	 * @see #setGrade(GradeEnum)
	 * @see study.StudyPackage#getCourseRelationship_Grade()
	 * @model default="NONE"
	 * @generated
	 */
	GradeEnum getGrade();

	/**
	 * Sets the value of the '{@link study.CourseRelationship#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see study.GradeEnum
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(GradeEnum value);

	/**
	 * Returns the value of the '<em><b>Num Exam Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Exam Attempts</em>' attribute.
	 * @see #setNumExamAttempts(int)
	 * @see study.StudyPackage#getCourseRelationship_NumExamAttempts()
	 * @model
	 * @generated
	 */
	int getNumExamAttempts();

	/**
	 * Sets the value of the '{@link study.CourseRelationship#getNumExamAttempts <em>Num Exam Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Exam Attempts</em>' attribute.
	 * @see #getNumExamAttempts()
	 * @generated
	 */
	void setNumExamAttempts(int value);

} // CourseRelationship
