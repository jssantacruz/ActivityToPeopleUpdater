
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.icesi.activitytopeopleupdater.peoplenet.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 38555240
 */
@Embeddable
public class M4ccbCvActInvesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_ORGANIZATION")
    private String idOrganization;
    @Basic(optional = false)
    @Column(name = "CCB_OR_ACT_INV")
    private short ccbOrActInv;
    @Basic(optional = false)
    @Column(name = "STD_ID_HR")
    private String stdIdHr;

    public M4ccbCvActInvesPK() {
    }

    public M4ccbCvActInvesPK(String idOrganization, short ccbOrActInv, String stdIdHr) {
        this.idOrganization = idOrganization;
        this.ccbOrActInv = ccbOrActInv;
        this.stdIdHr = stdIdHr;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    public short getCcbOrActInv() {
        return ccbOrActInv;
    }

    public void setCcbOrActInv(short ccbOrActInv) {
        this.ccbOrActInv = ccbOrActInv;
    }

    public String getStdIdHr() {
        return stdIdHr;
    }

    public void setStdIdHr(String stdIdHr) {
        this.stdIdHr = stdIdHr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrganization != null ? idOrganization.hashCode() : 0);
        hash += (int) ccbOrActInv;
        hash += (stdIdHr != null ? stdIdHr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof M4ccbCvActInvesPK)) {
            return false;
        }
        M4ccbCvActInvesPK other = (M4ccbCvActInvesPK) object;
        if ((this.idOrganization == null && other.idOrganization != null) || (this.idOrganization != null && !this.idOrganization.equals(other.idOrganization))) {
            return false;
        }
        if (this.ccbOrActInv != other.ccbOrActInv) {
            return false;
        }
        if ((this.stdIdHr == null && other.stdIdHr != null) || (this.stdIdHr != null && !this.stdIdHr.equals(other.stdIdHr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.icesi.activitytopeopleupdater.peoplenet.model.M4ccbCvActInvesPK[ idOrganization=" + idOrganization + ", ccbOrActInv=" + ccbOrActInv + ", stdIdHr=" + stdIdHr + " ]";
    }
    
}
