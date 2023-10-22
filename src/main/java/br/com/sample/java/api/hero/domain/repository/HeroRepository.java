package br.com.sample.java.api.hero.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sample.java.api.hero.domain.entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
