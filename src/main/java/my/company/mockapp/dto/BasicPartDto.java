package my.company.mockapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BasicPartDto {
	private String himokuCode;
	private String himokuName;
	private double num;
	private String tani;
	
	public BasicPartDto() {
		
	}
	
	public BasicPartDto(String himokuCode, String himokuName, double num, String tani) {
		this.himokuCode = himokuCode;
		this.himokuName = himokuName;
		this.num = num;
		this.tani = tani;
	}
	public String getHimokuCode() {
		return himokuCode;
	}
	public void setHimokuCode(String himokuCode) {
		this.himokuCode = himokuCode;
	}
	public String getHimokuName() {
		return himokuName;
	}
	public void setHimokuName(String himokuName) {
		this.himokuName = himokuName;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public String getTani() {
		return tani;
	}
	public void setTani(String tani) {
		this.tani = tani;
	}
	
	
}
