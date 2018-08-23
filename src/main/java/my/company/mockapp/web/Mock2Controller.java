package my.company.mockapp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.company.mockapp.forms.AmountReportForm;
import my.company.mockapp.service.MasterDataService;
import my.company.mockapp.service.PartsListService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class Mock2Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Mock2Controller.class);
	

    @Autowired
    PartsListService service;
	
    @Autowired
    MasterDataService masterService;
    
	@RequestMapping(value = "/amount_report", method = RequestMethod.GET)
	public String parts_list(Model model) {
		logger.info("start: amount_report");

        AmountReportForm form = new AmountReportForm();
        model.addAttribute("form", form);

        return "amount_report/index";
	}	
	
}
