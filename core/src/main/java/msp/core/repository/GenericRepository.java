package msp.core.repository;

import msp.core.model.GenericBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericRepository<T extends GenericBaseEntity<ID>, ID extends Serializable> extends JpaRepository<T, ID> {
}