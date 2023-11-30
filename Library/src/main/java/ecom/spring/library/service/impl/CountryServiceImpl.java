package ecom.spring.library.service.impl;

import ecom.spring.library.model.Country;
import ecom.spring.library.repository.CountryRepository;
import ecom.spring.library.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
