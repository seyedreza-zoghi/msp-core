package msp.core.dto;

import lombok.Getter;
import msp.core.model.BaseEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link BaseEntity}
 */
@Getter
public class BaseEntityDto implements Serializable {
    Long id;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Integer version;
}