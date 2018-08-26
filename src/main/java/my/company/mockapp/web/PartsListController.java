package my.company.mockapp.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.forms.PartsListForm;
import my.company.mockapp.forms.PartsListSearchForm;
import my.company.mockapp.service.MasterDataService;
import my.company.mockapp.service.PartsListService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class PartsListController {
	
	private static final Logger logger = LoggerFactory.getLogger(PartsListController.class);
	

    @Autowired
    PartsListService service;
	
    @Autowired
    MasterDataService masterService;
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/parts_list", method = RequestMethod.GET)
	public String parts_list(Model model) {
		logger.info("start: parts_list");
		
		
        PartsListForm form = new PartsListForm();
        
        //追加清算項目一覧の設定
        List<AddedPartDto> addedPartsPopupList = service.getAddedParts();
        form.setAddedPartPopupList(addedPartsPopupList);
        
        model.addAttribute("form", form);

        //増設・位置替え・撤去工事タブ
        PartsListSearchForm searchForm1 = new PartsListSearchForm();
        searchForm1.setBunruiList(masterService.findMasterData("A01"));
        searchForm1.setKoukeiList(masterService.findMasterData("A02"));
        searchForm1.setTaniList(masterService.findMasterData("A03"));
        
        model.addAttribute("searchForm1", searchForm1);

        //共通(ガス栓・付帯工事)タブ
        PartsListSearchForm searchForm2 = new PartsListSearchForm();
        searchForm1.setBunruiList(masterService.findMasterData("A01"));
        searchForm1.setKoukeiList(masterService.findMasterData("A02"));
        searchForm1.setTaniList(masterService.findMasterData("B03"));
        
        model.addAttribute("searchForm2", searchForm2);
        
        return "parts_list/index";
	}	
	
}
