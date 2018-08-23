package my.company.mockapp.forms;

import java.util.List;

import javax.validation.Valid;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.dto.BasicPartDto;

public class AmountReportShosaiForm {

	@Valid
	private Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

    
}
