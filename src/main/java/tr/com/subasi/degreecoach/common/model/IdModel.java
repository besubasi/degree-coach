package tr.com.subasi.degreecoach.common.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class IdModel {

    private Long id;

}
