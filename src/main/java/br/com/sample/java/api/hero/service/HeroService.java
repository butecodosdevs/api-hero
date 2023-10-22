package br.com.sample.java.api.hero.service;

import java.util.List;

import br.com.sample.java.api.hero.service.dto.HeroDTO;

public interface HeroService extends CrudService<HeroDTO> {

    HeroDTO save(HeroDTO dto);

    HeroDTO getById(Long id);

    List<HeroDTO> getAll();

    HeroDTO update(Long id, HeroDTO input);

    void delete(Long id);

}
