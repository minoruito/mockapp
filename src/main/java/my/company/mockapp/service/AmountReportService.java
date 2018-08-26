package my.company.mockapp.service;

import org.springframework.stereotype.Service;

import my.company.mockapp.dto.AmountReportDto;

@Service
public class AmountReportService {
	private final AmountReportDto[] searchAmountReport = {
			new AmountReportDto("010101", "01", "物件名010101", "01", "01"),
			new AmountReportDto("020102", "02", "物件名020101", "01", "02"),
	};

	//報告書検索
	public AmountReportDto searchAmountReport(String orderNo){
		AmountReportDto result = new AmountReportDto("", "", "", "", "");
		for(AmountReportDto dto : searchAmountReport) {
			if (dto.getOrderNo().equals(orderNo)) {
				result = dto;
				break;
			}
		}
		return result;
	}	
}
