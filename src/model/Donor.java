package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Donors")
public class Donor {
	

	
	@Id
	@Column(name="demail")
	private String demail;
	@Column(name="dfname")
	private String dfname;
	@Column(name="dlname")
	private String  dlname;
	@Column(name="dbloodgroup")
	private String  dbloodgroup;
	@Column(name="dpassword")
	private String  dpassword;
	@Column(name="dphoneno")
	private String dphoneno;
	@Column(name="dcity")
	private String dcity;
	@Column(name="davailability")
	private String davailability;
	@Column(name="dage")
	private int dage;
	@Column(name="dweight")
	private int dweight;
	
	
	public Donor() {}
	
	public Donor(String demail, String dfname, String dlname, String dbloodgroup, String dpassword, String dphoneno,
			String dcity, String davailability, int dage, int dweight) {
		super();
		this.demail = demail;
		this.dfname = dfname;
		this.dlname = dlname;
		this.dbloodgroup = dbloodgroup;
		this.dpassword = dpassword;
		this.dphoneno = dphoneno;
		this.dcity = dcity;
		this.davailability = davailability;
		this.dage = dage;
		this.dweight = dweight;
	}

	public String getDfname() {
		return dfname;
	}
	
	public void setDfname(String dfname) {
		this.dfname = dfname;
	}
	public String getDlname() {
		return dlname;
	}
	public void setDlname(String dlname) {
		this.dlname = dlname;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public String getDbloodgroup() {
		return dbloodgroup;
	}
	public void setDbloodgroup(String dbloodgroup) {
		this.dbloodgroup = dbloodgroup;
	}
	public String getDpassword() {
		return dpassword;
	}
	public void setDpassword(String dpassword) {
		this.dpassword = dpassword;
	}
	public String getDphoneno() {
		return dphoneno;
	}
	public void setDphoneno(String dphoneno) {
		this.dphoneno = dphoneno;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	public String getDavailability() {
		return davailability;
	}
	public void setDavailability(String davailability) {
		this.davailability = davailability;
	}
	public int getDage() {
		return dage;
	}
	public void setDage(int dage) {
		this.dage = dage;
	}
	public int getDweight() {
		return dweight;
	}
	public void setDweight(int dweight) {
		this.dweight = dweight;
	}
}
