package tr.com.subasi.degreecoach.account.roleauthorityrel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.degreecoach.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleAuthorityRelSearchModel extends BaseSearchModel {

    private Long roleId, authorityId;
    private Boolean active;

}
