package com.rsjavasolutions.cache.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class CarResponse implements Serializable {
    private String uuid;
    private long id;
    private String band;
    private String model;
}
