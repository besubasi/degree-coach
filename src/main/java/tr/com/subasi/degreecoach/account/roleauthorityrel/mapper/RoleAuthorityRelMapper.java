package tr.com.subasi.degreecoach.account.roleauthorityrel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.degreecoach.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleAuthorityRelMapper extends BaseMapper<RoleAuthorityRelModel, RoleAuthorityRelEntity> {

}
