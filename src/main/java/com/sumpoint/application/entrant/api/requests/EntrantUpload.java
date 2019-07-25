package com.sumpoint.application.entrant.api.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntrantUpload {
    private int id;
    private String firstName;
    private String lastName;
    private String regionName;
    private String categoryName;
}
