package tr.com.subasi.degreecoach.common.model;


import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BaseSearchModel extends IdModel {

}