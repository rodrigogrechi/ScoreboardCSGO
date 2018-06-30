package br.com.rodrigogrechi.scoreboardcsgo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Team {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("crest")
    @Expose
    private String crest;
    @SerializedName("result")
    @Expose
    private Integer result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Team(String name, String crest, Integer result) {
        this.name = name;
        this.crest = crest;
        this.result = result;
    }
}
