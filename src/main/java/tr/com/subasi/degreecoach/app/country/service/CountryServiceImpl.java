package tr.com.subasi.degreecoach.app.country.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.app.country.entity.CountryEntity;
import tr.com.subasi.degreecoach.app.country.mapper.CountryMapper;
import tr.com.subasi.degreecoach.app.country.model.CountryModel;
import tr.com.subasi.degreecoach.app.country.model.CountrySearchModel;
import tr.com.subasi.degreecoach.app.country.repository.CountryRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class CountryServiceImpl extends GenericServiceImpl<CountryModel, CountrySearchModel, CountryEntity> implements tr.com.subasi.degreecoach.app.country.service.CountryService {
    public CountryServiceImpl(CountryRepository repository, CountryMapper mapper) {
        super(repository, mapper);
    }
}
