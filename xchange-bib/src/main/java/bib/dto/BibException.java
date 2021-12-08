package bib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import si.mazi.rescu.HttpStatusExceptionSupport;

import java.util.List;
import java.util.Map;

public class BibException extends HttpStatusExceptionSupport{
    private final int code;

    private Map<String, List<String>> headers;

    public BibException(@JsonProperty("code") int code, @JsonProperty("msg") String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
