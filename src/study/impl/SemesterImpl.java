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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import study.Course;
import study.ElectiveCourseList;
import study.Semester;
import study.Specialization;
import study.StudyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.SemesterImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected int ordinal = ORDINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected ElectiveCourseList electiveCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpecialization() {
		if (eContainerFeatureID() != StudyPackage.SEMESTER__SPECIALIZATION) return null;
		return (Specialization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Specialization newSpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialization, StudyPackage.SEMESTER__SPECIALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(Specialization newSpecialization) {
		if (newSpecialization != eInternalContainer() || (eContainerFeatureID() != StudyPackage.SEMESTER__SPECIALIZATION && newSpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject)newSpecialization).eInverseAdd(this, StudyPackage.SPECIALIZATION__SEMESTERS, Specialization.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SPECIALIZATION, newSpecialization, newSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdinal(int newOrdinal) {
		int oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__ORDINAL, oldOrdinal, ordinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyPackage.SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseList getElectiveCourses() {
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectiveCourses(ElectiveCourseList newElectiveCourses, NotificationChain msgs) {
		ElectiveCourseList oldElectiveCourses = electiveCourses;
		electiveCourses = newElectiveCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__ELECTIVE_COURSES, oldElectiveCourses, newElectiveCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectiveCourses(ElectiveCourseList newElectiveCourses) {
		if (newElectiveCourses != electiveCourses) {
			NotificationChain msgs = null;
			if (electiveCourses != null)
				msgs = ((InternalEObject)electiveCourses).eInverseRemove(this, StudyPackage.ELECTIVE_COURSE_LIST__SEMESTER, ElectiveCourseList.class, msgs);
			if (newElectiveCourses != null)
				msgs = ((InternalEObject)newElectiveCourses).eInverseAdd(this, StudyPackage.ELECTIVE_COURSE_LIST__SEMESTER, ElectiveCourseList.class, msgs);
			msgs = basicSetElectiveCourses(newElectiveCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__ELECTIVE_COURSES, newElectiveCourses, newElectiveCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__SPECIALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialization((Specialization)otherEnd, msgs);
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				if (electiveCourses != null)
					msgs = ((InternalEObject)electiveCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPackage.SEMESTER__ELECTIVE_COURSES, null, msgs);
				return basicSetElectiveCourses((ElectiveCourseList)otherEnd, msgs);
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return basicSetSpecialization(null, msgs);
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				return basicSetElectiveCourses(null, msgs);
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return eInternalContainer().eInverseRemove(this, StudyPackage.SPECIALIZATION__SEMESTERS, Specialization.class, msgs);
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return getSpecialization();
			case StudyPackage.SEMESTER__ORDINAL:
				return getOrdinal();
			case StudyPackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
				return;
			case StudyPackage.SEMESTER__ORDINAL:
				setOrdinal((Integer)newValue);
				return;
			case StudyPackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				setElectiveCourses((ElectiveCourseList)newValue);
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				setSpecialization((Specialization)null);
				return;
			case StudyPackage.SEMESTER__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
				return;
			case StudyPackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				setElectiveCourses((ElectiveCourseList)null);
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
			case StudyPackage.SEMESTER__SPECIALIZATION:
				return getSpecialization() != null;
			case StudyPackage.SEMESTER__ORDINAL:
				return ordinal != ORDINAL_EDEFAULT;
			case StudyPackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case StudyPackage.SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null;
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
		result.append(" (ordinal: ");
		result.append(ordinal);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
