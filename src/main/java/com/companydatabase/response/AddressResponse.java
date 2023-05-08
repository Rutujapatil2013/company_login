package com.companydatabase.response;

import com.companydatabase.entity.Company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
	private Long companyId;
    private String city;
    private String state;
    private String country;
    private Long pincode;
    private Boolean isDeleted;
    private Company company;
    
//	public Long getCompanyId() {
//		return companyId;
//	}
//	public void setCompanyId(Long companyId) {
//		this.companyId = companyId;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	public Long getPincode() {
//		return pincode;
//	}
//	public void setPincode(Long pincode) {
//		this.pincode = pincode;
//	}
//	public Company getCompany() {
//		return company;
//	}
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//	public Boolean getIsDeleted() {
//		return isDeleted;
//	}
//	public void setIsDeleted(Boolean isDeleted) {
//		this.isDeleted = isDeleted;
//	}
	
	
}
