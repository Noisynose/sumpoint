package com.sumpoint.application.entrant.api.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sumpoint.application.entrant.api.requests.EntrantUpload;
import com.sumpoint.application.entrant.api.requests.EntrantView;

/**
 * Implements methods to interact with entrants.
 */
@Component
public class EntrantServiceImpl implements EntrantService {    
    public EntrantServiceImpl() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(EntrantUpload entrant) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<EntrantView> getEntrants() {
        // TODO Auto-generated method stub
        return null;
    }
}
