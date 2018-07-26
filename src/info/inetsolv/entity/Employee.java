package info.inetsolv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_TABLE",schema="SCOTT")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="EMP_ENO_SEQ")
	@SequenceGenerator(name="EMP_ENO_SEQ",sequenceName="EMP_ENO_SEQ",initialValue=1,allocationSize=1)
	@Column(name="EMPNO")
	private Integer employeeNumber;
	@Column(name="ENAME")
	private String employeeName;
	@Column(name="SALARY")
	private Double employeeSalary;
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
