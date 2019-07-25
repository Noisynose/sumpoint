package com.sumpoint.application.entrant.api.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntrantView {
    private int id;
    private String firstName;
    private String lastName;
    private String category;
    private String region;
}
