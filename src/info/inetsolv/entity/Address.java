package info.inetsolv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TABLE",schema="SCOTT")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="AID_PK_SEQ")
	@SequenceGenerator(name="AID_PK_SEQ",sequenceName="ADDRESS_AID_SEQ",initialValue=1,allocationSize=1)
	@Column(name="AID")
	private Integer addressId;
	@Column(name="CITY")
	private String CityName;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
}