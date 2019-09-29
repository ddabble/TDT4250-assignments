/**
 */
package study.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import study.Course;
import study.CourseRelationship;
import study.GradeEnum;
import study.IndividualStudyPlan;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.CourseRelationshipImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.impl.CourseRelationshipImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link study.impl.CourseRelationshipImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link study.impl.CourseRelationshipImpl#getNumExamAttempts <em>Num Exam Attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseRelationshipImpl extends MinimalEObjectImpl.Container implements CourseRelationship {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final GradeEnum GRADE_EDEFAULT = GradeEnum.NONE;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected GradeEnum grade = GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumExamAttempts() <em>Num Exam Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExamAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EXAM_ATTEMPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumExamAttempts() <em>Num Exam Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExamAttempts()
	 * @generated
	 * @ordered
	 */
	protected int numExamAttempts = NUM_EXAM_ATTEMPTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.COURSE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualStudyPlan getStudyPlan() {
		if (eContainerFeatureID() != StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN) return null;
		return (IndividualStudyPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(IndividualStudyPlan newStudyPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyPlan, StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlan(IndividualStudyPlan newStudyPlan) {
		if (newStudyPlan != eInternalContainer() || (eContainerFeatureID() != StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN && newStudyPlan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES, IndividualStudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.COURSE_RELATIONSHIP__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_RELATIONSHIP__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradeEnum getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(GradeEnum newGrade) {
		GradeEnum oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_RELATIONSHIP__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumExamAttempts() {
		return numExamAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumExamAttempts(int newNumExamAttempts) {
		int oldNumExamAttempts = numExamAttempts;
		numExamAttempts = newNumExamAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_RELATIONSHIP__NUM_EXAM_ATTEMPTS, oldNumExamAttempts, numExamAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyPlan((IndividualStudyPlan)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				return eInternalContainer().eInverseRemove(this, StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES, IndividualStudyPlan.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				return getStudyPlan();
			case StudyPackage.COURSE_RELATIONSHIP__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case StudyPackage.COURSE_RELATIONSHIP__GRADE:
				return getGrade();
			case StudyPackage.COURSE_RELATIONSHIP__NUM_EXAM_ATTEMPTS:
				return getNumExamAttempts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				setStudyPlan((IndividualStudyPlan)newValue);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__COURSE:
				setCourse((Course)newValue);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__GRADE:
				setGrade((GradeEnum)newValue);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__NUM_EXAM_ATTEMPTS:
				setNumExamAttempts((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				setStudyPlan((IndividualStudyPlan)null);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__COURSE:
				setCourse((Course)null);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case StudyPackage.COURSE_RELATIONSHIP__NUM_EXAM_ATTEMPTS:
				setNumExamAttempts(NUM_EXAM_ATTEMPTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN:
				return getStudyPlan() != null;
			case StudyPackage.COURSE_RELATIONSHIP__COURSE:
				return course != null;
			case StudyPackage.COURSE_RELATIONSHIP__GRADE:
				return grade != GRADE_EDEFAULT;
			case StudyPackage.COURSE_RELATIONSHIP__NUM_EXAM_ATTEMPTS:
				return numExamAttempts != NUM_EXAM_ATTEMPTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (grade: ");
		result.append(grade);
		result.append(", numExamAttempts: ");
		result.append(numExamAttempts);
		result.append(')');
		return result.toString();
	}

} //CourseRelationshipImpl
