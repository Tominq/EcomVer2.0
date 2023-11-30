package ecom.spring.library.service.impl;

import ecom.spring.library.model.City;
import ecom.spring.library.repository.CityRepository;
import ecom.spring.library.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
