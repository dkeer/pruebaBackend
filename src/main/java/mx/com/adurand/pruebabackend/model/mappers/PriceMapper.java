package mx.com.adurand.pruebabackend.model.mappers;

import mx.com.adurand.pruebabackend.model.dto.PriceDto;
import mx.com.adurand.pruebabackend.persistence.entities.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    default PriceDto toDto(PriceEntity price) {
        if (price == null) {
            return null;
        }

        PriceDto priceDto = new PriceDto();

        priceDto.setId(price.getId());
        priceDto.setBrandId(price.getBrandId());
        priceDto.setStartDate(price.getStartDate());
        priceDto.setEndDate(price.getEndDate());
        priceDto.setPriceList(price.getPriceList());
        priceDto.setProductId(price.getProductId());
        priceDto.setPriority(price.getPriority());
        priceDto.setPrice(price.getPrice());
        priceDto.setCurrency(price.getCurrency());

        return priceDto;
    }

    PriceEntity toEntity(PriceDto priceDto);
}