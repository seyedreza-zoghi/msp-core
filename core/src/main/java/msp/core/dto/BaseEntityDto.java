package msp.core.dto;

import lombok.Getter;
import msp.core.model.GenericBaseEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link GenericBaseEntity}
 */
@Getter
public class BaseEntityDto implements Serializable {
    Long id;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Integer version;
}