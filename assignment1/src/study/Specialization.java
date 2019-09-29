/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Specialization#getStudyProgramme <em>Study Programme</em>}</li>
 *   <li>{@link study.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link study.Specialization#getNumYears <em>Num Years</em>}</li>
 *   <li>{@link study.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link study.Specialization#getFurtherSpecializations <em>Further Specializations</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterCountShouldAddUpToNumYears'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 semesterCountShouldAddUpToNumYears='self.semesters -&gt; size() = 2*self.numYears'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.StudyProgramme#getAllSpecializations <em>All Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programme</em>' container reference.
	 * @see #setStudyProgramme(StudyProgramme)
	 * @see study.StudyPackage#getSpecialization_StudyProgramme()
	 * @see study.StudyProgramme#getAllSpecializations
	 * @model opposite="allSpecializations" required="true" transient="false"
	 * @generated
	 */
	StudyProgramme getStudyProgramme();

	/**
	 * Sets the value of the '{@link study.Specialization#getStudyProgramme <em>Study Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Programme</em>' container reference.
	 * @see #getStudyProgramme()
	 * @generated
	 */
	void setStudyProgramme(StudyProgramme value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Years</em>' attribute.
	 * @see #setNumYears(int)
	 * @see study.StudyPackage#getSpecialization_NumYears()
	 * @model
	 * @generated
	 */
	int getNumYears();

	/**
	 * Sets the value of the '{@link study.Specialization#getNumYears <em>Num Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Years</em>' attribute.
	 * @see #getNumYears()
	 * @generated
	 */
	void setNumYears(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link study.Semester}.
	 * It is bidirectional and its opposite is '{@link study.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see study.StudyPackage#getSpecialization_Semesters()
	 * @see study.Semester#getSpecialization
	 * @model opposite="specialization" containment="true" lower="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Further Specializations</b></em>' reference list.
	 * The list contents are of type {@link study.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Specializations</em>' reference list.
	 * @see study.StudyPackage#getSpecialization_FurtherSpecializations()
	 * @model
	 * @generated
	 */
	EList<Specialization> getFurtherSpecializations();

} // Specialization
