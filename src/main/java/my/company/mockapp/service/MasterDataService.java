package my.company.mockapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import my.company.mockapp.dto.MasterDataDto;

@Service
public class MasterDataService {

	private final MasterDataDto[] masterData = { 
			new MasterDataDto("A01", "01", "基本工事費"),
			new MasterDataDto("A01", "02", "内管"), 
			new MasterDataDto("A01", "03", "特別工事A"),

			new MasterDataDto("A02", "01", "15A"), 
			new MasterDataDto("A02", "02", "20A"),
			new MasterDataDto("A02", "03", "25A"), 
			new MasterDataDto("A02", "04", "32A"),

			new MasterDataDto("A03", "01", "カ所"), 
			new MasterDataDto("A03", "02", "個"),
			new MasterDataDto("A03", "03", "ｍ"), 
			new MasterDataDto("A03", "06", "ライン"),

			new MasterDataDto("B01", "02", "内管"),

			new MasterDataDto("B03", "01", "カ所"), 
			new MasterDataDto("B03", "02", "個"),
			new MasterDataDto("B03", "03", "ｍ"), 
			new MasterDataDto("B03", "04", "cｍ"),
			new MasterDataDto("B03", "05", "式"), 
			new MasterDataDto("B03", "06", "ライン"),

			new MasterDataDto("C03", "02", "個"), 
			new MasterDataDto("C03", "03", "ｍ"),
			new MasterDataDto("C03", "05", "式"),
		};

	public List<MasterDataDto> findMasterData(String masterDiv) {
		List<MasterDataDto> list = new ArrayList<MasterDataDto>();

		for (MasterDataDto dto : masterData) {
			if (dto.getMasterDiv().equals(masterDiv)) {
				list.add(dto);
			}
		}
		return list;

	}

	public MasterDataDto find(String masterDiv, String code) {
		MasterDataDto result = null;
		for (MasterDataDto dto : masterData) {
			if (dto.getMasterDiv().equals(masterDiv) && dto.getCode().equals(code)) {
				result = dto;
			}
		}
		return result;
	}

}
