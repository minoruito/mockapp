package my.company.mockapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MasterDataDto {

	private String masterDiv;
	private String code;
	private String value;
	
	public MasterDataDto(String masterDiv, String code, String value) {
		this.masterDiv = masterDiv;
		this.code = code;
		this.value = value;
	}
	
	public String getMasterDiv() {
		return masterDiv;
	}
	public void setMasterDiv(String masterDiv) {
		this.masterDiv = masterDiv;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
