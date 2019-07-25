package com.sumpoint.application.entrant.api.services;

import java.util.List;

import com.sumpoint.application.entrant.api.requests.EntrantUpload;
import com.sumpoint.application.entrant.api.requests.EntrantView;

/**
 * Defines methods to interact with entrants.
 */
public interface EntrantService {
    /**
     * Adds a new {@link EntrantUpload} to the system.
     * @param entrant An instance of {@link EntrantUpload}.
     */
    void add(EntrantUpload entrant);
    
    /**
     * Gets a collection of {@link EntrantView}.
     * @return A collection of {@link EntrantView}.
     */
    List<EntrantView> getEntrants();
}
