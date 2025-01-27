package com.hprasath.Company_Ms.Company;


import com.hprasath.Company_Ms.Company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompany(Long id);
    Company getCompanyById(Long id);

    void updateCompanyRating(ReviewMessage reviewMessage);
}
