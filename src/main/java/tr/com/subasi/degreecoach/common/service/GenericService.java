package tr.com.subasi.degreecoach.common.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import tr.com.subasi.degreecoach.common.model.IdModel;
import tr.com.subasi.degreecoach.common.model.BaseSearchModel;

import java.util.List;

@Validated
public interface GenericService<M extends IdModel, SM extends BaseSearchModel> {

    M save(@NotNull M model);

    void deleteById(@NotNull Long id);

    M getById(@NotNull Long id);

    List<M> getList(@NotNull SM searchModel);

    List<M> getPage(@NotNull SM searchModel);

}
