package tr.com.subasi.degreecoach.app.country.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.app.country.entity.CountryEntity;
import tr.com.subasi.degreecoach.app.country.model.CountryModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper extends BaseMapper<CountryModel, CountryEntity> {
}

