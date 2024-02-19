package com.energysolution.mvp.repository;

import com.energysolution.mvp.model.DeviceModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeviceRepository extends JpaRepository<DeviceModel, Long> {


    /**
     * Finds a device by its unique identifier.
     *
     * @param deviceId The unique identifier of the device.
     * @return An Optional containing the found device or empty if no device found.
     */
    Optional<DeviceModel> findByIdentifier(String deviceId);

}

