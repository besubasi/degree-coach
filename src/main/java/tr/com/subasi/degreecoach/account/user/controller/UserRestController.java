package tr.com.subasi.degreecoach.account.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.degreecoach.account.user.constant.UserConstant;
import tr.com.subasi.degreecoach.account.user.model.UserModel;
import tr.com.subasi.degreecoach.account.user.service.UserService;
import tr.com.subasi.degreecoach.account.user.model.UserSearchModel;
import tr.com.subasi.degreecoach.common.controller.GenericRestController;

@RestController
@RequestMapping(UserConstant.REQUEST_MAPPING)
public class UserRestController extends GenericRestController<UserModel, UserSearchModel> {

    public UserRestController(UserService service) {
        super(service);
    }
}
