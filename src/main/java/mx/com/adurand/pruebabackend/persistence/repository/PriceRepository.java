package mx.com.adurand.pruebabackend.persistence.repository;

import mx.com.adurand.pruebabackend.persistence.entities.PriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository extends CrudRepository<PriceEntity, Long> {

    @Query("FROM PriceEntity p WHERE p.brandId = ?1 AND p.productId = ?2 AND p.startDate <= ?3 AND p.endDate >= ?3 ORDER BY p.priority DESC")
    List<PriceEntity> find(int brandId, int productId, LocalDateTime date);
}