package tr.com.subasi.degreecoach.account.role.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.degreecoach.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleSearchModel extends BaseSearchModel {

    private String code, name;
    private Boolean active;

}
