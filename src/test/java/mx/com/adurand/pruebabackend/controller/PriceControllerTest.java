package mx.com.adurand.pruebabackend.controller;

import mx.com.adurand.pruebabackend.model.dto.PriceDto;
import mx.com.adurand.pruebabackend.service.PriceService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.hamcrest.Matchers;

import java.math.BigDecimal;
import java.time.LocalDateTime;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PriceController.class)
public class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceService priceService;

    @Test
    public void testGetPricesCase1() throws Exception {
        PriceDto testPrice = new PriceDto();

        testPrice.setId(1L);
        testPrice.setBrandId(1);
        testPrice.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0));
        testPrice.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59));
        testPrice.setPriceList(1);
        testPrice.setProductId(35455);
        testPrice.setPriority(0);
        testPrice.setPrice(new BigDecimal("35.50"));
        testPrice.setCurrency("EUR");

        Mockito.when(priceService.getPrice(1, 35455, LocalDateTime.parse("2020-06-14T10:00:00"))).thenReturn(testPrice);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/price?brandId=1&productId=35455&date=2020-06-14T10:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(testPrice.getId().intValue())))
                .andExpect(jsonPath("$.brandId", Matchers.is(testPrice.getBrandId())))
                .andExpect(jsonPath("$.priceList", Matchers.is(testPrice.getPriceList())))
                .andExpect(jsonPath("$.productId", Matchers.is(testPrice.getProductId())))
                .andExpect(jsonPath("$.priority", Matchers.is(testPrice.getPriority())))
                .andExpect(jsonPath("$.price", Matchers.is(testPrice.getPrice().doubleValue())))
                .andExpect(jsonPath("$.currency", Matchers.is(testPrice.getCurrency())));
    }
    @Test
    public void testGetPricesCase2() throws Exception {
        PriceDto testPrice = new PriceDto();

        testPrice.setId(1L);
        testPrice.setBrandId(1);
        testPrice.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0));
        testPrice.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59));
        testPrice.setPriceList(1);
        testPrice.setProductId(35455);
        testPrice.setPriority(0);
        testPrice.setPrice(new BigDecimal("35.50"));
        testPrice.setCurrency("EUR");

        Mockito.when(priceService.getPrice(1, 35455, LocalDateTime.parse("2020-06-14T16:00:00"))).thenReturn(testPrice);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/price?brandId=1&productId=35455&date=2020-06-14T16:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(testPrice.getId().intValue())))
                .andExpect(jsonPath("$.brandId", Matchers.is(testPrice.getBrandId())))
                .andExpect(jsonPath("$.priceList", Matchers.is(testPrice.getPriceList())))
                .andExpect(jsonPath("$.productId", Matchers.is(testPrice.getProductId())))
                .andExpect(jsonPath("$.priority", Matchers.is(testPrice.getPriority())))
                .andExpect(jsonPath("$.price", Matchers.is(testPrice.getPrice().doubleValue())))
                .andExpect(jsonPath("$.currency", Matchers.is(testPrice.getCurrency())));
    }
    @Test
    public void testGetPricesCase3() throws Exception {
        PriceDto testPrice = new PriceDto();

        testPrice.setId(1L);
        testPrice.setBrandId(1);
        testPrice.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0));
        testPrice.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59));
        testPrice.setPriceList(1);
        testPrice.setProductId(35455);
        testPrice.setPriority(0);
        testPrice.setPrice(new BigDecimal("35.50"));
        testPrice.setCurrency("EUR");

        Mockito.when(priceService.getPrice(1, 35455, LocalDateTime.parse("2020-06-14T21:00:00"))).thenReturn(testPrice);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/price?brandId=1&productId=35455&date=2020-06-14T21:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(testPrice.getId().intValue())))
                .andExpect(jsonPath("$.brandId", Matchers.is(testPrice.getBrandId())))
                .andExpect(jsonPath("$.priceList", Matchers.is(testPrice.getPriceList())))
                .andExpect(jsonPath("$.productId", Matchers.is(testPrice.getProductId())))
                .andExpect(jsonPath("$.priority", Matchers.is(testPrice.getPriority())))
                .andExpect(jsonPath("$.price", Matchers.is(testPrice.getPrice().doubleValue())))
                .andExpect(jsonPath("$.currency", Matchers.is(testPrice.getCurrency())));
    }
    @Test
    public void testGetPricesCase4() throws Exception {
        PriceDto testPrice = new PriceDto();

        testPrice.setId(1L);
        testPrice.setBrandId(1);
        testPrice.setStartDate(LocalDateTime.of(2020, 6, 15, 0, 0));
        testPrice.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 0));
        testPrice.setPriceList(3);
        testPrice.setProductId(35455);
        testPrice.setPriority(1);
        testPrice.setPrice(new BigDecimal("30.50"));
        testPrice.setCurrency("EUR");

        Mockito.when(priceService.getPrice(1, 35455, LocalDateTime.parse("2023-06-15T10:00:00"))).thenReturn(testPrice);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/price?brandId=1&productId=35455&date=2023-06-15T10:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(testPrice.getId().intValue())))
                .andExpect(jsonPath("$.brandId", Matchers.is(testPrice.getBrandId())))
                .andExpect(jsonPath("$.priceList", Matchers.is(testPrice.getPriceList())))
                .andExpect(jsonPath("$.productId", Matchers.is(testPrice.getProductId())))
                .andExpect(jsonPath("$.priority", Matchers.is(testPrice.getPriority())))
                .andExpect(jsonPath("$.price", Matchers.is(testPrice.getPrice().doubleValue())))
                .andExpect(jsonPath("$.currency", Matchers.is(testPrice.getCurrency())));
    }
    @Test
    public void testGetPricesCase5() throws Exception {
        PriceDto testPrice = new PriceDto();

        testPrice.setId(2L);
        testPrice.setBrandId(1);
        testPrice.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0));
        testPrice.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59));
        testPrice.setPriceList(4);
        testPrice.setProductId(35455);
        testPrice.setPriority(1);
        testPrice.setPrice(new BigDecimal("38.95"));
        testPrice.setCurrency("EUR");

        Mockito.when(priceService.getPrice(1, 35455, LocalDateTime.parse("2023-06-16T21:00:00"))).thenReturn(testPrice);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/price?brandId=1&productId=35455&date=2023-06-16T21:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(testPrice.getId().intValue())))
                .andExpect(jsonPath("$.brandId", Matchers.is(testPrice.getBrandId())))
                .andExpect(jsonPath("$.priceList", Matchers.is(testPrice.getPriceList())))
                .andExpect(jsonPath("$.productId", Matchers.is(testPrice.getProductId())))
                .andExpect(jsonPath("$.priority", Matchers.is(testPrice.getPriority())))
                .andExpect(jsonPath("$.price", Matchers.is(testPrice.getPrice().doubleValue())))
                .andExpect(jsonPath("$.currency", Matchers.is(testPrice.getCurrency())));
    }

}