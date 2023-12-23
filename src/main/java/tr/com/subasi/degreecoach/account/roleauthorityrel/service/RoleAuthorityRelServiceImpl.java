package tr.com.subasi.degreecoach.account.roleauthorityrel.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.account.roleauthorityrel.entity.RoleAuthorityRelEntity;
import tr.com.subasi.degreecoach.account.roleauthorityrel.mapper.RoleAuthorityRelMapper;
import tr.com.subasi.degreecoach.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.degreecoach.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.degreecoach.account.roleauthorityrel.repository.RoleAuthorityRelRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class RoleAuthorityRelServiceImpl extends GenericServiceImpl<RoleAuthorityRelModel, RoleAuthorityRelSearchModel, RoleAuthorityRelEntity> implements tr.com.subasi.degreecoach.account.roleauthorityrel.service.RoleAuthorityRelService {
    public RoleAuthorityRelServiceImpl(RoleAuthorityRelRepository repository, RoleAuthorityRelMapper mapper) {
        super(repository, mapper);
    }
}