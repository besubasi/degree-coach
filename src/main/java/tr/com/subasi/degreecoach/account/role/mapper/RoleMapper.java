package tr.com.subasi.degreecoach.account.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.account.role.entity.RoleEntity;
import tr.com.subasi.degreecoach.account.role.model.RoleModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper extends BaseMapper<RoleModel, RoleEntity> {

}
