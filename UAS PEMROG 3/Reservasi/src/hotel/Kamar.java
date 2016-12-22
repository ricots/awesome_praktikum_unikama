/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jovi MONG
 */
@Entity
@Table(name = "kamar", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Kamar.findAll", query = "SELECT k FROM Kamar k"),
    @NamedQuery(name = "Kamar.findByIdKamar", query = "SELECT k FROM Kamar k WHERE k.idKamar = :idKamar"),
    @NamedQuery(name = "Kamar.findByNama", query = "SELECT k FROM Kamar k WHERE k.nama = :nama"),
    @NamedQuery(name = "Kamar.findByKelas", query = "SELECT k FROM Kamar k WHERE k.kelas = :kelas"),
    @NamedQuery(name = "Kamar.findByNomor", query = "SELECT k FROM Kamar k WHERE k.nomor = :nomor"),
    @NamedQuery(name = "Kamar.findByKeterangan", query = "SELECT k FROM Kamar k WHERE k.keterangan = :keterangan")})
public class Kamar implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kamar")
    private String idKamar;
    @Column(name = "nama")
    private String nama;
    @Column(name = "kelas")
    private String kelas;
    @Column(name = "nomor")
    private String nomor;
    @Column(name = "Keterangan")
    private String keterangan;

    public Kamar() {
    }

    public Kamar(String idKamar) {
        this.idKamar = idKamar;
    }

    public String getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(String idKamar) {
        String oldIdKamar = this.idKamar;
        this.idKamar = idKamar;
        changeSupport.firePropertyChange("idKamar", oldIdKamar, idKamar);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        String oldKelas = this.kelas;
        this.kelas = kelas;
        changeSupport.firePropertyChange("kelas", oldKelas, kelas);
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        String oldNomor = this.nomor;
        this.nomor = nomor;
        changeSupport.firePropertyChange("nomor", oldNomor, nomor);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKamar != null ? idKamar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kamar)) {
            return false;
        }
        Kamar other = (Kamar) object;
        if ((this.idKamar == null && other.idKamar != null) || (this.idKamar != null && !this.idKamar.equals(other.idKamar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Kamar[ idKamar=" + idKamar + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
