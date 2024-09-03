package msp.core.model;

import lombok.Getter;
import lombok.Value;

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