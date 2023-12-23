package tr.com.subasi.degreecoach.account.authority.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.account.authority.entity.AuthorityEntity;
import tr.com.subasi.degreecoach.account.authority.model.AuthorityModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AuthorityMapper extends BaseMapper<AuthorityModel, AuthorityEntity> {

}
