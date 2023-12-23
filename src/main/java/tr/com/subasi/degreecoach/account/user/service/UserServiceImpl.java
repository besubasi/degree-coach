package tr.com.subasi.degreecoach.account.user.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.degreecoach.account.user.model.UserModel;
import tr.com.subasi.degreecoach.account.user.entity.UserEntity;
import tr.com.subasi.degreecoach.account.user.mapper.UserMapper;
import tr.com.subasi.degreecoach.account.user.model.UserSearchModel;
import tr.com.subasi.degreecoach.account.user.repository.UserRepository;
import tr.com.subasi.degreecoach.common.service.GenericServiceImpl;

@Service
public class UserServiceImpl extends GenericServiceImpl<UserModel, UserSearchModel, UserEntity> implements UserService {
    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
