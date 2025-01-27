package com.hprasath.Job_app_Ms.Job;

import com.hprasath.Job_app_Ms.Job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);
    JobDTO getJobById(Long id);
    boolean deleteJob(Long id);
    boolean updateJob(Long id,Job job);
}
