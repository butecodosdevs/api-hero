package br.com.sample.java.api.hero.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.sample.java.api.hero.controller.request.HeroRequest;
import br.com.sample.java.api.hero.controller.response.HeroResponse;
import br.com.sample.java.api.hero.service.HeroService;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    private final HeroService heroService;

    
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HeroResponse create(@RequestBody HeroRequest request) {
        return HeroResponse.fromDTO(heroService.save(request.toDTO()));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HeroResponse findById(@PathVariable("id") Long id) {
        return HeroResponse.fromDTO(
                heroService.getById(id));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HeroResponse> findAll(@RequestParam(value = "universe", required = false) String universe) {
        return heroService.getAll().stream()
                .map(HeroResponse::fromDTO).collect(Collectors.toList());
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HeroResponse update(@PathVariable("id") Long id, @RequestBody HeroRequest request) {
        return HeroResponse.fromDTO(
                heroService.update(id, request.toDTO()));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        heroService.delete(id);
    }
}
