package mx.com.adurand.pruebabackend.service.impl;

import mx.com.adurand.pruebabackend.model.dto.PriceDto;
import mx.com.adurand.pruebabackend.model.mappers.PriceMapper;
import mx.com.adurand.pruebabackend.persistence.entities.PriceEntity;
import mx.com.adurand.pruebabackend.persistence.repository.PriceRepository;
import mx.com.adurand.pruebabackend.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;

    public PriceServiceImpl(PriceRepository priceRepository, PriceMapper priceMapper) {
        this.priceRepository = priceRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public PriceDto getPrice(int brandId, int productId, LocalDateTime date) {
        PriceEntity price = priceRepository.find(brandId, productId, date).stream().findFirst().orElse(null);
        return priceMapper.toDto(price);
    }
}
