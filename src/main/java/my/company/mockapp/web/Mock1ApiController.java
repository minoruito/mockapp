package my.company.mockapp.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.dto.BasicPartDto;
import my.company.mockapp.service.PartsListService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class Mock1ApiController {
	
	private static final Logger logger = LoggerFactory.getLogger(Mock1ApiController.class);
	

    @Autowired
    PartsListService service;
	
	@RequestMapping(value = "/get_basic_parts", method = RequestMethod.GET, produces="application/json")
    public List<BasicPartDto> getBasicParts() {
        logger.info("Start /get_basic_parts");
        
        List<BasicPartDto> basicPartsList = service.getBasicParts();
        return basicPartsList;
    }
	
	@RequestMapping(value = "/get_add_part", method = RequestMethod.GET, produces="application/json")
    public AddedPartDto getAddPart(String code) {
        logger.info("Start /get_add_part");
        
        AddedPartDto addedPartDto = service.getAddedPart(code);
        return addedPartDto;
    }

	@RequestMapping(value = "/search_add_parts", method = RequestMethod.GET, produces="application/json")
    public List<BasicPartDto> getBasicParts() {
        logger.info("Start /get_basic_parts");
        
        List<BasicPartDto> basicPartsList = service.getBasicParts();
        return basicPartsList;
    }

}

