package tr.com.subasi.degreecoach.account.userrolerel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.degreecoach.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserRoleRelMapper extends BaseMapper<UserRoleRelModel, UserRoleRelEntity> {

}
