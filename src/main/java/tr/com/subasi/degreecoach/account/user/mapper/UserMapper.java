package tr.com.subasi.degreecoach.account.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tr.com.subasi.degreecoach.account.user.entity.UserEntity;
import tr.com.subasi.degreecoach.account.user.model.UserModel;
import tr.com.subasi.degreecoach.common.mapper.BaseMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends BaseMapper<UserModel, UserEntity> {
}
