package com.sumpoint.application.entrant.core.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrant {
    private int id;
    private String firstName;
    private String lastName;
    private EntrantCategory category;
    private EntrantRegion region;
}
