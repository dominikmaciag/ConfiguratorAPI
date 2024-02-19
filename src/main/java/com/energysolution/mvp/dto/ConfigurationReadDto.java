package com.energysolution.mvp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ConfigurationReadDto {

    private String configuration;
    private String creationDate;
}
