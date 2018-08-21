package my.company.mockapp.forms;

import java.util.List;

import javax.validation.Valid;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.dto.BasicPartDto;

public class PartsListForm {

	@Valid
    private List<BasicPartDto> basicPartList;

	@Valid
    private List<AddedPartDto> addedPartList;

	@Valid
    private List<AddedPartDto> addedPartPopupList;

	public List<BasicPartDto> getBasicPartList() {
		return basicPartList;
	}

	public void setBasicPartList(List<BasicPartDto> basicPartList) {
		this.basicPartList = basicPartList;
	}

	public List<AddedPartDto> getAddedPartList() {
		return addedPartList;
	}

	public void setAddedPartList(List<AddedPartDto> addedPartList) {
		this.addedPartList = addedPartList;
	}

	public List<AddedPartDto> getAddedPartPopupList() {
		return addedPartPopupList;
	}

	public void setAddedPartPopupList(List<AddedPartDto> addedPartPopupList) {
		this.addedPartPopupList = addedPartPopupList;
	};

    
}
