package msp.core.mapper;

import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * this mapper a model to Entity and inverse
 * @param <E> is Entity
 * @param <D> is Dto
 */
@Mapper
public interface GenericMapper<E, D> {
    D toDto(E source);
    E toEntity(D dto);
    default List<D> toDtoList(List<E> sourceList) {
        return sourceList.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
    default List<E> toEntityList(List<D> dtoList) {
        return dtoList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
