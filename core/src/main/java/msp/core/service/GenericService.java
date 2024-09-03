package msp.core.service;

import msp.core.model.GenericBaseEntity;
import msp.core.repository.GenericRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericService<T extends GenericBaseEntity<ID>, ID extends Serializable> {

    private final GenericRepository<T, ID> repository;

    protected GenericService(GenericRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
