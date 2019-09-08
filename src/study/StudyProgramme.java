/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.StudyProgramme#getCode <em>Code</em>}</li>
 *   <li>{@link study.StudyProgramme#getName <em>Name</em>}</li>
 *   <li>{@link study.StudyProgramme#getUniversity <em>University</em>}</li>
 *   <li>{@link study.StudyProgramme#getNumYears <em>Num Years</em>}</li>
 *   <li>{@link study.StudyProgramme#getBaseSpecializations <em>Base Specializations</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getStudyProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allSpecializationsShouldAddUpToNumYears'"
 * @generated
 */
public interface StudyProgramme extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see study.StudyPackage#getStudyProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link study.StudyProgramme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getStudyProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.StudyProgramme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.University#getStudyProgrammes <em>Study Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' container reference.
	 * @see #setUniversity(University)
	 * @see study.StudyPackage#getStudyProgramme_University()
	 * @see study.University#getStudyProgrammes
	 * @model opposite="studyProgrammes" required="true" transient="false"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link study.StudyProgramme#getUniversity <em>University</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' container reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * Returns the value of the '<em><b>Num Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Years</em>' attribute.
	 * @see #setNumYears(int)
	 * @see study.StudyPackage#getStudyProgramme_NumYears()
	 * @model
	 * @generated
	 */
	int getNumYears();

	/**
	 * Sets the value of the '{@link study.StudyProgramme#getNumYears <em>Num Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Years</em>' attribute.
	 * @see #getNumYears()
	 * @generated
	 */
	void setNumYears(int value);

	/**
	 * Returns the value of the '<em><b>Base Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link study.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Specializations</em>' containment reference list.
	 * @see study.StudyPackage#getStudyProgramme_BaseSpecializations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Specialization> getBaseSpecializations();

} // StudyProgramme
