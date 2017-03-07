package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-07T09:20:41.226Z")

@Api(value = "{petId}", description = "the {petId} API")
public interface PetIdApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sends the pet with pet Id", response = Void.class) })
    @RequestMapping(value = "/{petId}",
        produces = { "application/json", "text/html" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Void> petIdGet(@ApiParam(value = "ID of the pet",required=true ) @PathVariable("petId") String petId);

}
