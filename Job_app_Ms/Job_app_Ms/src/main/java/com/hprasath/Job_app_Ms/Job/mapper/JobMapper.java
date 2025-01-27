package com.hprasath.Job_app_Ms.Job.mapper;

import com.hprasath.Job_app_Ms.Job.Job;
import com.hprasath.Job_app_Ms.Job.dto.JobDTO;
import com.hprasath.Job_app_Ms.Job.external.Company;
import com.hprasath.Job_app_Ms.Job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviews) {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReview(reviews);
        return jobDTO;
    }
}
