package tr.com.subasi.degreecoach.app.city.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.app.city.entity.CityEntity;
import tr.com.subasi.degreecoach.app.city.model.CityModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CityMapper extends BaseMapper<CityModel, CityEntity> {
}

