/**
 */
package study.util;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import study.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see study.StudyPackage
 * @generated
 */
public class StudyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyValidator INSTANCE = new StudyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "study";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyPackage.STUDY_PROGRAMME:
				return validateStudyProgramme((StudyProgramme)value, diagnostics, context);
			case StudyPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case StudyPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyPackage.ELECTIVE_COURSE_LIST:
				return validateElectiveCourseList((ElectiveCourseList)value, diagnostics, context);
			case StudyPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case StudyPackage.INDIVIDUAL_STUDY_PLAN:
				return validateIndividualStudyPlan((IndividualStudyPlan)value, diagnostics, context);
			case StudyPackage.COURSE_RELATIONSHIP:
				return validateCourseRelationship((CourseRelationship)value, diagnostics, context);
			case StudyPackage.GRADE_ENUM:
				return validateGradeEnum((GradeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgramme(StudyProgramme studyProgramme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyProgramme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyProgramme, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyProgramme_allSpecializationsShouldAddUpToNumYears(studyProgramme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allSpecializationsShouldAddUpToNumYears constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateStudyProgramme_allSpecializationsShouldAddUpToNumYears(StudyProgramme studyProgramme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Predicate<Specialization> recursiveSumPredicate = s -> doAllFurtherSpecializationsAddUpToNumYears(s, studyProgramme.getNumYears());
		if (studyProgramme.getBaseSpecializations().stream().allMatch(recursiveSumPredicate))
			return true;
		else {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "allSpecializationsShouldAddUpToNumYears", getObjectLabel(studyProgramme, context) },
						 new Object[] { studyProgramme },
						 context));
			}
			return false;
		}
	}

	private static boolean doAllFurtherSpecializationsAddUpToNumYears(Specialization specialization, int numYears) {
		List<Specialization> furtherSpecializations = specialization.getFurtherSpecializations();
		if (furtherSpecializations.isEmpty())
			return specialization.getNumYears() == numYears;

		Predicate<Specialization> recursiveSumPredicate = s -> doAllFurtherSpecializationsAddUpToNumYears(s, numYears - specialization.getNumYears());
		return furtherSpecializations.stream().allMatch(recursiveSumPredicate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialization_semesterCountShouldAddUpToNumYears(specialization, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the semesterCountShouldAddUpToNumYears constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALIZATION__SEMESTER_COUNT_SHOULD_ADD_UP_TO_NUM_YEARS__EEXPRESSION = "self.semesters -> size() = 2*self.numYears";

	/**
	 * Validates the semesterCountShouldAddUpToNumYears constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization_semesterCountShouldAddUpToNumYears(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyPackage.Literals.SPECIALIZATION,
				 specialization,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "semesterCountShouldAddUpToNumYears",
				 SPECIALIZATION__SEMESTER_COUNT_SHOULD_ADD_UP_TO_NUM_YEARS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectiveCourseList(ElectiveCourseList electiveCourseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electiveCourseList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualStudyPlan(IndividualStudyPlan individualStudyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individualStudyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseRelationship(CourseRelationship courseRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradeEnum(GradeEnum gradeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyValidator
