/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-16T00:18:50.834Z")

@Api(value = "findEmployeeDetails", description = "the findEmployeeDetails API")
public interface FindEmployeeDetailsApi {

    @ApiOperation(value = "Find employee by ID", nickname = "getEmployeeDetails", notes = "Returns a single Employee", response = Employee.class, tags={ "employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Employee.class),
        @ApiResponse(code = 400, message = "Invalid Employee ID supplied"),
        @ApiResponse(code = 404, message = "Employee not found") })
    @RequestMapping(value = "/findEmployeeDetails/{employeeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Employee> getEmployeeDetails(@ApiParam(value = "ID of Employee to return",required=true) @PathVariable("employeeId") Long employeeId);

}
