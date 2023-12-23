package tr.com.subasi.degreecoach.account.userrolerel.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.degreecoach.common.model.IdModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserRoleRelModel extends IdModel {

    @NotBlank
    private Long userId;
    @NotBlank
    private Long roleId;
    private Boolean active = Boolean.TRUE;

}
