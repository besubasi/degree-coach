package tr.com.subasi.degreecoach.app.country.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.degreecoach.app.country.model.CountryModel;
import tr.com.subasi.degreecoach.app.country.model.CountrySearchModel;
import tr.com.subasi.degreecoach.app.country.service.CountryService;
import tr.com.subasi.degreecoach.common.controller.GenericRestController;

import static tr.com.subasi.degreecoach.app.country.constant.CountryConstant.REQUEST_MAPPING;

@RestController
@RequestMapping(REQUEST_MAPPING)
public class CountryRestController extends GenericRestController<CountryModel, CountrySearchModel> {

    public CountryRestController(CountryService service) {
        super(service);
    }
}
