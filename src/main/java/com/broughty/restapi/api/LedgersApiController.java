package com.broughty.restapi.api;

import com.broughty.restapi.model.Item;
import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-20T19:06:19.033239Z[Europe/London]", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.accounting.base-path:}")
public class LedgersApiController implements LedgersApi {

    private final NativeWebRequest request;

    @Autowired
    public LedgersApiController(NativeWebRequest request) {
        this.request = request;
    }

    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }


    @Override
    public ResponseEntity<List<Item>> getSalesItems(String ledgerId, String query, String queryStr) {
        return null;
    }
}
