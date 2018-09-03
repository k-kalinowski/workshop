package com.github.workshop.service;

import com.github.workshop.service.dto.PartDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Part.
 */
public interface PartService {

    /**
     * Save a part.
     *
     * @param partDTO the entity to save
     * @return the persisted entity
     */
    PartDTO save(PartDTO partDTO);

    /**
     * Get all the parts.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<PartDTO> findAll(Pageable pageable);


    /**
     * Get the "id" part.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<PartDTO> findOne(Long id);

    /**
     * Delete the "id" part.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
