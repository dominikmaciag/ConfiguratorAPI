package com.energysolution.mvp.repository;

import com.energysolution.mvp.model.ConfigurationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<ConfigurationModel, Long> {
}
