package tr.com.subasi.degreecoach.account.userrolerel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.account.userrolerel.entity.UserRoleRelEntity;
import tr.com.subasi.degreecoach.account.userrolerel.mapper.UserRoleRelMapper;
import tr.com.subasi.degreecoach.account.userrolerel.model.UserRoleRelModel;
import tr.com.subasi.degreecoach.account.userrolerel.model.UserRoleRelSearchModel;
import tr.com.subasi.degreecoach.account.userrolerel.repository.UserRoleRelRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class UserRoleRelServiceImpl extends GenericServiceImpl<UserRoleRelModel, UserRoleRelSearchModel, UserRoleRelEntity> implements tr.com.subasi.degreecoach.account.userrolerel.service.UserRoleRelService {
    public UserRoleRelServiceImpl(UserRoleRelRepository repository, UserRoleRelMapper mapper) {
        super(repository, mapper);
    }
}