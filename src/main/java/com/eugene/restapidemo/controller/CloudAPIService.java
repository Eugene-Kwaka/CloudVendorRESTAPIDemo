package com.eugene.restapidemo.controller;

import com.eugene.restapidemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController //-> Defines Controller class that handles REST API requests.
@RequestMapping("/cloudvendor")//-> This defines that the class maps all requests starting with "/cloudVendor
public class CloudAPIService {

    CloudVendor cloudVendor;

    /* This method returns takes the vendorId as its argument and returns an object of CloudVendor with all the details.
       Since we are getting details, we include the @GetMapping annotation.
       The GetMapping annotation takes in the "{vendorId}" value as a path variable for the URL.
       To get the CloudVendor details in the browser, I will write the URL path

     */
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
    }

    // POST MAPPING -> CREATE CLOUD VENDOR

    /*
    I create a CloudVendor object first.
    I will use this object as a parameter for the method to create cloudVendor objects.
    The object will be used as the request body for the api.
    * */
    @PostMapping
    // The @RequestBody annotation binds the request body to the cloudVendor object.
    // The object will be used as the request body in creation of the POST request.
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created successfully";
    }

   // PUT MAPPING -> UPDATE CLOUD VENDOR
    //@PutMapping("{vendorId}")
   @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor deleted successfully";
    }



}
