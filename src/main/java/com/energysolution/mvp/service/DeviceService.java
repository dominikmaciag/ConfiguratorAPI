package com.energysolution.mvp.service;


import com.energysolution.mvp.model.DeviceModel;
import com.energysolution.mvp.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    /**
     * Finds an existing device by its identifier or creates a new one if it does not exist.
     *
     * @param deviceId The unique identifier of the device.
     * @return The found or newly created DeviceModel object.
     */
    public DeviceModel findOrCreateDevice(String deviceId) {
        return deviceRepository.findByIdentifier(deviceId)
                .orElseGet(() -> createNewDevice(deviceId));
    }

    /**
     * Creates a new device entity with the given identifier.
     *
     * @param deviceId The unique identifier for the new device.
     * @return The newly created DeviceModel object.
     */
    private DeviceModel createNewDevice(String deviceId) {
        DeviceModel newDevice = new DeviceModel();
        newDevice.setIdentifier(deviceId);
        return deviceRepository.save(newDevice);
    }

}
