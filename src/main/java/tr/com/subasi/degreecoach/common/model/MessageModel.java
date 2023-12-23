package tr.com.subasi.degreecoach.common.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import tr.com.subasi.degreecoach.common.enums.EnumMessageType;

import java.io.Serializable;
import java.util.List;

@Data
public class MessageModel implements Serializable {

    public MessageModel(EnumMessageType type, String key) {
        this.type = type;
        this.key = key;
    }

    public MessageModel(EnumMessageType type, String key, List<Object> parameters) {
        this(type, key);
        this.parameters = parameters;
    }

    @NotBlank
    private EnumMessageType type;
    @NotBlank
    private String key;
    private List<Object> parameters;


}
