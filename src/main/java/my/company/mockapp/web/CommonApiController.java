package my.company.mockapp.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.company.mockapp.dto.ChoumeiDataDto;
import my.company.mockapp.dto.GyouseikuDataDto;
import my.company.mockapp.dto.MasterDataDto;
import my.company.mockapp.service.AddressDataService;
import my.company.mockapp.service.MasterDataService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class CommonApiController {
    
    private static final Logger logger = LoggerFactory.getLogger(CommonApiController.class);
    
    @Autowired
    MasterDataService masterService;

    @Autowired
    AddressDataService addressDataService;
    
    @RequestMapping(value = "/common/getMasterValue", method = RequestMethod.GET, produces="application/json")
    public MasterDataDto getMasterValue(String masterDiv, String code) {
        logger.info("Start /getMasterValue");
        MasterDataDto master = masterService.find(masterDiv, code);
        return master;
    }

    @RequestMapping(value = "/common/getGyouseikuValue", method = RequestMethod.GET, produces="application/json")
    public GyouseikuDataDto getGyouseikuValue(String gyouseikuCd) {
        logger.info("Start /getGyouseikuValue");
        GyouseikuDataDto gyouseikuDataDto = addressDataService.findGyoseikuData(gyouseikuCd);
        return gyouseikuDataDto;
    }

    @RequestMapping(value = "/common/getChoumeiValue", method = RequestMethod.GET, produces="application/json")
    public ChoumeiDataDto getChoumeiValue(String gyouseikuCd, String choumeiCd) {
        logger.info("Start /getChoumeiValue");
        ChoumeiDataDto choumeiDataDto = addressDataService.findChoumeiData(gyouseikuCd, choumeiCd);
        return choumeiDataDto;
    }

}
