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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import study.Specialization;
import study.StudyPackage;
import study.StudyProgramme;
import study.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.StudyProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link study.impl.StudyProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link study.impl.StudyProgrammeImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link study.impl.StudyProgrammeImpl#getNumYears <em>Num Years</em>}</li>
 *   <li>{@link study.impl.StudyProgrammeImpl#getAllSpecializations <em>All Specializations</em>}</li>
 *   <li>{@link study.impl.StudyProgrammeImpl#getBaseSpecializations <em>Base Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgrammeImpl extends MinimalEObjectImpl.Container implements StudyProgramme {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumYears() <em>Num Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumYears() <em>Num Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumYears()
	 * @generated
	 * @ordered
	 */
	protected int numYears = NUM_YEARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllSpecializations() <em>All Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> allSpecializations;

	/**
	 * The cached value of the '{@link #getBaseSpecializations() <em>Base Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> baseSpecializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.STUDY_PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY_PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY_PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (eContainerFeatureID() != StudyPackage.STUDY_PROGRAMME__UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniversity, StudyPackage.STUDY_PROGRAMME__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer() || (eContainerFeatureID() != StudyPackage.STUDY_PROGRAMME__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject)newUniversity).eInverseAdd(this, StudyPackage.UNIVERSITY__STUDY_PROGRAMMES, University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY_PROGRAMME__UNIVERSITY, newUniversity, newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumYears() {
		return numYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumYears(int newNumYears) {
		int oldNumYears = numYears;
		numYears = newNumYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY_PROGRAMME__NUM_YEARS, oldNumYears, numYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getAllSpecializations() {
		if (allSpecializations == null) {
			allSpecializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS, StudyPackage.SPECIALIZATION__STUDY_PROGRAMME);
		}
		return allSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getBaseSpecializations() {
		if (baseSpecializations == null) {
			baseSpecializations = new EObjectResolvingEList<Specialization>(Specialization.class, this, StudyPackage.STUDY_PROGRAMME__BASE_SPECIALIZATIONS);
		}
		return baseSpecializations;
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
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniversity((University)otherEnd, msgs);
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllSpecializations()).basicAdd(otherEnd, msgs);
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
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				return basicSetUniversity(null, msgs);
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				return ((InternalEList<?>)getAllSpecializations()).basicRemove(otherEnd, msgs);
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
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, StudyPackage.UNIVERSITY__STUDY_PROGRAMMES, University.class, msgs);
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
			case StudyPackage.STUDY_PROGRAMME__CODE:
				return getCode();
			case StudyPackage.STUDY_PROGRAMME__NAME:
				return getName();
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				return getUniversity();
			case StudyPackage.STUDY_PROGRAMME__NUM_YEARS:
				return getNumYears();
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				return getAllSpecializations();
			case StudyPackage.STUDY_PROGRAMME__BASE_SPECIALIZATIONS:
				return getBaseSpecializations();
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
			case StudyPackage.STUDY_PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case StudyPackage.STUDY_PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				setUniversity((University)newValue);
				return;
			case StudyPackage.STUDY_PROGRAMME__NUM_YEARS:
				setNumYears((Integer)newValue);
				return;
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				getAllSpecializations().clear();
				getAllSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyPackage.STUDY_PROGRAMME__BASE_SPECIALIZATIONS:
				getBaseSpecializations().clear();
				getBaseSpecializations().addAll((Collection<? extends Specialization>)newValue);
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
			case StudyPackage.STUDY_PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyPackage.STUDY_PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				setUniversity((University)null);
				return;
			case StudyPackage.STUDY_PROGRAMME__NUM_YEARS:
				setNumYears(NUM_YEARS_EDEFAULT);
				return;
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				getAllSpecializations().clear();
				return;
			case StudyPackage.STUDY_PROGRAMME__BASE_SPECIALIZATIONS:
				getBaseSpecializations().clear();
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
			case StudyPackage.STUDY_PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyPackage.STUDY_PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyPackage.STUDY_PROGRAMME__UNIVERSITY:
				return getUniversity() != null;
			case StudyPackage.STUDY_PROGRAMME__NUM_YEARS:
				return numYears != NUM_YEARS_EDEFAULT;
			case StudyPackage.STUDY_PROGRAMME__ALL_SPECIALIZATIONS:
				return allSpecializations != null && !allSpecializations.isEmpty();
			case StudyPackage.STUDY_PROGRAMME__BASE_SPECIALIZATIONS:
				return baseSpecializations != null && !baseSpecializations.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", numYears: ");
		result.append(numYears);
		result.append(')');
		return result.toString();
	}

} //StudyProgrammeImpl
