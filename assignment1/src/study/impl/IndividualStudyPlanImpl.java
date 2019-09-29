/**
 */
package study.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import study.CourseRelationship;
import study.IndividualStudyPlan;
import study.Semester;
import study.Student;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.IndividualStudyPlanImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link study.impl.IndividualStudyPlanImpl#getCurrentSemester <em>Current Semester</em>}</li>
 *   <li>{@link study.impl.IndividualStudyPlanImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualStudyPlanImpl extends MinimalEObjectImpl.Container implements IndividualStudyPlan {
	/**
	 * The cached value of the '{@link #getCurrentSemester() <em>Current Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester currentSemester;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseRelationship> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualStudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.INDIVIDUAL_STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, StudyPackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getCurrentSemester() {
		if (currentSemester != null && currentSemester.eIsProxy()) {
			InternalEObject oldCurrentSemester = (InternalEObject)currentSemester;
			currentSemester = (Semester)eResolveProxy(oldCurrentSemester);
			if (currentSemester != oldCurrentSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER, oldCurrentSemester, currentSemester));
			}
		}
		return currentSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetCurrentSemester() {
		return currentSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentSemester(Semester newCurrentSemester) {
		Semester oldCurrentSemester = currentSemester;
		currentSemester = newCurrentSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER, oldCurrentSemester, currentSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseRelationship> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<CourseRelationship>(CourseRelationship.class, this, StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES, StudyPackage.COURSE_RELATIONSHIP__STUDY_PLAN);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
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
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				return basicSetStudent(null, msgs);
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				return eInternalContainer().eInverseRemove(this, StudyPackage.STUDENT__STUDY_PLAN, Student.class, msgs);
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
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				return getStudent();
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER:
				if (resolve) return getCurrentSemester();
				return basicGetCurrentSemester();
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				return getCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				setStudent((Student)newValue);
				return;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER:
				setCurrentSemester((Semester)newValue);
				return;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends CourseRelationship>)newValue);
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
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				setStudent((Student)null);
				return;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER:
				setCurrentSemester((Semester)null);
				return;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				getCourses().clear();
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
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__STUDENT:
				return getStudent() != null;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__CURRENT_SEMESTER:
				return currentSemester != null;
			case StudyPackage.INDIVIDUAL_STUDY_PLAN__COURSES:
				return courses != null && !courses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualStudyPlanImpl
