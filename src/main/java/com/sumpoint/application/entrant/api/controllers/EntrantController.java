package com.sumpoint.application.entrant.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sumpoint.application.entrant.api.requests.EntrantUpload;
import com.sumpoint.application.entrant.api.requests.EntrantView;
import com.sumpoint.application.entrant.api.services.EntrantService;

/**
 * Defines REST methods to interact with entrants.
 */
@RestController
@RequestMapping("entrants")
public class EntrantController {
    private EntrantService entrantService;

    /**
     * Creates an instance of {@link EntrantController}.
     * @param entrantService An instance of {@link EntrantService}
     */
    public EntrantController(EntrantService entrantService) {
        this.entrantService = entrantService;
    }

    /**
     * Creates a new instance of {@link EntrantView}.
     * @param entrantUpload An instance of {@link EntrantUpload}.
     */
    @ResponseStatus(HttpStatus.OK)
    @PostMapping()
    public void create(@RequestBody EntrantUpload entrantUpload) {
        entrantService.add(entrantUpload);
    }

    /**
     * Gets all instances of {@link EntrantView}.
     * @return A collection of {@link EntrantView}.
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<EntrantView> get() {
        return entrantService.getEntrants();
    }
}
