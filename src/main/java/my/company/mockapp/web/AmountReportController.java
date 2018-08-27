package my.company.mockapp.web;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.company.mockapp.dto.AmountReportDto;
import my.company.mockapp.forms.AmountReportForm;
import my.company.mockapp.forms.AmountReportShosaiForm;
import my.company.mockapp.service.AmountReportService;
import my.company.mockapp.service.MasterDataService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AmountReportController {
	
	private static final Logger logger = LoggerFactory.getLogger(AmountReportController.class);

	@Autowired
	HttpSession session;
	
    @Autowired
    MasterDataService masterService;

    @Autowired
    AmountReportService amountReportService;

    
	@RequestMapping(value = "/amount_report", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("start: amount_report");

		AmountReportForm form = (AmountReportForm)session.getAttribute("amountReportForm");
		if (form == null) {
			form = new AmountReportForm();
	        //詳細情報の設定(設置リスト)
	        form.setToritsukeList(new ArrayList<AmountReportShosaiForm>());
	        form.setTekkoList(new ArrayList<AmountReportShosaiForm>());
	        for (int i=0 ; i < 15 ; i++) {
	        	form.getToritsukeList().add(new AmountReportShosaiForm(new Integer(0)));
	        	form.getTekkoList().add(new AmountReportShosaiForm(new Integer(0)));
	        }
		}

        //プルダウンの設定
        model.addAttribute("kazeiKubunList", masterService.findMasterData("Z01"));
        model.addAttribute("hasuushoriKubunList", masterService.findMasterData("Z02"));
        model.addAttribute("hasuushoriKeitaiList", masterService.findMasterData("Z03"));

        model.addAttribute("form", form);
        
        session.setAttribute("amountReportForm", form);

        return "amount_report/index";
	}
	
	@RequestMapping(value = "/amount_report/search", method = RequestMethod.POST)
	public String search(@ModelAttribute AmountReportForm form, Model model, BindingResult result) {
		logger.info("start: /amount_report/search");

		String orderNo = form.getOrderNo();
		AmountReportDto dto = amountReportService.searchAmountReport(orderNo);
		form.setGyoseiku(dto.getGyoseiku());
		form.setBukkenmei(dto.getBukkenmei());
		form.setChoumei(dto.getChoumei());
		form.setKoujiShubetu(dto.getKoujiShubetu());

        //プルダウンの設定
        model.addAttribute("kazeiKubunList", masterService.findMasterData("Z01"));
        model.addAttribute("hasuushoriKubunList", masterService.findMasterData("Z02"));
        model.addAttribute("hasuushoriKeitaiList", masterService.findMasterData("Z03"));

        model.addAttribute("form", form);

        return "amount_report/index";
	}
	
	@RequestMapping(value = "/amount_report/parts_list", method = RequestMethod.POST)
	public String parts_list(@ModelAttribute AmountReportForm form, Model model, BindingResult result) {
		logger.info("start: /amount_report/parts_list");
		
		String orderNo = form.getOrderNo();
		AmountReportDto dto = amountReportService.searchAmountReport(orderNo);
		form.setGyoseiku(dto.getGyoseiku());
		form.setBukkenmei(dto.getBukkenmei());
		form.setChoumei(dto.getChoumei());
		form.setKoujiShubetu(dto.getKoujiShubetu());

        //プルダウンの設定
        model.addAttribute("kazeiKubunList", masterService.findMasterData("Z01"));
        model.addAttribute("hasuushoriKubunList", masterService.findMasterData("Z02"));
        model.addAttribute("hasuushoriKeitaiList", masterService.findMasterData("Z03"));

        model.addAttribute("form", form);
        session.setAttribute("amountReportForm", form);

        return "redirect:/parts_list";
	}	
	
	@RequestMapping(value = "/amount_report/save", method = RequestMethod.POST)
	public String save(@ModelAttribute AmountReportForm form, Model model, BindingResult result) {
		logger.info("start: /amount_report/save");
        return "redirect:/";
	}
	
}
