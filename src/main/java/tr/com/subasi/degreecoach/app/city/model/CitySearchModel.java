package tr.com.subasi.degreecoach.app.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.degreecoach.common.model.BaseSearchModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CitySearchModel extends BaseSearchModel {

    private Long countryId;
    private String name;
    private Boolean active;

}



