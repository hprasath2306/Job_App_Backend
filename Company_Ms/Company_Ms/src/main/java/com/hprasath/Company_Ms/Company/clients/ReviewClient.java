package com.hprasath.Company_Ms.Company.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "REVIEW-MS", url = "${review-service.url}")
public interface ReviewClient {

    @GetMapping("/reviews/averageRating")
    Double getAverageRating(@RequestParam("companyId") Long companyId);
}
