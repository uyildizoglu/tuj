/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.model.tac.admin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.model.tac.admin.ArtifactNotification#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.model.tac.admin.AdminPackage#getArtifactNotification()
 * @model
 * @generated
 */
public interface ArtifactNotification extends EObject {

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.model.tac.admin.AdminPackage#getArtifactNotification_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.model.tac.admin.ArtifactNotification#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ArtifactNotification
