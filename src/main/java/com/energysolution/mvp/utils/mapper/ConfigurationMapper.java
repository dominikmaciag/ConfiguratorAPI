package com.energysolution.mvp.utils.mapper;

import com.energysolution.mvp.dto.ConfigurationReadDto;
import com.energysolution.mvp.model.ConfigurationModel;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class ConfigurationMapper {


    /**
     * Converts a ConfigurationModel entity to a ConfigurationReadDto.
     *
     * @param model The ConfigurationModel entity to convert.
     * @return The converted ConfigurationReadDto.
     */
    public ConfigurationReadDto toDto(ConfigurationModel model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = model.getCreationDate().format(formatter);
        return new ConfigurationReadDto(model.getConfiguration(), formattedDate);
    }
}