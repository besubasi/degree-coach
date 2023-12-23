package tr.com.subasi.degreecoach.account.role.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.subasi.degreecoach.account.role.constant.RoleConstant;
import tr.com.subasi.degreecoach.account.role.model.RoleModel;
import tr.com.subasi.degreecoach.account.role.model.RoleSearchModel;
import tr.com.subasi.degreecoach.account.role.service.RoleService;
import tr.com.subasi.degreecoach.common.controller.GenericRestController;

@RestController
@RequestMapping(RoleConstant.REQUEST_MAPPING)
public class RoleRestController extends GenericRestController<RoleModel, RoleSearchModel> {

    public RoleRestController(RoleService service) {
        super(service);
    }
}