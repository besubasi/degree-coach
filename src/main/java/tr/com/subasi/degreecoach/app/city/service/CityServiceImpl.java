package tr.com.subasi.degreecoach.app.city.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.app.city.entity.CityEntity;
import tr.com.subasi.degreecoach.app.city.mapper.CityMapper;
import tr.com.subasi.degreecoach.app.city.model.CityModel;
import tr.com.subasi.degreecoach.app.city.model.CitySearchModel;
import tr.com.subasi.degreecoach.app.city.repository.CityRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class CityServiceImpl extends GenericServiceImpl<CityModel, CitySearchModel, CityEntity> implements tr.com.subasi.degreecoach.app.city.service.CityService {
    public CityServiceImpl(CityRepository repository, CityMapper mapper) {
        super(repository, mapper);
    }
}
