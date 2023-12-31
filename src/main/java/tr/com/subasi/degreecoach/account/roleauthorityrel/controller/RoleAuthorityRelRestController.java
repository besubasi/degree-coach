package tr.com.subasi.degreecoach.account.roleauthorityrel.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.degreecoach.account.roleauthorityrel.constant.RoleAuthorityRelConstant;
import tr.com.subasi.degreecoach.account.roleauthorityrel.model.RoleAuthorityRelModel;
import tr.com.subasi.degreecoach.account.roleauthorityrel.model.RoleAuthorityRelSearchModel;
import tr.com.subasi.degreecoach.account.roleauthorityrel.service.RoleAuthorityRelService;
import tr.com.subasi.degreecoach.common.controller.GenericRestController;

@RestController
@RequestMapping(RoleAuthorityRelConstant.REQUEST_MAPPING)
public class RoleAuthorityRelRestController extends GenericRestController<RoleAuthorityRelModel, RoleAuthorityRelSearchModel> {

    public RoleAuthorityRelRestController(RoleAuthorityRelService service) {
        super(service);
    }
}