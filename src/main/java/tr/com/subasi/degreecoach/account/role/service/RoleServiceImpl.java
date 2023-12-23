package tr.com.subasi.degreecoach.account.role.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.account.role.entity.RoleEntity;
import tr.com.subasi.degreecoach.account.role.mapper.RoleMapper;
import tr.com.subasi.degreecoach.account.role.model.RoleModel;
import tr.com.subasi.degreecoach.account.role.model.RoleSearchModel;
import tr.com.subasi.degreecoach.account.role.repository.RoleRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class RoleServiceImpl extends GenericServiceImpl<RoleModel, RoleSearchModel, RoleEntity> implements RoleService {
    public RoleServiceImpl(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}