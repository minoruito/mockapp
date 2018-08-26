package my.company.mockapp.forms;


import javax.validation.Valid;


public class AmountReportShosaiForm {

	@Valid
	private Integer num;

	public AmountReportShosaiForm() {
		
	}
	public AmountReportShosaiForm(Integer num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

    
}
