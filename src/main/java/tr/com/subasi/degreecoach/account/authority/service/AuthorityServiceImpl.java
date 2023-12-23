package tr.com.subasi.degreecoach.account.authority.service;


import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.account.authority.entity.AuthorityEntity;
import tr.com.subasi.degreecoach.account.authority.mapper.AuthorityMapper;
import tr.com.subasi.degreecoach.account.authority.model.AuthorityModel;
import tr.com.subasi.degreecoach.account.authority.model.AuthoritySearchModel;
import tr.com.subasi.degreecoach.account.authority.repository.AuthorityRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class AuthorityServiceImpl extends GenericServiceImpl<AuthorityModel, AuthoritySearchModel, AuthorityEntity> implements AuthorityService {
    public AuthorityServiceImpl(AuthorityRepository repository, AuthorityMapper mapper) {
        super(repository, mapper);
    }
}