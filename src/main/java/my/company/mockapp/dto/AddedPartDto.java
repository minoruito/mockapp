package my.company.mockapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AddedPartDto {
	private String himokuCode;
	private String himokuCodeName1;
	private String himokuCodeName2;
	private String himokuCodeName3;
	private String himokuName;
	private double num;
	private String tani;
	
	public AddedPartDto() {
		
	}
	
	public AddedPartDto(String himokuCode, String himokuCodeName1, String himokuCodeName2, String himokuCodeName3, String himokuName, double num, String tani) {
		this.himokuCode = himokuCode;
		this.himokuCodeName1 = himokuCodeName1;
		this.himokuCodeName2 = himokuCodeName2;
		this.himokuCodeName3 = himokuCodeName3;
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

	public String getHimokuCodeName1() {
		return himokuCodeName1;
	}

	public void setHimokuCodeName1(String himokuCodeName1) {
		this.himokuCodeName1 = himokuCodeName1;
	}

	public String getHimokuCodeName2() {
		return himokuCodeName2;
	}

	public void setHimokuCodeName2(String himokuCodeName2) {
		this.himokuCodeName2 = himokuCodeName2;
	}

	public String getHimokuCodeName3() {
		return himokuCodeName3;
	}

	public void setHimokuCodeName3(String himokuCodeName3) {
		this.himokuCodeName3 = himokuCodeName3;
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
