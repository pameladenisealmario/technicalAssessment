package com.technical.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Id {
    private String $oid;

    public Id() {
    }

    public Id(String $oid) {
        this.$oid = $oid;
    }

    public String get$oid() {
        return $oid;
    }

    public void set$oid(String $oid) {
        this.$oid = $oid;
    }

    @Override
    public String toString() {
        return "_id:{" +
                "$oid=" + $oid +
                "'}';";
    }
}