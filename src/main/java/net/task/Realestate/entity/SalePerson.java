package net.task.Realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "saleperson")
public class SalePerson {


	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name ="s_id")
	    private int sid;
	   @Size(min=1,message="required")  
	    @Column(name = "saleperson_name")
	    private String salepersonName;
	    
	    @Column(name = "reg_no")
	    private String regNo;
	
	    @Column(name = "reg_sdate")
	    private String regSdate;
	    
	    @Column(name = "reg_edate")
	    private String regEdate;
	    
	    @Column(name = "estate_aname")
	    private String estateAname;
	    
	    @Column(name = "agent_lno")
	    private String agentLno;

	    public SalePerson() {
			super();
		}
	
		public SalePerson(String salepersonName, String regNo, String regSdate, String regEdate, String estateAname,
				String agentLno) {
			super();
			this.salepersonName = salepersonName;
			this.regNo = regNo;
			this.regSdate = regSdate;
			this.regEdate = regEdate;
			this.estateAname = estateAname;
			this.agentLno = agentLno;
		}

		public SalePerson(int sid, String salepersonName, String regNo, String regSdate, String regEdate,
				String estateAname, String agentLno) {
			super();
			this.sid = sid;
			this.salepersonName = salepersonName;
			this.regNo = regNo;
			this.regSdate = regSdate;
			this.regEdate = regEdate;
			this.estateAname = estateAname;
			this.agentLno = agentLno;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSalepersonName() {
			return salepersonName;
		}

		public void setSalepersonName(String salepersonName) {
			this.salepersonName = salepersonName;
		}

		public String getRegNo() {
			return regNo;
		}

		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}

		public String getRegSdate() {
			return regSdate;
		}

		public void setRegSdate(String regSdate) {
			this.regSdate = regSdate;
		}

		public String getRegEdate() {
			return regEdate;
		}

		public void setRegEdate(String regEdate) {
			this.regEdate = regEdate;
		}

		public String getEstateAname() {
			return estateAname;
		}

		public void setEstateAname(String estateAname) {
			this.estateAname = estateAname;
		}

		public String getAgentLno() {
			return agentLno;
		}

		public void setAgentLno(String agentLno) {
			this.agentLno = agentLno;
		}

		@Override
		public String toString() {
			return "SalePerson [sid=" + sid + ", salepersonName=" + salepersonName + ", regNo=" + regNo + ", regSdate="
					+ regSdate + ", regEdate=" + regEdate + ", estateAname=" + estateAname + ", agentLno=" + agentLno
					+ "]";
		}

		
	
	
	
	
}
