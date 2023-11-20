package br.com.sample.java.api.hero.controller.response;

import java.io.Serializable;

import br.com.sample.java.api.hero.common.constant.Universe;
import br.com.sample.java.api.hero.service.dto.HeroDTO;

public class HeroResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7804146947218718153L;
	private Long id;
    private String name;
    private String codename;
    private Universe universe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public static HeroResponse fromDTO(HeroDTO hero) {
        HeroResponse response = new HeroResponse();
        response.setId(hero.getId());
        response.setName(hero.getName());
        response.setCodename(hero.getCodename());
        response.setUniverse(hero.getUniverse());
        return response;
    }
}
