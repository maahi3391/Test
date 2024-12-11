package com.om.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Student", url = )
public interface StudentDataFeign {

}
