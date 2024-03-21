package mx.com.adurand.pruebabackend.service;

import mx.com.adurand.pruebabackend.model.dto.PriceDto;

import java.time.LocalDateTime;

public interface PriceService {

    PriceDto getPrice(int brandId, int productId, LocalDateTime date);
}