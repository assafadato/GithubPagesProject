package io.swagger.api;

import io.swagger.model.Pet;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-07T09:20:41.226Z")

@Controller
public class DefaultApiController implements DefaultApi {



    public ResponseEntity<List<Pet>> rootGet( @Min(11) @Max(10000) @ApiParam(value = "number of pets to return", defaultValue = "11") @RequestParam(value = "limit", required = false, defaultValue="11") Integer limit) {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rootPost(@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rootPut(@ApiParam(value = "The pet JSON you want to post" ,required=true ) @RequestBody Pet pet) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
